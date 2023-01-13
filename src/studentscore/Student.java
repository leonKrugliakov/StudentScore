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
//      1.  StudentDriver.java  -  Contains the main method
//      2.  Validator.java  -  Contains the Validator class
//
//*****************************************************************************************************

//package studentscore;

public class Student 
{
    private String firstName,
            lastName;
    private int score;
    
    //*****************************************************************************************************
    
    public Student()
    {
        firstName = "";
        lastName = "";
        score = 0;
    }
    
    //*****************************************************************************************************
    
    public Student(String firstName, String lastName, int score)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }
    
    //*****************************************************************************************************
    
    public Student(Student stu)
    {
        this.firstName = stu.firstName;
        this.lastName = stu.lastName;
        this.score = stu.score;
    }
    
    //*****************************************************************************************************
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    //*****************************************************************************************************
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    //*****************************************************************************************************
    
    public void setScore(int score)
    {
        this.score = score;
    }
    
    //*****************************************************************************************************
    
    public String getFirstName()
    {
        return firstName;
    }
    
    //*****************************************************************************************************
    
    public String getLastName()
    {
        return lastName;
    }
    
    //*****************************************************************************************************
    
    public int getScore()
    {
        return score;
    }
    
    //*****************************************************************************************************
    
    public String toString()
    {
        String output = this.getLastName() + ", " + this.getFirstName() + ": " 
                + this.getScore();
        return output;
    }
}
