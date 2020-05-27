/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Merit25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter name of five students");
        String[] name=new String[5];
        int[] marks=new int[5];
        char[] grade=new char[5];
        for (int i=0;i<5;i++)
        name[i]=sc.nextLine();
                System.out.println(" enter number of five students");
         for (int i=0;i<5;i++)
        marks[i]=sc.nextInt();
         for (int i=0;i<5;i++)
         {
             int t=marks[i];
             if(t>=90)
                 grade[i]='A';
             else if(t>=80 && t<90)
                 grade[i]='B';
              else if(t>=70 && t<80)
                 grade[i]='C';
              else if(t>=60 && t<70)
                 grade[i]='D';
              else if(t>=50 && t<60)
                 grade[i]='E';
             else
                  grade[i]='F';
         }
         
         System.out.println("RESULT:");
           for (int i=0;i<5;i++)
            System.out.println(name[i]+"\t"+marks[i]+"\t"+ grade[i]);
         
         
        
        
    }
    
}
