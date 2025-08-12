package Array_Matrix_String.Matrix;

public class AdditionMatrixOfTwoMatrices {
    public static void main(String[] args) {

        //Q2. Create a matrix by adding two 2X2 matrices.
        int [][] matrix1={
                {1,2},
                {3,4}
        };
        int [][] matrix2={
                {5,6},
                {7,8}
        };
        int [][]sum=new int [2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        System.out.println("First matrix is: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second matrix is: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("addition matrix of the two matrices:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
