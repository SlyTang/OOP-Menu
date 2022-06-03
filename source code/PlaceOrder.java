import java.util.*;
public class PlaceOrder implements Command{
    //variables library
    public static OrderFactory of = new OrderFactory();                 //create a object of the OrderFactory
    public static String input;                                         //the keyboard input will be save here
    public static Scanner s = Client.s;                                 //call the global scanner
    Receiver r = new Receiver();                                        //create a object of the Receiver
    public void execute(){
       r.placeOrder();                                                  //call receiver's method
    }
}
