package patterns;

public class Pattern3 {
    public static void main(String[] args){

                patter(5);
    }
    static void patter(int n){

        for (int row = 1; row<=n; row++){
            for(int col =1; col <=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}