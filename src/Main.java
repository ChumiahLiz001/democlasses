import java.util.Scanner;
import java.util.*;
import java.math.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Student javaStudent1= new Student();
        javaStudent1.setName("Liz"); //assigning a value
        javaStudent1.setCourse("Java");

        Student webStudent1=new Student("Ann", "web");
        System.out.println(webStudent1.getName() + " " + webStudent1.getCourse()); //reading a value from an object

        OrdinaryStudent pythonStudent = new OrdinaryStudent("Peter", "Python");
        pythonStudent.toString();

    }
}

