public class Invoker{        
    //variables library
    Command c;
    
    //set up the command in the client's input
    public void setCommand(Command c){
        this.c=c;
    }
    
    //do command's execute
    public void invoke(){
        c.execute();
    }
}