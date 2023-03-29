package ru.tinkoff.edu.java.bot.service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.response.SendResponse;
import org.springframework.stereotype.Service;
import ru.tinkoff.edu.java.bot.configuration.BotConfig;
import ru.tinkoff.edu.java.bot.service.command.Command;

import java.util.List;

@Service
public class StarterBot implements Bot{
    private final TelegramBot bot;
    private final ListComands listComands;

    public StarterBot(BotConfig botConfig, ListComands listComands) {
        this.bot = new TelegramBot(botConfig.token());
        this.listComands = listComands;
    }


    @Override
    public int process(List<Update> updates) {
        updates.forEach(update -> {
            Message message = update.message();
            if(message != null) {
//                List<Command> commands = listComands.getCommandList();
//                Command command1 =
                listComands.getCommandList().forEach(command -> {
                    if(message.text().equals(command.command())){
                        SendResponse response = bot.execute(command.handle(update));
                    }
                });


                // Отправка сообщений
//                long chatId = message.chat().id();
//                SendResponse response = bot.execute(new SendMessage(chatId, "Hello!"));
//                StartCommand startCommand = new StartCommand();
//                if (message.text().equals(startCommand.command())){
//                    SendMessage sendMessage = startCommand.handle(update);
//                    SendResponse sendResponse = bot.execute(sendMessage);
//                }
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
