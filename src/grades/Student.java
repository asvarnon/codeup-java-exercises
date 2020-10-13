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
        int total = 0;
        for(int grade : grades){
            return total + grades.get(grade);
        }
        return total/grades.size();
    }

    public static void main(String[] args) {




    }
}
