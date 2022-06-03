public class OrderIsDone implements Command{
    Receiver r = new Receiver();                     //create a object of the Receiver
    public static void done(){
        //remove the top of the order in order arraylist
        ListOrders.orderLL.get(0).printResult();
        ListOrders.orderLL.remove(0);
    }
    
    public void execute(){
        r.orderIsDone();                            //call receiver's method
    }
}
