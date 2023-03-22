import java.util.*;

public class A1103334_0317_1 {
    public static void main(String [] argv){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input number : ");
        int n = sc.nextInt();

        System.out.print("Please input number : ");
        int m = sc.nextInt();

        int[][] isArray = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               isArray[i][j]=(i+1)*(j+1);
               
            }
        }
        for(int[] array : isArray){
            for(int value : array){
                System.out.print(value+" ");

            }
            System.out.println();
        }
    }
}