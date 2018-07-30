package calculator;

import calculator.Calculator;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main{
public static void main(String[]args){
        System.out.println("This program allows you to "+
        "perform basic operations between "+
        "two given numbers");
        Calculator c= new Calculator();
        System.out.println("The result of the requested operation is: "+c.calculator());
        }
}