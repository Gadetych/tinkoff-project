package ru.tinkoff.edu.java.bot.service.command;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import org.springframework.stereotype.Component;

@Component
public class StartCommand implements Command{
    @Override
    public String command() {
        return "/start";
    }

    @Override
    public String description() {
        return "регистрация пользователя";
    }

    @Override
    public SendMessage handle(Update update) {
        return new SendMessage(update.message().chat().id(),"пользователь зарегестрирован");
    }
}
