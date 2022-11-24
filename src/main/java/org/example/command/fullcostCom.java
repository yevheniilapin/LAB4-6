package org.example.command;

import org.example.taxopark.Actions;
import org.example.taxopark.Taxi;

import java.util.List;

public class fullcostCom implements Command {
    List<Taxi> taxis;
    Actions action = new Actions();

    public fullcostCom(List<Taxi> taxis) {
        this.taxis = taxis;
    }

    @Override
    public void execute() {
        action.fullcost(taxis);
    }
}