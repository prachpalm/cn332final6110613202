import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        UserLogin userLogin = new UserLogin();
        RoomFactory roomFactory = new RoomFactory();
        Promotion promotion = Promotion.getPromotion();

        // create an object of Scanner
        System.out.print("Login With: ");
        Scanner input = new Scanner(System.in);
        String loginInput = input.nextLine();
        //Boolean isEqual = (loginInput.equalsIgnoreCase("Google"));
        //System.out.println(isEqual);
        
        if (loginInput.equalsIgnoreCase("Google")) {
            userLogin.loginGoogle();
        } else if (loginInput.equalsIgnoreCase("Facebook")) {
            //System.out.println("asdaksjdkalsjdkalsda");
            userLogin.loginFacebook();
        } else if (loginInput.equalsIgnoreCase("TwoStep")) {
            userLogin.loginTwoStepAuth();
        }
        
        // login user only
        System.out.println("");
        System.out.println("Choose you room type: \n  - Single Bed (SingleBed), \n  - King Size Bed (KingSizeBed)");
        System.out.print("Room type: ");
        String roomTypeInput = input.nextLine();
       
        Room room = roomFactory.getRoom(roomTypeInput);
        room.book();
        
        System.out.println("\nWiFi service ?\n  - Yes, \n  - No");
        System.out.print("Your Service: ");
        String wifiInput = input.nextLine();
        if (wifiInput.equalsIgnoreCase("Yes")) {
            room.setWifi(true);
        } else {
            room.setWifi(false);
        }
        System.out.println("Total Price = " + room.getPrice());
        
        System.out.println("\nInformation\nStart?: (yyyymmdd)");
        System.out.print("Start: ");
        String startInput = input.nextLine();
        room.setStart(startInput);
        
        System.out.println("\nEnd?: (yyyymmdd)");
        System.out.print("End: ");
        String endInput = input.nextLine();
        room.setEnd(endInput);
        
        
        System.out.print("\nHow many people coming?: ");
        int numPeopleInput = input.nextInt();
        input.nextLine(); 
        room.setNumPeople(numPeopleInput);
        
        System.out.println("\nStart " + room.getStart() + "\nEnd " + room.getEnd());
        System.out.println(room.getNumPeople() + " people(s)");
        
        
        promotion.showPromotion();
        
        System.out.println("Want a promotion?: Yes / No");
        System.out.print("Answer: ");
        String promotionInput = input.nextLine();
        
        if ("Yes".equalsIgnoreCase(promotionInput)) {
            room.promotionDiscount(promotion);
        }
        
        System.out.println("Total Price = " + room.getPrice());
    }
}
