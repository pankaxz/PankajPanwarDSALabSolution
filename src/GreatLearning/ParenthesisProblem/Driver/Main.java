package GreatLearning.ParenthesisProblem.Driver;

import GreatLearning.ParenthesisProblem.Services.ParenthesisBalance;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Problem 1 : Write a program of Balancing Brackets, use a suitable data structure to print whether the string
 * entered is a Balanced Brackets or Unbalanced String
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        ParenthesisBalance parenthesisBalance = new ParenthesisBalance();

        System.out.println("Enter an expression");
        String expression = sc.next();

        //Checking if the expression has any unwanted values.
        try{
            for(int i = 0; i < expression.length(); i++){
                if(expression.charAt( i ) != ('{') &&
                   expression.charAt( i ) != ('}') &&
                   expression.charAt( i ) != ('(') &&
                   expression.charAt( i ) != (')') &&
                   expression.charAt( i ) != ('[') &&
                   expression.charAt( i ) != (']')) {
                    throw new InputMismatchException();
                }
            }
        }catch (Exception e){
            System.out.println(e + " Please enter a correct expression");
            System.exit( 0 );
        }

        if( parenthesisBalance.CheckBalance( expression ) ){
            System.out.println("The entered String has Balanced Brackets");
        }
        else{
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
}
