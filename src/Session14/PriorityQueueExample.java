package Session14;

import java.util.Comparator;
import java.util.PriorityQueue;

//Priority Queue gives an ability create a queue object ordered in a certain way.
// You decide what is going to be criteria of storing the objects in the queue


public class PriorityQueueExample {
    public static void main(String[] args) {


        Comparator<Task> taskComparator = (t1,t2 ) -> Integer.compare (t2.priority, t1.priority);
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(taskComparator);

        taskQueue.add (new Task("Priority queue topic", 1));
        taskQueue.add(new Task("Java", 3));
        taskQueue.add (new Task("Team meeting", 2));
        taskQueue.add (new Task("task later", 8 ));

        while (!taskQueue.isEmpty()){
            Task t = taskQueue.poll();
            System.out.println(t.toString());
        }

    }
}
//queue allows to manage how exactly the Object is going to be added to queue
//if we add something to the List, it added to the end of List
//if add to Stack, it's added to the top


//        Comparator<Task> taskComparator = (Task t1, Task t2) -> Integer.compare(t2.priority, t1.priority);
//
//        PriorityQueue<Task> taskQueue = new PriorityQueue<>(taskComparator);
//
//
//
//        taskQueue.add(new Task("Task 1", 3));
//        taskQueue.add(new Task("Task 2", 1));
//        taskQueue.add(new Task("Task 3", 2));
//        taskQueue.add(new Task("Task 4", 5));
//
//
//        while (!taskQueue.isEmpty()) {
//            Task t = taskQueue.poll();
//            System.out.println(t.toString());
//        }
//    }
//}
