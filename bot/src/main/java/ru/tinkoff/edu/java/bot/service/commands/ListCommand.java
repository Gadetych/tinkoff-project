package ru.tinkoff.edu.java.bot.service.commands;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import org.springframework.stereotype.Component;

@Component
public class ListCommand implements Command{
    @Override
    public String command() {
        return "/list";
    }

    @Override
    public String description() {
        return "показать отслеживаемые ссылки";
    }

    @Override
    public SendMessage handle(Update update) {
        return new SendMessage(update.message().chat().id(),"список отслеживаемых ссылок");
    }
}
