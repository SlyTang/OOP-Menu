import java.util.*;
public class ListOrders implements Command{
    //variables library
    public static ArrayList<Order> orderLL = new ArrayList<Order>();    //used to save order
    Order order;
    Receiver r = new Receiver();            //create a object of the Receiver
    public static void setOrder(Order order){
        orderLL.add(order);     //add the order to the arraylist orderLL
    }

    public void execute(){
        r.listOrders();//call receiver's method
    }
}
