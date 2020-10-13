package Collections;

import java.util.ArrayList;

public class CollectionsLec {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("Austin");
        names.add("Joe");
        names.add("Bob");
        System.out.println(names.size());

//        System.out.println(names.get(0));
        System.out.println("names.get(names.indexOf(\"Bob\")).toUpperCase() = " + names.get(names.indexOf("Bob")).toUpperCase());
    }
}
