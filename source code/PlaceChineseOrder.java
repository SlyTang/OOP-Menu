import java.util.*;
public class PlaceChineseOrder extends Order{
    //variables library
    public static String input;     //the keyboard input will be save here
    Scanner s = Client.s;           //call the global scanner
    
    //set the dishType as "c"
    public PlaceChineseOrder(){
        super("c");
    }
    
    //getter
    public ArrayList<Order> getData(){
        return order;
    }
    
    //setter
    public void setOrder(){
        ListOrders.setOrder(this);
    }

    public void execute(){
        if(ShowMenu.getChineseMenu().availableCount==0){                            //check the getChineseMenu's availableCount, if availableCount = 0. Print Sold Out!                
            System.out.println("Sold Out! ");
            System.out.println();
        }else{                                                                      //if availableCount != 0. Print the details of the order users can place
            System.out.print("Oolong Tea: hot or iced (h | i): ");
            drink = s.nextLine();
            if(drink.equals("h")){
                drink = "Hot Tea";
            }else if(drink.equals("i")){
                drink = "Iced Tea";
            }
            System.out.print("Staff Number: ");
            staffNum = s.nextLine();

            System.out.print("Office Location: ");
            officeLocation = s.nextLine();

            setOrder();
            Order.orderIsPlace=true;                                                //used to check is any order placed, if is placed the show menu will be print the other version
            System.out.println("Order Placed");
            Receiver.saveAvailableCount("c");                                       //save the AvailableCount in chinese menu
            ShowMenu.getChineseMenu().availableCount --;                            //-1 AvailableCount in chinese menu
            System.out.println();
        }
    }
}
