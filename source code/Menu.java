import java.util.*;
public abstract class Menu{
    Scanner s = Client.s;               //call the global scanner
    //variables library
    public String dishType;             //save the value of dishType
    public String input;                //the keyboard input will be save here
    public String dish;                 //save the value of dish
    public String price;                //save the value of price
    public int availableCount;          //save the value of availableCount
    
    //constructor
    public Menu(){}
    public Menu(String dishType){
        this.dishType = dishType;
    }

    public abstract void showResult();                                      //set a abstract class call showResult
    
    //getter
    public void getData(){showResult();}                                    
    public String getDish(){return dish;}                                   
    public int getAvailableCount(){return availableCount;}                  
    
    //setter
    public void setCAvailableCount(int input){ShowMenu.getChineseMenu().availableCount = input;}        //set the AvailableCount as ChineseMenu's availableCount
    public void setWAvailableCount(int input){ShowMenu.getWesternMenu().availableCount = input;}        //set the AvailableCount as WesternMenu's availableCount
    
    public void execute(){
        //print and request input
        System.out.print("Enter main dish: ");             
        dish = s.nextLine();

        System.out.print("Enter price: ");
        price = s.nextLine();

        System.out.print("Enter available count: ");
        availableCount = Integer.parseInt(s.nextLine());            //input availableCount as a string and change it to integer

        System.out.println("Menu Updated");
        ShowMenu.setMenu(this);                                     //set the menu type (ChineseMenu or WesternMenu)

        System.out.println();
    }
}