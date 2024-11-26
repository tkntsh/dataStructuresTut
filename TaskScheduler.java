import java.util.PriorityQueue;

public class TaskScheduler 
{
    public static void main(String[] args) 
    {
        //the smaller the number the higher the priority
        PriorityQueue<Integer> taskQueue = new PriorityQueue<>();

        //adding tasks with priorities
        taskQueue.add(5); //low priority
        taskQueue.add(1); //high priority
        taskQueue.add(3);

        //processing tasks in priority order
        while(!taskQueue.isEmpty()) 
        {
            System.out.println("Processing task with priority: " + taskQueue.poll());
        }
    }
}
