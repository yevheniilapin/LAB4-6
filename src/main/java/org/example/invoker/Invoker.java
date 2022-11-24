package org.example.invoker;

import org.example.command.Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final List<Command> commands = new ArrayList<>();
    public void executeOperation(Command command){
        commands.add(command);
        command.execute();
    }
}
