package Array_Matrix_String.Matrix;

public class SumOfElementsInEachRow {
    public static void main(String[] args) {

        //Q. Calculate and print the sum of all elements in each row.
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[i][j];
            }
            System.out.println("sum of elements in the row "+i +" = "+sum);
        }

    }
}
