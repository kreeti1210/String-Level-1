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
public class VowelNames16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=new String[5];
        System.out.println("Enter the names");
        for( int i=0;i<5;i++)
        s[i]=sc.nextLine().toLowerCase();
        
        for(int i=0;i<5;i++)
        {
            if(s[i].startsWith("a")||s[i].startsWith("e")||s[i].startsWith("i")||s[i].startsWith("o")||s[i].startsWith("u"))
                System.out.print(s[i]+"\t");
        }
         
        
        
        
        
        
    }
    
}
