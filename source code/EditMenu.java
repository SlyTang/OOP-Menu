import java.util.*;
public class EditMenu implements Command{
    //variables library
    public static MenuFactory mf = new MenuFactory();       //create a object of the MenuFactory
    public static String input;                             //the keyboard input will be save here
    public static Scanner s = Client.s;                     //call the global scanner
    Receiver r = new Receiver();                            //create a object of the Receiver
    public void execute(){
        r.editMenu();                                       //call receiver's method
    }
}
