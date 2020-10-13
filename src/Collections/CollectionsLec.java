package Collections;

import oopLec.Post;

import java.util.ArrayList;

public class CollectionsLec {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Post> posts = new ArrayList<>();

//        System.out.println(names.size());
//        names.add("Austin");
//        names.add("Joe");
//        names.add("Bob");
//        System.out.println(names.size());

        posts.add(new Post("Austin's Weekend", "Austin"));
        posts.add(new Post("Austin's Best Weekend", "Joe"));
        posts.add(new Post("Austin's Latest Weekend", "Bob"));

//        System.out.println(names.get(0));
//        System.out.println("names.get(names.indexOf(\"Bob\")).toUpperCase() = " + names.get(names.indexOf("Bob")).toUpperCase());

        Post deletedPost = posts.remove(1);
        deletedPost.printTitleAndAuthor();
        System.out.println("posts.lastIndexOf(deletedPost) = " + posts.lastIndexOf(deletedPost));

        if(!posts.isEmpty()){
            for (Post post : posts){
                post.printTitleAndAuthor();
            }
        }

    }
}
