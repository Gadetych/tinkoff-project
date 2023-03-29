package ru.tinkoff.edu.java.bot.service;

import org.springframework.stereotype.Component;
import ru.tinkoff.edu.java.bot.service.command.*;

import java.util.List;

@Component
public class ListComands {
    private final List<Command> commandList;

    public ListComands(StartCommand start, HelpCommand help, TrackCommand track,
                       UntrackCommand untrack, ListCommand listCommand) {
        this.commandList = List.of(start, help, track, untrack, listCommand);
    }

    public List<Command> getCommandList() {
        return commandList;
    }
}
