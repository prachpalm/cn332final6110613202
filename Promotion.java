// Singleton Pattern
public class Promotion {

   //create an object of SingleObject
   private static Promotion promotion = new Promotion("20210529", "20210630", 100);
   private String start;
   private String end;
   private double discount;
   //make the constructor private so that this class cannot be
   //instantiated
   private Promotion(String initStart, String initEnd, double initDiscount){
       start = initStart;
       end = initEnd;
       discount = initDiscount;
   }

   //Get the only object available
   public static Promotion getPromotion(){
      return promotion;
   }

   public void showPromotion() {
      System.out.println("Promotion! Discount 100 Baht! From " + start + " to " + end);
   }
   
   public double getDiscount() {
       return discount;
   }
}
