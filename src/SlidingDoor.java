public class SlidingDoor extends Door {
    //default constructor
    public SlidingDoor(String description){
        super(description);
    }

    public void open(){
        System.out.println("Attempting to slide open the door...");
        super.open();
    }

    public void close(){
        System.out.println("Attempting to close the door...");
        super.close();
    }
}
