//HomeTask03

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0;i<len;i++){
            int input = sc.nextInt();
            arr[i]=input;
        }
        for (int j=0;j<len;j++){
            int temp = arr[j];
            arr[j]=arr[len-1];
            arr[len-1]=temp;
            len-=1;
        }
        //System.out.println(Arrays.toString(arr));
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        sc.close();

        
    }
}
