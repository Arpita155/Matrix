package Array_Matrix_String.Matrix;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        //Q3. Matrix multiplication.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row for first matrix:");
        int r1 = sc.nextInt();
        System.out.println("enter the column for first matrix:");
        int c1 = sc.nextInt();
        System.out.println("enter the row for second matrix:");
        int r2 = sc.nextInt();
        System.out.println("enter the column for second matrix:");
        int c2 = sc.nextInt();
        int [][] M1 = new int[r1][c1];
        int[][] M2 = new int[r2][c2];
        if(c1==r2){
            for(int i=0;i<M1.length;i++){
                System.out.println("enter the elements of first matrix for "+(i+1)+" rows");
                for(int j=0;j<M1[i].length;j++){
                    M1[i][j]=sc.nextInt();
                }
            }
            System.out.println("user inputted first matrix:");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    System.out.print(M1[i][j]+" ");
                }
                System.out.println();
            }
            for(int i=0;i<M2.length;i++){
                System.out.println("enter the elements of second matrix for "+(i+1)+" rows");
                for(int j=0;j<M2[i].length;j++){
                    M2[i][j]=sc.nextInt();
                }
            }
            System.out.println("user inputted second matrix:");
            for(int i=0;i<M2.length;i++){
                for(int j=0;j<M2[i].length;j++){
                    System.out.print(M2[i][j]+" ");
                }
                System.out.println();
            }
            int [][]R = new int [c1][r2];
            for(int i=0;i<M1.length;i++){
                for(int j=0;j<M1[i].length;j++){
                    for(int k=0;k<c1;k++){
                        R[i][j]+=M1[i][k]*M2[k][j];
                    }
                }
            }
            System.out.println("matrix after multiplication:");
            for(int i=0;i<R.length;i++){
                for(int j=0;j<R[i].length;j++){
                    System.out.print(R[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Multiplication is not possible");
        }

    }
}
