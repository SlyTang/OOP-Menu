public class MenuFactory{
   public Menu createMenu(String input){
       Menu m = null;
       
       //check input.
       if(input.equals("c")){               //If input = c create chinese menu.
           m = new ChineseMenu();
       }else if(input.equals("w")){         //If input = w create western menu.
           m = new WesternMenu();
       }
       return m;
   }
}
