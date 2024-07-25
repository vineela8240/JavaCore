package basicsjava;

import java.util.Scanner;

public class StingComparision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string s1");
        String s1=sc.nextLine();
        System.out.println("enter string s2");
        String s2=sc.nextLine();
        if(s1.equals(s2)){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Not equal");
        }
        sc.close();


        }
    }
