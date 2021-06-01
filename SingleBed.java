public class SingleBed implements Room {
   private double totalPrice = 1000; 
   private boolean wifi = false;
   private String start;
   private String end;
   private int numPeople = 0;
   
   @Override
   public void book() {
      System.out.println("Booked. Room type: Single Bed");
   }
   @Override
   public double getPrice() {
       //System.out.println("Single Bed Price: " + price);
       return totalPrice;
   }
   
   @Override
   public boolean getWifi() {
       return wifi;
   }
   @Override
   public void setWifi(boolean newWifi) {
       wifi = newWifi;
       totalPrice += 200;
       System.out.println("Single Bed Wifi: " + wifi);
   }
   
   @Override
   public String getStart() {
       return start;
   }
   @Override
   public void setStart(String newStart) {
       start = newStart;
       //System.out.println("King Size Bed Wifi: " + wifi);
   }

   @Override
   public String getEnd() {
       return end;
   }
   @Override
   public void setEnd(String newEnd) {
       end = newEnd;
       //System.out.println("King Size Bed Wifi: " + wifi);
   }
   
   @Override
   public int getNumPeople() {
       return numPeople;
   }
   @Override
   public void setNumPeople(int newNumPeople) {
       numPeople = newNumPeople;
       //System.out.println("King Size Bed Wifi: " + wifi);
   } 
   
   @Override
   public void promotionDiscount(Promotion promotion) {
       totalPrice -= promotion.getDiscount();
   }
}
