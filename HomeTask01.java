//HomeWorkTask1

import java.util.Scanner;

public class HomeTask01{
    public static void main(String[] args){
        System.out.println("Enter your 2 desired numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num = 0;
        int prime = 0;
        int prime_count = 0;
        if (num1>num2){
            num = num1;
            num1 = num2;
            num2 = num;
        }
        num = num1;

        num = num1;
        for (int i=num1+1;i<num2;i++){
            num+=1;
            prime_count = 0;
            for (int j=1;j<num+1;j++){
                if (num%j==0){
                    prime_count+=1;
                }
        }
        if (prime_count==2){
            prime+=1;
        }
        
        //System.out.println(num + " " + prime_count);
    }
    System.out.println("There are "+prime+" prime numbers "+"between "+num1+ " and "+ num2); 
    sc.close();
}}