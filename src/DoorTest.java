public class DoorTest {
    public static void main(String[] args) {
        Door metalDoor = new Door("Metal");
        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());
        metalDoor.close();
        metalDoor.open();

        SlidingDoor backGlassSlidingDoor = new SlidingDoor("back glass sliding");
        System.out.println("backGlassSlidingDoor.isOpen() = " + backGlassSlidingDoor.isOpen());
        backGlassSlidingDoor.close();
        backGlassSlidingDoor.open();
    }

}
