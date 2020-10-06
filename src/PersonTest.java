public class PersonTest {
    public static void main(String[] args) {
        Person austin = new Person("Austin Varnon", 26, "blue");
        Person mark = new Person("Mark Hooligan", 28, "green");
        Person joe = new Person("Joe Singer", 30);

//        austin.setName("Austin");
//        austin.getName();
//        austin.sayHello();
//
//        mark.setName("Markie");
//        mark.getName();
//        mark.sayHello();


        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);
    }
}
