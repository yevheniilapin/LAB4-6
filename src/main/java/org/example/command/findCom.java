package org.example.command;

import org.example.taxopark.Actions;
import org.example.taxopark.Taxi;

import java.util.List;

public class findCom implements Command {
    List<Taxi> taxis;
    Actions action = new Actions();

    public findCom(List<Taxi> taxis) {
        this.taxis = taxis;
    }

    @Override
    public void execute() {
        action.findspeed(taxis);
    }
}
