import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        createRide();
    }

    public static void createRide() {
        //Making a scanner for user inputs
        Scanner input = new Scanner(System.in);

        //Create array of rides using the constructor
        TivoliRide[] rides =
                {
                        new TivoliRide("The Demon", 1.60),
                        new TivoliRide("The golden tower", 1.70),
                        new TivoliRide("Gokarts", 1.45),
                        new TivoliRide("The flying carpet", 1.30),
                };
        //Greet the person and display what rides are available
        System.out.println("Welcome to the tivoli!");
        System.out.println("What ride would you like to go on today?");
        System.out.println("Available rides:");

        for (int i = 0; i < rides.length; i++) {
            System.out.println((i + 1) + ". " + rides[i].getRideName() + " (Minimum height required for this ride): " + rides[i].getMinHeight() + "m");
        }

        //Let the user pick a ride
        System.out.print("\nChoose a ride you would like to go on (enter the number): ");
        int choice = input.nextInt();

        if (choice < 1 || choice > rides.length) {
            System.out.println("That ride is unavailable");
        }

        //Let the user enter their height
        System.out.print("Enter your height please (in meters): ");
        double height = input.nextDouble();

        //Check if the user is tall enough to go on the ride
        TivoliRide selectedRide = rides[choice - 1];
        if(selectedRide.canRide(height)){
            System.out.println("\n You are more than tall enough for this ride. Welcome aboard the " + selectedRide.getRideName() + "!");
        }
        else if(selectedRide.canJustRide(height)){
            System.out.println("You are just tall enough :D\nJump on in!");
        }
        else{
            System.out.println("You are not tall enough for the " + selectedRide.getRideName() + "!" + " Next time bring some stilts maybe? :P");
        }
    }
}