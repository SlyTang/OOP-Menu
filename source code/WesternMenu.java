import java.util.*;
public class WesternMenu extends Menu{
    Scanner s = Client.s;                               //call the global scanner
    
    //set the dishType as "w"
    public WesternMenu(){
        super("w");
    }

    //the method used to print the result of the order
    public void showResult(){
        if(Order.getOrderIsPlace()){            //if the any order has been placed by the user will be print
            System.out.println("Western style Business Set Lunch (available count = "
            +ShowMenu.getWesternMenu().availableCount+")");
            System.out.println("main dish: "+dish);
            System.out.println("with rice/spaghetti/French fries");
            System.out.println("price: "+price);
            System.out.println();
        }else{                                  //if no order has been placed will be print
            System.out.println("Western style Business Set Lunch");
            System.out.println("main dish: "+dish);
            System.out.println("with rice/spaghetti/French fries");
            System.out.println("price: "+price);
            System.out.println("available count: "+ShowMenu.getWesternMenu().availableCount);
            System.out.println();
        }
    }
}