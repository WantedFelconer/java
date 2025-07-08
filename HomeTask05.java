//HomeTask05

import java.util.Scanner;
public class HomeTask05{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] arr2D = {{0, 0, 10, 0, -1},
                      {0, -1, 0, 0, -1},
                      {-1, 0, -1, 0, 0},    //row and col pos = 3,2
                      {0, -1, 7, 0, -1},
                      {0, -1, 0, -1, 0}
    };
    System.out.println("Initial Map:");
    printMap(arr2D);
    int row = arr2D.length;
    int col = arr2D[0].length;
    int row_pos = -1, col_pos = -1;
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            if ((row_pos!=-1)&& (col_pos!=-1)){
                break;
            }
            if (arr2D[i][j]==7){
                row_pos = i;
                col_pos = j;
                break;
            }
        }
    }
    int player = arr2D[row_pos][col_pos];
    int turns = 5;                            //NEED TO INTEGRATE THE MECHANISM OF FALLING OUT OF THE MAP
    int temp =0;
    while (turns > 0) {
      int new_row = row_pos, new_col = col_pos;
      System.out.printf("Enter move %d: ",(6-turns));
      String inp = sc.nextLine();
      if (inp.equals("UP")){
        new_row = row_pos-1;
        temp = arr2D[new_row][col_pos];
        arr2D[new_row][col_pos]=player;
        arr2D[row_pos][col_pos]=0;
        row_pos=new_row;
      }else if (inp.equals("RIGHT")){
        new_col = col_pos+1;
        temp = arr2D[row_pos][new_col];
        arr2D[row_pos][new_col]=player;
        arr2D[row_pos][col_pos]=0;
        col_pos=new_col;
      }else if (inp.equals("LEFT")){
        new_col = col_pos-1;
        temp = arr2D[row_pos][new_col];
        arr2D[row_pos][new_col]=player;
        arr2D[row_pos][col_pos]=0;
        col_pos=new_col;
      }else if (inp.equals("DOWN")){
        new_row = row_pos+1;
        temp = arr2D[new_row][col_pos];
        arr2D[new_row][col_pos]=player;
        arr2D[row_pos][col_pos]=0;
        row_pos=new_row;
      }else{
        System.out.println("Invalid Operation");
      }
      if (temp == -1){
        System.out.println("Player stepped on mine. Game Over!");
        break;
      }else if(temp == 10){
        System.out.println("Treasure found. You win!");
        System.out.println("Final state:");
        printMap(arr2D);
        break;
      }
        // for(int i=0;i<arr2D.length;i++){
        //   for(int j=0;j<arr2D[0].length;j++){
            
        //   }
        

      
      /*To-do: Based on the input update the player position and check if
       * 1. the player fell out of the grid
       * 2. player stepped on mine
       * 3. player found the treasure
       * otheriwse, update the player position */
      System.out.println("Current state:");
      printMap(arr2D);
      turns--;
    }
    if (turns == 0) {
      System.out.println("Failed to find the treasure.");
    }
  }
  
  public static void printMap(int[][] arr) { 
    for (int i=0; i<arr.length; i++){
      for (int j=0; j<arr[0].length;j++){
        System.out.print(arr[i][j]+"        ");
      }
      System.out.println();
    }
  }
}