/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;


public class Rollno_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter name of five students");
        String[] name=new String[5];
        int[] roll=new int[5];
   
        for (int i=0;i<5;i++)
        name[i]=sc.nextLine();
                System.out.println(" enter roll number of five students");
         for (int i=0;i<5;i++)
        roll[i]=sc.nextInt();
          for (int i=0;i<5;i++)
            System.out.println(name[i]+"\t"+roll[i]);
    
}
}
