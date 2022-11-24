package org.example.command;

import org.example.taxopark.Actions;
import org.example.taxopark.Taxi;

import java.util.List;

public class addCom implements Command{
    List<Taxi> taxis;
    Actions action = new Actions();
    public addCom(List<Taxi> taxis){
        this.taxis = taxis;
    }

    @Override
    public void execute() {
        action.add(taxis);
    }
}
