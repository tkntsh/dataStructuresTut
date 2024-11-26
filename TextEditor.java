import java.util.Stack;

public class TextEditor 
{
    public static void main(String[] args) 
    {
        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();

        //simulate text edits
        undoStack.push("First Edit");
        undoStack.push("Second Edit");
        undoStack.push("Third Edit");

        //undo function
        String lastEdit = undoStack.pop();
        //save for redo
        redoStack.push(lastEdit);
        System.out.println("Undo: " + lastEdit);

        //redo function
        String redoEdit = redoStack.pop();
        //restore to undo stack
        undoStack.push(redoEdit); 
        System.out.println("Redo: " + redoEdit);
    }
}
