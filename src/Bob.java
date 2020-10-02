import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bob is your son, tell or ask him to so a chore.");

        String choreRequest = sc.nextLine();
        if (choreRequest.endsWith("?")){
            System.out.println("Bob: Sure");
        } else if (choreRequest.endsWith("!")) {
            System.out.println("Bob: Whoa, Chill out!");
        } else if (choreRequest.equals("")) {
            System.out.println("Bob: Fine, be that way!");
        } else {
            System.out.println("Bob: Whatever...");
        }

    }
}
