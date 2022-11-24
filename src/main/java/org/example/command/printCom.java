package org.example.command;

import org.example.taxopark.Actions;
import org.example.taxopark.Taxi;

import java.util.List;

public class printCom implements Command {
    List<Taxi> taxis;
    Actions action = new Actions();
    public printCom(List<Taxi> taxis){
        this.taxis=taxis;
    }
    @Override
    public void execute() {
        action.print(taxis);
    }
}
