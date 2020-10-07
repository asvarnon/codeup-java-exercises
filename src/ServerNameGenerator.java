import java.util.Random;

public class ServerNameGenerator {


    public static void main(String[] args) {
//        String[] adjectivesArray = new String[10];
//        String[] nounsArray = new String[10];

        String[] adjectivesArray = {"aggressive", "gratis", "tart", "excellent", "hospitable", "lively", "parched", "grandoise", "worthless", "jagged"};
        String[] nounsArray = {"flock", "authority", "head", "arch", "eggs", "sheep", "name", "land", "trouble", "sail", "fruit", "ground"};

        String randomAdjective = randomWord(adjectivesArray);
        String randomNoun = randomWord(nounsArray);

        System.out.println("Here is your server name:\n" + randomAdjective + "-" + randomNoun);


    }

    public static String randomWord(String[] array){
        //java.util.Random random = new java.util.Random();   without the import
        Random random = new Random();
        int randomWord = random.nextInt(array.length);
        return array[randomWord];
    }
}
