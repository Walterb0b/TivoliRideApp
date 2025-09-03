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

    public boolean canRide(double height){
        return height > minHeight;
    }

    public boolean canJustRide(double reqHeight){
        return reqHeight == minHeight;
    }
}
