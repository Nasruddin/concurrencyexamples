package com.nasir;

import java.util.concurrent.*;

import static java.lang.System.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            String threadName = Thread.currentThread().getName();
            out.printf("Hello :: %s%n", threadName);
        });

        //Callable
        Callable<TaskObject> task = () -> {
            out.println("Running task");
            TaskObjectBuilder taskObjectBuilder = new TaskObjectBuilder(new TaskObject());
            TaskObject taskObject = taskObjectBuilder.isSent(true).data("Data").build();
            return taskObject;
        };

        ExecutorService callableService = Executors.newFixedThreadPool(1);
        Future<TaskObject> future = executorService.submit(task);

        out.println("Future done? " + future.isDone());

        boolean result = future.get().isSent();

        out.println("Future done? " + future.isDone());
        out.println("Result " + result);
    }
}
