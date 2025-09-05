public class TivoliRide {
    private double minHeight;
    private String rideName;

    //Constructor for tivoli ride
    public TivoliRide(String rideName, double minHeight) {
        this.minHeight = minHeight;
        this.rideName = rideName;
    }

    //Method to get the minimum height required for the ride
    public double getMinHeight() {
        return minHeight;
    }

    //Method to get the name of the ride
    public String getRideName() {
        return rideName;
    }
    //Method to see if the user is tall enough
    public boolean canRide(double height){
        return height > minHeight;
    }
    //Method to see if the user is JUST tall enough
    public boolean canJustRide(double height){
        return height == minHeight;
    }
}
