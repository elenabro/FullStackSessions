package Session14;

import java.util.ArrayDeque;
import java.util.Deque;

//dequeue allows you to manage how you take the objects from the queue

public class ArrayDequeExample {

    public static void main(String[] args) {

//        Deque<Task> taskDeque = new ArrayDeque<>();
//        taskDeque.addLast(new Task("task 1", 2));
//        taskDeque.addLast(new Task ("task 3 ", 1));
//        taskDeque.addLast(new Task("task 2 ", 4));
//        taskDeque.addLast(new Task("task 4", 5));
//
//
//        taskDeque.forEach(System.out::println);
//        System.out.println("---------------------");
////        this is taking object from dequeue
//        while(!taskDeque.isEmpty()){
//            Task t = taskDeque.pollFirst();  //first in first out strategy
//            System.out.println(t.toString());
//
//
//        }

        Deque<Task> taskDeque = new ArrayDeque<>();
        taskDeque.addLast(new Task("Task 1", 3));
        taskDeque.addLast(new Task("Task 4", 1));
        taskDeque.addLast(new Task("Task 3", 2));

        taskDeque.forEach(System.out::println);
        System.out.println("____-----------------____");
        while (!taskDeque.isEmpty()) {
            Task t = taskDeque.pollFirst();
            System.out.println(t.toString());
        }
    }
}

