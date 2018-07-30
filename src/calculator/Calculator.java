/*
 Class Calculator has three methods
    @first method calculator()
            @calls methods inputVariables()- which reads the two variable
            @reads the operation type --
            @returns the value of the requested operation as a double or a exits the program with a statement
                informing the user that the requested operation is not valid

    @second method inputVariables()
            @calls the isDouble() method to check if the user input is a number
            @reads the two variables if the isDouble() method checks them as numbers or
                exit with a statement informing the user that the input does not correspond to a number

    @third method isDouble()
            @check if the user input(@parameter string) which is read as a string
            corresponds to a numeric value
            return boolean true or false

 */

package calculator;

import java.util.Scanner;
import java.lang.*;

public  class Calculator {

    public  double calculator() {
        //@Definition of the variables that store the two numbers as double type variables
        double firstNumber;
        double lastNumber;

        //@Definition of  the variable that stores the operration
        String operation = new String("");

        //@Call method inputVariables with parameter "first" for command line output
        firstNumber = inputVariables("first");

        //@Call method inputVariables with parameter "second" for command line output
        lastNumber = inputVariables("second");

        //Definition of new Scanner used to read the operation
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please input the operation you want to perform (please use + , -, *, / ): ");
        //@Performing operation read
        operation = scan1.nextLine();
        //@Usage of switch to determine the operation to be performed
        switch (operation) {
            case "+": {
                return (firstNumber + lastNumber);
            }
            case "-": {
                return (firstNumber - lastNumber);
            }
            case "*": {
                return (firstNumber * lastNumber);
            }
            case "/": {
                if (lastNumber != 0) {
                    return (firstNumber / lastNumber);
                } else {
                    System.out.println("Division by zero is not allowed\nProgram will exit now");
                    System.exit(0);
                }
                return 0;
            }
            //Informs the user that the requested operation is not valid
            default: {
                System.out.println("Unknown operation requested by user\nProgram will exit now:");
                System.exit(0);
            }
        }
        return 0;
    }

    public double inputVariables(String a) {
        //@Define a temporary variable that store the user input
        String tempNumber = new String("");

        //Defines a scanner for user input
        System.out.println("Please insert the "+a+" number:");
        Scanner scan = new Scanner(System.in);

        //@Reads the user input and stores it in the tempNumber variable
        tempNumber = scan.nextLine();

        /*@calls functon isDouble to validate the user input as a numeric value
           @if the input is valid the function will return the user input converted as a double type
            @if the input is not valid the function informs the user about this and exits
         */
        if (iSDouble(tempNumber)) {
            return Double.parseDouble(tempNumber);
        } else {
            System.out.println("Your input is a non-numeric variable.\nProgram will exit now");
            System.exit(0);
        }
        return 0;
    }
    /*
        @the function attempts a conversion from of the parameter string to double type
        @if successful it returns true;
        @else it return false
    */
    public boolean iSDouble(String tempNumber) {
            try {
                Double.parseDouble(tempNumber);
                return true;
            }
            catch (NumberFormatException nfe){
                return false;
            }
    }

}

