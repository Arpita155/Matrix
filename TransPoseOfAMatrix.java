package Array_Matrix_String.Matrix;

import java.util.Scanner;

public class TransPoseOfAMatrix {
    public static void main(String[] args) {

        //Q4. Find the Transpose of a 2X2 matrix.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements for the matrix:");
        int [][] M1=new int [2][2];
        for(int i=0;i<M1.length;i++){
            System.out.println("for row"+(i+1));
            for(int j=0;j<M1[i].length;j++){
                M1[i][j]=sc.nextInt();
            }
        }
        System.out.println("User inputted matrix:");
        for(int i=0;i<M1.length;i++){
            for(int j=0;j<M1[i].length;j++){
                System.out.print(M1[i][j]+"  ");
            }
            System.out.println();
        }

        int [][]TM=new int [2][2];
        for(int i=0;i<M1.length;i++){
            for(int j=0;j<M1[i].length;j++){
                TM[i][j]=M1[j][i];
            }
        }
        System.out.println("Transpose matrix: ");
        for(int i=0;i<M1.length;i++){
            for(int j=0;j<M1[i].length;j++){
                System.out.print(TM[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
