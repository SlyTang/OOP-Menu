import java.util.*;
public abstract class Order{
    //variables library
    String orderType;                                                   //save the values of order Type
    String side;                                                        //save the values of side dish
    String drink;                                                       //save the values of drink
    String staffNum;                                                    //save the values of staff Number
    String officeLocation;                                              //save the values of office Location
    static boolean orderIsPlace=false;                                  //check any order is placed or not

    public static ArrayList<Order> order=new ArrayList<Order>();

    //constructor
    public Order(){}
    public Order(String orderType){
        this.orderType = orderType;
    }

    //getter
    public String getSide(){return side;}
    public String getDrink(){return drink;}
    public String getStaffNum(){return staffNum;}
    public String getOfficeLocation(){return officeLocation;}
    public String getOrderType(){ return orderType; }
    public static boolean getOrderIsPlace(){return orderIsPlace;}
    public abstract ArrayList<Order> getData();
    
    //used to print order details
    public void printResult(){
        if(orderType.equals("c")){
            System.out.println("C: "+staffNum+", "+officeLocation+", "
                +ShowMenu.getChineseMenu().getDish()+", Chinese Soup, "+drink);
        }
        if(orderType.equals("w")){
            System.out.println("W: "+staffNum+", "+officeLocation+", "
                +ShowMenu.getWesternMenu().getDish()+", "+ side +", Western Soup, "+drink);
        }
    }

    public abstract void execute();
}