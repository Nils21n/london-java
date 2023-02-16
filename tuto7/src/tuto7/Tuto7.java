/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto7;

import java.util.Scanner;

/**
 *
 * @author 932254291
 * Write an application that prompts the user to enter a number to use as an array size, and then attempt to declare an array using the entered size. If the array is created successfully, display an appropriate message. 
Java generates a NegativeArraySizeException if you attempt to create an array with a negative size
Use a catch block that executes if the array size is negative, displaying a message that indicates the array was not created. Save the file as NegativeArray.java. 


 */
public class Tuto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arraysize;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number which it will be use for the array size");
        arraysize=input.nextInt();
                try{
            int [] array =new int[arraysize];
            System.out.println("the array is successfully created,good job !");
        }
        catch(NegativeArraySizeException e){
            System.out.println("error "+e.getMessage()+" because is a negative number");

        }
    }
    
}
