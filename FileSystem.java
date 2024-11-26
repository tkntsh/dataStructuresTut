class Node 
{
    String name;
    Node[] children;

    Node(String name, Node[] children) 
    {
        this.name = name;
        this.children = children;
    }

    void display() 
    {
        System.out.println(name);
        if(children != null) 
        {
            for(Node child : children) 
            {
                child.display();
            }
        }
    }
}

public class FileSystem 
{
    public static void main(String[] args) 
    {
        Node[] files = { new Node("file1.txt", null), new Node("file2.txt", null) };
        Node folder = new Node("Documents", files);
        folder.display();
    }
}
