import java.util.Scanner;

public class TivoliRideTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your height? ");
        double height = input.nextDouble();

        //Create height
        TivoliRide t1 = new TivoliRide(height);

        System.out.println(t1.getDescription());


    }
}