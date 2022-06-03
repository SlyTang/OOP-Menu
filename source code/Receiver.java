import java.util.*;
public class Receiver{
    public void listOrders(){
        //print the infomation of listOrders
        System.out.println();
        System.out.println("Outstanding Orders"); 
        
        //print all the order that is placed
        for(int i = 0 ; i < ListOrders.orderLL.size() ; i++){
            ListOrders.orderLL.get(i).printResult();
        }
        System.out.println();
    }

    public void editMenu(){
        //print the infomation of editMenu
        System.out.println();                                       
        System.out.println("Edit Menu:");                          
        System.out.print("Chinese or Western (c | w): ");
        EditMenu.input = EditMenu.s.nextLine();                 //get the value in EditMenu
        Menu menu = EditMenu.mf.createMenu(EditMenu.input);     //call the MenuFactory and create a Menu base on the input. If input = c create chinese menu, if input = w create western menu
        
        //check have input. If have input, do menu's execute.else print Input Error
        if(menu != null){
            menu.execute();
        }else{
            System.out.println("Input Error");
        }
    }

    public void showMenu(){
        //print the infomation of showMenu
        if(ShowMenu.getChineseMenu()!=null){        //if ChineseMenu is edit before it can be show here
            ShowMenu.getChineseMenu().getData();
        }
        if(ShowMenu.getWesternMenu()!=null){        //if WesternMenu is edit before it can be show here
            ShowMenu.getWesternMenu().getData();
        }
    }

    public void placeOrder(){
        //print the infomation of placeOrder
        System.out.println();
        System.out.println("Place Order");        
        System.out.print("Chinese or Western (c | w): ");
        PlaceOrder.input = PlaceOrder.s.nextLine();
        Order order = PlaceOrder.of.createOrder(PlaceOrder.input);      //create order base on the input, if intput = "c" create chinese order, if intput = "w" create western order
        if(order != null){
            order.execute();
        }else{
            System.out.println("Input Error");
        }
    }

    public void orderIsDone(){
        //print the infomation of orderIsDone
        System.out.println();
        System.out.println("Complete Order");
        OrderIsDone.done();
        System.out.println("Order marked as done");
        System.out.println("");
    }

    public void cancelOrder(){
        //print the infomation of cancelOrder
        System.out.println();
        System.out.println("Cancel Order");
        System.out.print("Staff Number: ");
        CancelOrder.input = CancelOrder.s.nextLine();                                   
        for(int i = 0 ; i < ListOrders.orderLL.size() ;i++){                            //check the arraylist's all values, if the Staff Number input is exist, cancel it in arraylist
            Order order = ListOrders.orderLL.get(i);
            if(CancelOrder.input.equals(ListOrders.orderLL.get(i).getStaffNum())){
                ListOrders.orderLL.get(i).printResult();
                ListOrders.orderLL.remove(i);
                System.out.println("Order Cancelled");
                restoreAvailableCount(order.getOrderType().toLowerCase());
                System.out.println();
            }
        }
    }

    //variables library
    public static LinkedList<Memento> MementoLL1 = new LinkedList<Memento>();                //used to save the ChineseMenu Memento
    public static LinkedList<Memento> MementoLL2 = new LinkedList<Memento>();                //used to save the WesternMenu Memento
    public static int backUpCount;
    public static void saveAvailableCount(String input){
        if(input.equals("c")){                                                      //check if the input is c save ChineseMenu's AvailableCount as Memento in MementoLL1
            MementoLL1.add(new Memento(ShowMenu.getChineseMenu().getAvailableCount()));
        }else if(input.equals("w")){                                                //check if the input is w save WesternMenu's AvailableCount as Memento in MementoLL2
            MementoLL2.add(new Memento(ShowMenu.getWesternMenu().getAvailableCount()));
        }
    }

    //used to restore AvailableCount if any order is cancel.
    public static void restoreAvailableCount(String input){
        if(input.equals("c")){
            ShowMenu.getChineseMenu().setCAvailableCount(MementoLL1.removeLast().getAvailableCount());
        }else if(input.equals("w")){
            ShowMenu.getWesternMenu().setWAvailableCount(MementoLL2.removeLast().getAvailableCount());
        }
    }
}