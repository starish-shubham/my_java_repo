import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size of matrix
        System.out.print("Enter Rows of matrix: ");
        int row = sc.nextInt();
        System.out.print("Enter Columns of matrix: ");
        int col = sc.nextInt();

        // declare 2d matrix
        int matrix2d[][] = new int[row][col]; 
        
        // input values of matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the value of" + "[" + i + "," + j + "]");
                matrix2d[i][j] = sc.nextInt();
            }
        }
        
        //output the matrix
        System.out.println("Your 2D matrix is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix2d[i][j] + " ");
            }
            System.out.println("");
            
        }
        
        // matrix multiplication
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
            }
            
        }
    
    
    }
}
