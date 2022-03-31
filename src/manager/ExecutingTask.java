package manager;

import models.FooBarAbstract;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ExecutingTask {



    long delay;
    LoopTask task = new LoopTask();
    Timer timer;
    private String taskName;
    FooBarAbstract fooBarAbstract;

    public ExecutingTask(FooBarAbstract fooBarAbstract) {
        this.taskName = fooBarAbstract.getClass().getSimpleName();
        timer = new Timer(this.taskName);
        this.delay = fooBarAbstract.duration * 1000;
        this.fooBarAbstract = fooBarAbstract;
    }

    public void start() {
        timer.cancel();
        timer = new Timer(this.taskName);
        Date executionDate = new Date();
        timer.schedule(task, executionDate, delay);

    }

    private class LoopTask extends TimerTask {
        public void run() {
            fooBarAbstract.mine();
            fooBarAbstract.assemble();
            System.out.println("Total bar: " + Inventory.barTotal);
            System.out.println("Total foo: " + Inventory.fooTotal);
            System.out.println("Total foobar: " + Inventory.foobarTotal);
        }
    }



}
