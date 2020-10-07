package movies;

public class Movie {
    private String name;
    private String category;

    //setters
    public void setName(String name){
        this.name = name.trim();
    }
    public void setCategory(String category){
        this.category = category.trim();
    }

    //getters
    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }


    //constructors
    public Movie(String name){
        setName(name);
    }
    public Movie(String name, String category){
        setName(name);
        setCategory(category);
    }

}
