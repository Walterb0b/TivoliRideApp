public class TivoliRide {
    private double height;

    //Constructor for tivoli ride
    public TivoliRide(double height){
        this.height = height;
    }

    //Method to describe if the person is tall enough
    public String getDescription(){
        if(height < 1.60){
            return "You are not tall enough";
        }
        else {
            return "You are tall enough";
        }
    }
}
