package patterns;

import java.sql.SQLOutput;

public class Pattern5 {
    public static void main(String[] args){

        pattern(5);

    }
    static void pattern(int n){

        for(int row =1; row<=n; row++){
            for(int col =1; col<=n-row+1; col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }

    }
}
