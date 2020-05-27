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
public class Wonders24 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the country:");
        String s=sc.nextLine();
        String[] country={"India","Mexico","Brazil","Italy","China","Peru","Jordan","Egypt"};
        String[] wonders={"Taj Mahal","Chichen Itza","Christ the Redeemer","Colosseum","Great Wall of China","Machu Picchu","Petra","Great Pyramid of Giza"};
        for(int i=0;i<8;i++)
        {
            if(s.equalsIgnoreCase(country[i]))
            {
                System.out.println(wonders[i]);
break;            }
        }
     }
    
}
