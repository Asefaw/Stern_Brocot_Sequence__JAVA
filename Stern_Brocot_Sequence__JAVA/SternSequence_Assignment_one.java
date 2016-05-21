/**
 * @author Asefaw Mekuria
 * Math 2540
 * Project 2 
 * Assignment 1 Stern Sequence
 */
package sternsequence_assignment_one;

import java.util.ArrayList;
import java.util.Scanner;

 
public class SternSequence_Assignment_one {

    static ArrayList<Integer> list = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
         
       int s1 = 1;
       int s2 = 1;
       list.add(s1);
       list.add(s2); 
       
       //get input from user
       Scanner sc = new Scanner(System.in);
       System.out.println("How many sequence do you want to generate ?");
       int limit = sc.nextInt();
       
       // call method that generate stern sequence  
       gen_stern_seq(limit);
    }
    
    public static void gen_stern_seq(int n){      
        /*
        the loop below will generate stern sequence by 
        adding the last two and carring over the last term 
        adn add them to the list*/
        
       for(int j = 1; list.size() < n; j++){
           int temp = list.get(j); // this gets s1 2nd element in the list
           int previous = list.get(j - 1); // this is s0 the 1st element in the list
           int current = temp + previous;
           list.add(current); // adds the next number to the list which is the sum of previos two
           list.add(temp); // adds the last number to the list
       }
       
       //print out the generated numbers from the list
       System.out.println("The "+n+ " generated numbers are:");
       for(int i = 0; i < list.size(); i++){
           System.out.print(list.get(i) + ", ");
       }
    }
    
}
