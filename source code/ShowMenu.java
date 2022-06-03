public class ShowMenu implements Command{
    //variables library
    private static Menu cm;                 //set Menu call cm used to save ChineseMenu
    private static Menu wm;                 //set Menu call wm used to save WesternMenu
    Receiver r = new Receiver();            //create a object of the Receiver
    
    //getter
    public static Menu getChineseMenu(){
        return cm;
    }
    public static Menu getWesternMenu(){
        return wm;
    }
    
    //setter
    public static void setMenu(Menu menu){
        if(menu.dishType.equals("c")){                          //if dishType is "c" save menu as cm
            cm = menu;
        }else if(menu.dishType.equals("w")){                    //if dishType is "w" save menu as wm 
            wm = menu;
        }
    }
    
    public void execute(){
        r.showMenu();                                           //call receiver's method
    }
}
