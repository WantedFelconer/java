//HomeTask04

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask04{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int count = 0;
        boolean duplicate = false;
        int[] arr = new int[N];
        for (int i=0;i<N;i++){
            int input = sc.nextInt();
            arr[i]=input;
        }
        for(int i=0;i<N;i++){
            duplicate = false;
            for(int j=0;j<i;k++){
                if(arr[j]==arr[i]){
                    duplicate = true;
                    break;
                }
            }
            if(duplicate == true){
                continue;
            }
            
            for (int k=0;k<N;k++){
                if (arr[i]==arr[k]){
                    count+=1;
                }
            }
            System.out.println(arr[i]+" - "+ count + " times");
            count=0;
        }

        sc.close();
    }

}