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
