public class CommandFactory{
    public  CommandFactory() {}
    
    public Command createCommand(String input) {
        //check the input .If it is the corresponding English word, execute it and call the corresponding class to do the next step
        Command command = null;                                 //In the being, set the Command = null as a default
        if(input.equals("e")){
            command = new EditMenu();                           
        }
        if(input.equals("s")){
            command = new ShowMenu();
        }
        if(input.equals("p")){
            command = new PlaceOrder();
        }
        if(input.equals("c")){
            command = new CancelOrder();
        }
        if(input.equals("l")){
            command = new ListOrders();
        }
        if(input.equals("n")){
            command = new PlaceOrder();
        }
        if(input.equals("d")){
            command = new OrderIsDone();
        }
        return command;
    }
}