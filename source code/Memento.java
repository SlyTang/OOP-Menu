public class Memento{
    //variables library
    int savedCount;
    
    public Memento(int AvailableCount){
        savedCount = AvailableCount;        //save AvailableCount as savedCount
    }
    public int getAvailableCount(){
        return savedCount;                  //call receiver's method
    }
}