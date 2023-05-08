package ru.tinkoff.edu.java.bot.service.commands;

import java.util.List;
import org.springframework.stereotype.Component;
import ru.tinkoff.edu.java.bot.service.commands.impl.HelpCommand;
import ru.tinkoff.edu.java.bot.service.commands.impl.ListCommand;
import ru.tinkoff.edu.java.bot.service.commands.impl.StartCommand;
import ru.tinkoff.edu.java.bot.service.commands.impl.TrackCommand;
import ru.tinkoff.edu.java.bot.service.commands.impl.UntrackCommand;

@Component
public class CommandList {
    private final List<Command> commandList;

    public CommandList(
        StartCommand start, HelpCommand help, TrackCommand track,
        UntrackCommand untrack, ListCommand listCommand
    ) {
        this.commandList = List.of(start, help, track, untrack, listCommand);
    }

    public List<Command> getCommandList() {
        return commandList;
    }
}
