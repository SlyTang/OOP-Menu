public class OrderFactory{
   public Order createOrder(String input){
       Order o = null;
       
       //check the input, if input = "c" placeChineseOrder. if input = "w" PlaceWesternOrder
       if(input.equals("c")){
           o = new PlaceChineseOrder();
       }else if(input.equals("w")){
           o = new PlaceWesternOrder();
       }
       return o;
   }
}
