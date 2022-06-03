import java.util.*;
public class PlaceWesternOrder extends Order{
    //variables library
    public static String input;     //the keyboard input will be save here
    Scanner s = Client.s;           //call the global scanner
    
    //set the dishType as "w"
    public PlaceWesternOrder(){
        super("w");
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
        if(ShowMenu.getWesternMenu().availableCount==0){                            //check the getWesternMenu's availableCount, if availableCount = 0. Print Sold Out!
            System.out.println("Sold Out! ");
            System.out.println();
        }else{                                                                      //if availableCount != 0. Print the details of the order users can place
            System.out.print("side: rice, spaghetti, French fries (r | s | f): ");
            side = s.nextLine();
            if(side.equals("r")){
                side = "Rice";
            }else if(side.equals("s")){
                side = "Spaghetti";
            }else if(side.equals("f")){
                side = "French fries";
            }

            System.out.print("tea or coffee, hot or iced (ht| it | hc | ic): ");
            drink = s.nextLine();
            if(drink.equals("ht")){
                drink = "Hot Tea";
            }else if(drink.equals("it")){
                drink = "Iced Tea";
            }else if(drink.equals("hc")){
                drink = "Hot Coffee";
            }else if(drink.equals("ic")){
                drink = "Iced Coffee";
            }

            System.out.print("Staff Number: ");
            staffNum = s.nextLine();

            System.out.print("Office Location: ");
            officeLocation = s.nextLine();

            setOrder();
            Order.orderIsPlace=true;                                            //used to check is any order placed, if is placed the show menu will be print the other version
            System.out.println("Order Placed");
            Receiver.saveAvailableCount("w");                                   //save the AvailableCount in western menu
            ShowMenu.getWesternMenu().availableCount --;                        //-1 AvailableCount in western menu
            System.out.println();
        }
    }
}
