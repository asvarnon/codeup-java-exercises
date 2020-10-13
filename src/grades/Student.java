package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    //constructor
    public Student(String name, int grade){
        this.name = name;
        this.addGrade(grade);
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for(int grade : grades){
            total += grade;
        }
        return total/grades.size();
    }



//    public static void main(String[] args) {
//
//        ArrayList<Student> students = new ArrayList<>();
//
//        students.add(new Student("Austin Varnon", 95));
//        students.add(new Student("Bob Sanger", 80));
//        students.add(new Student("Billy Bob", 65));
//
//        for(Student student: students){
//            System.out.println("student.getName() = " + student.getName());
//            student.addGrade(80);
//            System.out.println("student.grades = " + student.grades);
//            System.out.println("student.getGradeAverage() = " + student.getGradeAverage());
//        }
//
//    }
}
