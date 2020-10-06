package oopLec;

public class PostTest {
    public static void main(String[] args) {
        Post post = new Post("Harry Potter", "J.K. Rowling");
//        System.out.println(post.title);
        System.out.println(post.getTitle());
        System.out.println(post.authorName);

    }
}
