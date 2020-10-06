package oopLec;
import java.util.Date;

public class Post {
    //think of something that is specific to every post (for this specific instance). so you want it instanced.

    //blog views
    public static int blogViews;

    //name of blog
    public static String nameOfBlog = "Justin's Blog";

    //title
    private String title;
    //getter for title. a public method that acts as a gatekeeper for title.
    public String getTitle(){
        return this.title.toUpperCase();
    }
    //SETTER for title, sets data of a private variable.
    public void setTitle(String title) {
        this.title = title.toLowerCase().trim();
    }

    //IMPORTANT: getters and setters for private variables are important for variables and info that required a transformation before getting displayed between front end and database. Ex above, Dates, etc.

    //author
    public String authorName;

    //datePosted
    public Date datePosted;

    //content
    public String content;

    //dateEdited
    public Date dateEdited;


    //CONSTRUCTOR has to have same name as class.
    public Post(String title) {
        this.title = title;
        this.authorName = "";
    }

    public Post(String title, String authorName) {
        this.title = title;
        this.authorName = authorName;
    }

    //display title and authorName. It would need to be instance. If it was static, we ould not have access to title or authorName.
    public void printTitleAndAuthor() {
        System.out.println("The Title: " + this.title);
        System.out.println("The Author is: " + this.authorName);
    }

    //method to return the longer title of two blog posts... Static because you are passing information through it.
    public static String returnLongerPostTitle(Post p1, Post p2){
        if (p1.title.length() > p2.title.length()){
            return p1.title;
        } else {
            return p2.title;
        }
    }

    public static void main(String[] args) {
        Post p = new Post("A day in the life");
//        p.title = "A day in the life";
//        p.authorName = "Max Smith";
//        p.datePosted = new Date();
//        p.content = "I am what I am.";
//        p.dateEdited = new Date ();

        p.printTitleAndAuthor();

    }

}
