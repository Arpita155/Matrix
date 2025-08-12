package Array_Matrix_String.Matrix;

public class SumOfAllMatrixElements {
    public static void main(String[] args) {

        //Q5. Sum of all elements in a 2X2 matrix.
        int [][]arr={
                {1,2},
                {3,4}
        };
        int sum=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("The matrix is: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nsum of all elements in the matrix is = "+sum);

    }
}
