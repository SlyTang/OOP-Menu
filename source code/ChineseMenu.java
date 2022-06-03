import java.util.*;
public class ChineseMenu extends Menu{
    Scanner s = Client.s;                               //call the global scanner
    
    //set the dishType as "c"
    public ChineseMenu(){
        super("c");
    }
    
    //the method used to print the result of the order
    public void showResult(){
        if(Order.getOrderIsPlace()){            //if the any order has been placed by the user will be print
            System.out.println();
            System.out.println("Chinese style Business Set Lunch (available count = "
            +ShowMenu.getChineseMenu().availableCount+")");
            System.out.println("main dish: "+dish);
            System.out.println("with rice, Chinese soup, Chinese tea");
            System.out.println("price: "+price);
            System.out.println();
        }else{                                  //if no order has been placed will be print
            System.out.println();
            System.out.println("Chinese style Business Set Lunch");
            System.out.println("main dish: "+dish);
            System.out.println("with rice, Chinese soup, Chinese tea");
            System.out.println("price: "+price);
            System.out.println("available count: "+ShowMenu.getChineseMenu().availableCount);
            System.out.println();
        }
    }
}