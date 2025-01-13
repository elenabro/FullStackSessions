package Session14;


//queue allows to manage how exactly the Object is going to be added to queue
//if we add something to the List, it added to the end of List
//if add to Stack, it's added to the top


public class Task {

    String name;
    int priority;

    public Task(String name, int priority){
       this.name =name;
       this.priority= priority;
    }

    @Override
    public String toString(){
        return "Task: " + name + " priority: " + priority;
    }
//    String name;
//    int priority;
//
//    public Task(String name, int getPriority){
//        this.name = name;
//        this.priority = getPriority;
//    }
//
//    @Override
//    public String toString(){
//        return "Task: " + name + " Priority: " + priority;
//    }
}
