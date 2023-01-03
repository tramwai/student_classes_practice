public class Student {

    //COMPLETE THIS CLASS BEFORE MathStudent and ScienceStudent classes as they will be sub-classes of Student class


    //HERE! Create a 5 args constructor

    public Student(String firstName, String lastName, int age, String gender, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.className = className;
    }

    public static int totalNumberOfStudents;
    /**
    HERE!
    Create private instance variables as below
    firstName
    lastName
    age
    gender
    className
    NOTE: only age will be int and others are String
     */

    public  String firstName;
    public  String lastName;
    public  int age;
    public  String gender;
    public  String className;

    /**
        method that adds the total number of students
     */
    public static void addStudents(){
        totalNumberOfStudents++;
    }

    /**
    HERE!
    Provide public getter method for className only
     */
    public String getClassName() {
        return className;
    }

/**
        HERE!
        Override toString() method that returns Student object information
        It should be dynamic considering child classes that inherits
     */
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
