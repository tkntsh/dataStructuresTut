import java.util.*;

public class SocialNetwork 
{
    public static void main(String[] args) 
    {
        //using graph to set up network
        Map<String, List<String>> graph = new HashMap<>();

        //adding connections
        graph.put("Alice", Arrays.asList("Bob", "Charlie"));
        graph.put("Bob", Arrays.asList("Alice", "David"));
        graph.put("Charlie", Arrays.asList("Alice"));
        graph.put("David", Arrays.asList("Bob"));

        //display connections
        System.out.println("Alice's friends: " + graph.get("Alice"));
    }
}
