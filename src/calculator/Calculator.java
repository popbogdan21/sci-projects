package calculator;

import java.util.Scanner;
import java.lang.*;

public  class Calculator {

    public  double calculator() {
        double firstNumber;
        double lastNumber;
        String operation = new String("");

        firstNumber = inputVariables("first");
        lastNumber = inputVariables("second");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please input the operation you want to perform (please use + , -, *, / ): ");
        operation = scan1.nextLine();
        //System.out.println("The result of the requested operation is: "+calculator(operation));
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
            default: {
                System.out.println("Unknown operation requested by user\nProgram will exit now:");
                System.exit(0);
            }
        }
        return 0;
    }

    public double inputVariables(String a) {
        String tempNumber = new String("");
        System.out.println("Please insert the "+a+" number:");
        Scanner scan = new Scanner(System.in);
        tempNumber = scan.nextLine();
        if (iSDouble(tempNumber)) {
            return Double.parseDouble(tempNumber);
        } else {
            System.out.println("Your input is a non-numeric variable.\nProgram will exit now");
            System.exit(0);
        }
        return 0;
    }

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

