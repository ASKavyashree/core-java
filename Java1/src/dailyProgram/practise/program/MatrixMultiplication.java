package dailyProgram.practise.program;
import java.util.Scanner;
public class MatrixMultiplication {
    public int[][] multiply(int[][] A,int [][] B,int r1,int c1,int c2){
        int[][] result= new int[r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    result[i][j] += A[i][k] *B[k][j];
                }
            }
        }
        return result;
    }
    public void printMatrix(int[][] matrix){
        for(int[] row: matrix){
            for(int val:row){
                System.out.println(val + "");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MatrixMultiplication mm=new MatrixMultiplication();

        System.out.println("Enter rows and columns of first matrix: ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        System.out.println("Enter rows and columns of second matrix: ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];

        System.out.println("Enter first matrix: ");
        for(int i=0;i<r1;i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second matrix");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B[i][j]=sc.nextInt();
            }
        }
        int[][] result=mm.multiply(A,B,r1,c1,c2);
        System.out.println("Result matrix :");
        mm.printMatrix(result);
    }
}
