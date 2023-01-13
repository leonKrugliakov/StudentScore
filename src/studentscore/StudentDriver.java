//*****************************************************************************************************
//
//      File:               StudentDriver.java
//
//      Student:            Leon Krugliakov
//
//      Assignment:         Assignment #6
//
//      Course Name:        Java I
//
//      Course Number:      COSC 2050 - 01
//
//      Due:                March 4th, 2020
//
//
//      This program takes in user input for a dynamic amount of students
//      and then it outputs the information entered in a neat format.
//      This program uses arrays to sort and make sure the output is 
//      alphabetically sorted based on the student's last name.
//
//      Other files required:
//      1.  Student.java  -  Contains the Student class
//      2.  Validator.java  -  Contains the Validator class
//
//*****************************************************************************************************

//package studentscore;

//*****************************************************************************************************

import java.util.Scanner;

//*****************************************************************************************************

public class StudentDriver 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int numStudents = 0;
        
        System.out.println("Welcome to the Student Score Application\n");
        
        numStudents = getStudentCount(sc, numStudents);
        sc.nextLine();
        System.out.println();
        
        Student[] students = new Student[numStudents];
        
        for(int i = 0; i < numStudents; i++)
        {
            students[i] = new Student();
        }
        
        for(int i = 0; i < numStudents; i++)
        {
            students[i].setLastName(Validator.getRequiredString(sc, 
                    "Student " + (i + 1) + " last name: "));
            students[i].setFirstName(Validator.getRequiredString(sc, 
                    "Student " + (i + 1) + " first name: "));
            students[i].setScore(getScore(sc, (i + 1)));
            sc.nextLine();
            System.out.println();
        }
        
        selecctionSort(students);
        
        print(students);
    }
    
    //*****************************************************************************************************
    
    public static int getStudentCount(Scanner sc, int numStudents)
    {
        numStudents = Validator.getIntWithinRange(sc, "Enter the number "
                + "of students to enter: ", 2, 15);
        
        return numStudents;
    }
    
    //*****************************************************************************************************
    
    public static int getScore(Scanner sc, int numStudents)
    {
        int score = Validator.getIntWithinRange(sc, "Student " + numStudents
                + " score: ", 0, 100);
        return score;
    }
    
    //*****************************************************************************************************
    
    public static void selecctionSort(Student[] students)
    {
        Student temp;
        
        for(int i = 0; i < students.length - 1; i++)
        {
            
            for(int j = i + 1; j < students.length; j++)
            {
                
                if(students[i].getLastName()
                        .compareTo(students[j].getLastName()) > 0)
                {
                    temp = new Student(students[j]);
                    students[j] = students[i];
                    students[i] = temp;
                }
                
            }
            
        }
        
    }
    
    //*****************************************************************************************************
    
    public static void print(Student[] students)
    {
        String output = "";
        System.out.println();
        
        for(int i = 0; i < students.length; i++)
        {
            output = students[i].toString();
            System.out.println(output);
            output = "";
        }
    }
}

//*****************************************************************************************************

/*
Welcome to the Student Score Application

Enter the number of students to enter: 4

Student 1 last name: Steelman
Student 1 first name: Andrea
Student 1 score: 95

Student 2 last name: Murach
Student 2 first name: Joel
Student 2 score: 92

Student 3 last name: Lowe
Student 3 first name: Doug
Student 3 score: 82

Student 4 last name: Murach
Student 4 first name: Mike
Student 4 score: 95


Lowe, Doug: 82
Murach, Joel: 92
Murach, Mike: 95
Steelman, Andrea: 95
*/