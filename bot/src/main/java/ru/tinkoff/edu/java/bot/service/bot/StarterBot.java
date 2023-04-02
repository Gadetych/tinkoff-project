package ru.tinkoff.edu.java.bot.service.bot;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.request.SetMyCommands;
import com.pengrad.telegrambot.response.SendResponse;
import org.springframework.stereotype.Service;
import ru.tinkoff.edu.java.bot.configuration.BotConfig;
import ru.tinkoff.edu.java.bot.service.commands.ListComands;
import ru.tinkoff.edu.java.bot.service.commands.Command;

import java.util.ArrayList;
import java.util.List;

@Service
public class StarterBot implements Bot {
    private final TelegramBot bot;
    private final ListComands listComands;

    public StarterBot(BotConfig botConfig, ListComands listComands) {
        this.bot = new TelegramBot(botConfig.token());
        this.listComands = listComands;
        menuComands();
    }

    private void menuComands() {
        BotCommand[] botCommand = new BotCommand[listComands.getCommandList().size()];
        List<BotCommand> list = new ArrayList<>();
        for(Command command : listComands.getCommandList()){
            list.add(command.toApiCommand());
        }
        SetMyCommands setMyCommands = new SetMyCommands(list.toArray(botCommand));
        bot.execute(setMyCommands);
    }


    @Override
    public int process(List<Update> updates) {
        updates.forEach(update -> {
            Message message = update.message();
            if(message != null) {
                SendResponse sendResponse = null;
                for (Command c : listComands.getCommandList()){
                    if(message.text().equals(c.command())){
                         sendResponse = bot.execute(c.handle(update));
                    }
                }
                if(sendResponse == null){
                   sendResponse = bot.execute(new SendMessage(message.chat().id(), "неизвестная команда, используйте /help"));
                }
            }
        });
        return 0;
    }

    @Override
    public void start() {
        bot.setUpdatesListener(updates -> {
            process(updates);
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });


    }

    @Override
    public void close() {

    }
}
