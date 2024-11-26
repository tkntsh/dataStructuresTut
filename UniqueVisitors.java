import java.util.HashSet;

public class UniqueVisitors 
{
    public static void main(String[] args) 
    {
        HashSet<String> visitors = new HashSet<>();

        //adding visitor IPs
        visitors.add("192.168.1.1");
        visitors.add("10.0.0.1");
        //duplicate should be ignored
        visitors.add("192.168.1.1");

        System.out.println("Unique Visitors: " + visitors.size());
    }
}
