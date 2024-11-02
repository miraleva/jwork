
public class SimpleTextEditor {
    String memory = ""; 

    public void handleCommand(String command) {
        if (command.startsWith("TYPE")) {
            String input = command.substring(5);
            memory += input; 
        } else if (command.equals("SHOW")) {
            System.out.println("Current Text: " + memory); 
        } else 
{
