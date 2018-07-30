package calculator;

/* The program allows  user defined basic arithmetic functions
    to be performed on two user defined numbers with user defined actions
    Written by Pop Bogdan
    Class Main has a single method main()
 */
public class Main{
public static void main(String[]args){
        System.out.println("This program allows you to "+
        "perform basic operations between "+
        "two given numbers");

        //Creates new class variable Calculator
        Calculator c= new Calculator();

        //Calls the calcutaor method in the Calcutator class
        System.out.println("The result of the requested operation is: "+c.calculator());

        }
}