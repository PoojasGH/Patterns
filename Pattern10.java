package patterns;

public class Pattern10 {

    public static void main(String[] args){
        pattern(5);

    }
    static void pattern(int n){
        for(int row=0; row<=n; row++){
            int spaces= row;
            for (int s=0; s<=spaces; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=n-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
