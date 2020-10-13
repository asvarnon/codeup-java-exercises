package Collections;

import oopLec.Post;

import javax.naming.ldap.HasControls;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
//        ArrayList<Post> posts = new ArrayList<>();


//        System.out.println(names.size());
//        names.add("Austin");
//        names.add("Joe");
//        names.add("Bob");
//        System.out.println(names.size());

//        posts.add(new Post("Austin's Weekend", "Austin"));
//        posts.add(new Post("Austin's Best Weekend", "Joe"));
//        posts.add(new Post("Austin's Latest Weekend", "Bob"));

//        System.out.println(names.get(0));
//        System.out.println("names.get(names.indexOf(\"Bob\")).toUpperCase() = " + names.get(names.indexOf("Bob")).toUpperCase());

//        Post deletedPost = posts.remove(1);
//        deletedPost.printTitleAndAuthor();
//        System.out.println("posts.lastIndexOf(deletedPost) = " + posts.lastIndexOf(deletedPost));
//
//        if(!posts.isEmpty()){
//            for (Post post : posts){
//                post.printTitleAndAuthor();
//            }
//        }

        hashMapsPractice();

    }


    public static void hashMapsPractice(){
        HashMap<String, String> usernames = new HashMap<>();
        HashMap<String, Post> postsMap = new HashMap<>();
        // first parameter becomes the unique key. Put also overwrites the previous input with same key value.
        usernames.put("avarnon", "Austin Varnon");
        usernames.put("avarnon", "Austin Scott Varnon");

        postsMap.putIfAbsent("200185-12345", new Post("Title 1"));
        postsMap.putIfAbsent("200185-12346", new Post("Title 2"));
        postsMap.putIfAbsent("200185-12347", new Post("Title 3"));

//        System.out.println("usernames.get(\"avarnon\") = " + usernames.get("avarnon"));
//        System.out.println("usernames.get(\"asvarnon\") = " + usernames.getOrDefault("asvarnon", "N/A"));

        if(usernames.containsKey("avarnon")){
            System.out.println("usernames.get(\"avarnon\") = " + usernames.get("avarnon"));
        } else {
            System.out.println("user not found");
            System.out.println("Roll back transaction");
            System.out.println("Ask again");
        }

        postsMap.remove("200185-12346");

        if(!postsMap.isEmpty()){
            // LOOPING THROUGH HASHMAPS, NOT IN LECTURE.
            System.out.println("Hashmap keyset");
            for(String key: postsMap.keySet()){
//            System.out.println("key = " + key);
                postsMap.get(key).printTitleAndAuthor();
            }

            System.out.println("hashmap values");
            for(Post post: postsMap.values()){
                post.printTitleAndAuthor();
            }
        }

    }



}
