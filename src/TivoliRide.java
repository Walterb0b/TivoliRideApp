public class TivoliRide {
    private double height;

    //Constructor for tivoli ride
    public TivoliRide(double height){
        this.height = height;
    }

    //Method to describe if the person is tall enough
    public String getDescription(){
        if(height < 1.60){
            return "You are " + height + "m" + " tall..." +
                    "You are not tall enough! Next time bring some stilts maybe? :P";
        }
        else if(height == 1.60){
            return "You are " + height + "m" + " tall." +
                    "You are just tall enough :D\nJump on in!";
        }
        else{
            return "You are " + height + "m" + " tall!" +
                    "\n You are more than tall enough for this ride. Welcome aboard!";
        }
    }
}
