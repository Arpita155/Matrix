package Array_Matrix_String.Matrix;

import java.util.Scanner;
public class UserInputForMatrix {
    public static void main(String[] args) {

        //Q taking user input create a 2x2 matrix and display its element .
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row for the matrix:");
        int r1 = sc.nextInt();
        System.out.println("enter the column for the matrix:");
        int c1 = sc.nextInt();
        int [][]M1 = new int[r1][c1];
        for(int i=0;i<M1.length;i++){
            System.out.println("enter the elements for "+(i+1)+" rows");
            for(int j=0;j<M1[i].length;j++){
                M1[i][j]=sc.nextInt();
            }
        }
        System.out.println("user inputted matrix:");
        for(int i=0;i<M1.length;i++){
            for(int j=0;j<M1[i].length;j++){
                System.out.print(M1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
