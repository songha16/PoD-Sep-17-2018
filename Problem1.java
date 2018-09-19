/*Pho Ngoc Song Ha - PoD Tue, Sep 18, 2018
 * Banner ID: B00804498
 * This program will read user's name and marks, then calculate the total grade percentage*/
import java.util.Scanner; //import Scanner class
public class Problem1{
  public static void main(String[] args){
    double test, assignment, lab, total; //declare "test", "assignment", "lab" and "total" as double variables
    Scanner kb=new Scanner(System.in); //variables will be inputted from the keyboard
    String name; //declare "name" as a string
    System.out.println("Please enter your name: "); //print the line that asks user to enter name
    name = kb.nextLine(); //read "name" from the keyboard
    System.out.println("Enter your test mark: "); //print the line that asks user to enter test mark
    test=kb.nextDouble(); //read "test" from the keyboard
    System.out.print("Enter your assignment mark: "); //print the line that asks user to enter assignment mark
    assignment=kb.nextDouble(); //read "assignment" from the keyboard
    System.out.print("Enter your lab mark: "); //print the line that asks user to enter lab mark
    lab=kb.nextDouble(); //read "lab" from the keyboard
    total= (test*0.5+assignment*0.35+lab*0.15)*10; //calculate the total percentage
    System.out.print(name); //print "name" to the screen
    System.out.print(" Total Grade: "+total+"%"); //print the grade on the same line*/
  }
}
