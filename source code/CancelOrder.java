import java.util.*;
public class CancelOrder implements Command{
    //variables library
    public static String input;                                 //the keyboard input will be save here
    public static Scanner s = Client.s;                         //call the global scanner
    Receiver r = new Receiver();                                //create a object of the Receiver
    public void execute(){
        r.cancelOrder();                                        //call receiver's method
    }
}