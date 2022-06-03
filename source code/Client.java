import java.util.*;
public class Client{
    public static Scanner s = new Scanner(System.in);       //create a global public scanner that all method will use
    public static void main(String [] args){
        System.out.print('\u000C');                         //clear the blueJ screen
        
        //variables library
        Invoker i = new Invoker();                          //create a object of the Invoker
        CommandFactory cf = new CommandFactory();           //create a object of the CommandFactory
        Command c = null;                                   //In the being, set the Command = null as a default
        String input;                                       //the keyboard input will be save here
        
        //do the looping, when the input = "q" will be stop the programme
        do{
            //print the list of the command you can use
            System.out.println("Please enter command: [e | s | p | c | l | n | d | q]");
            System.out.println("e = Edit menu, s = Show menu, p = Place order, c = Cancel order,");
            System.out.println("l = List orders, d = order is Done, q = Quit");
            
            input = s.nextLine();                           //input in keybord
            c = cf.createCommand(input);                    //put the createCommand(input) as command
            
            //check if the input not equals q will be run, if = q will be stop the looping
            if(c!=null){
                i.setCommand(c);                            //set the input and call the method setCommad
                i.invoke();                                 //do Invoker's invoke
            }
        }while(!input.equals("q"));
        System.out.println("Exiting Program...");
    }
}