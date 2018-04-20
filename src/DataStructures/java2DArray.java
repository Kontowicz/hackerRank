package DataStructures;

import java.util.Scanner;

public class java2DArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max=0;
        int sum=0;
        boolean first = true;
        for(int i=0; i<=3; i++){
            for(int j=0; j<=3; j++){
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                        arr[i+1][j+1]+
                        arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(first){
                    max = sum;
                    first = false;
                }
                if(sum>max){
                    max = sum;
                }
                sum = 0;
            }
        }
        System.out.println(max);

    }
}