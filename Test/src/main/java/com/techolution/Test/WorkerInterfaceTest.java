package com.techolution.Test;

/**
 * Created by Avinash on 14-12-2017.
 */
//define a functional interface
@FunctionalInterface
 interface WorkerInterface {

    public void doSomeWork();

}


public class WorkerInterfaceTest {

    public static void execute(WorkerInterface worker) {
        worker.doSomeWork();
    }

    public static void main(String [] args) {

        //invoke doSomeWork using Annonymous class
        execute(new WorkerInterface() {
            @Override
            public void doSomeWork() {
                System.out.println("Worker invoked using Anonymous class");
            }
        });

        //invoke doSomeWork using Lambda expression
        execute( () -> System.out.println("Worker invoked using Lambda expression") );
    }

}