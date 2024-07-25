package basicsjava;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how may times the coin is filpped:");
        int coin= sc.nextInt();
        System.out.println(Math.random());
        if(Math.random()<0.5){
            System.out.println("Percentage of tails are" +Math.random()/coin*100);
        }
        else{
            System.out.println("Percentage of heads are" +Math.random()/coin*100);
        }

    }
}
