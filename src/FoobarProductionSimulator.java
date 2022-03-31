import manager.ExecutingTask;
import models.impl.Bar;
import models.impl.Foo;

public class FoobarProductionSimulator {

    public static void main(String[] args){

        Bar bar = new Bar();
        Foo foo = new Foo();
        ExecutingTask executingFooTask = new ExecutingTask(foo);
        ExecutingTask executingBarTask = new ExecutingTask(bar);

        executingBarTask.start();
        executingFooTask.start();
    }
}
