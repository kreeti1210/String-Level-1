/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;
public class Capital3 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        int cc=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
                    if((int )c>=65 && (int)c<=90)
                        cc++;
                        
        }
        System.out.println(cc);
        
    }
}
