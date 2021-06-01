public class RoomFactory {

   public Room getRoom(String roomType){
      //System.out.println("SingleBed".equalsIgnoreCase(roomType));
      //System.out.println("KingSizeBed".equalsIgnoreCase(roomType));
      System.out.println("");
      if ("SingleBed".equalsIgnoreCase(roomType)){
         return new SingleBed();
      } else if ("KingSizeBed".equalsIgnoreCase(roomType)){
         return new KingSizeBed();
      } 
      
      return null;
   }
}
