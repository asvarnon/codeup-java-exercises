public class DoorTest {
    public static void main(String[] args) {
//        Door metalDoor = new Door("Metal");
//        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());
//        metalDoor.close();
//        metalDoor.open();

//        SlidingDoor backGlassSlidingDoor = new SlidingDoor("back glass sliding");
//        System.out.println("backGlassSlidingDoor.isOpen() = " + backGlassSlidingDoor.isOpen());
//        backGlassSlidingDoor.close();
//        backGlassSlidingDoor.open();

        LockingDoor backDoor = new LockingDoor("back");
        backDoor.open();
        System.out.println("backDoor.isOpen() = " + backDoor.isOpen());
        System.out.println("backDoor.isLocked() = " + backDoor.isLocked());
        backDoor.unlock();
        backDoor.unlock();
        backDoor.open();
        backDoor.close();
        backDoor.lock();
        System.out.println("backDoor.isLocked() = " + backDoor.isLocked());

    }

}
