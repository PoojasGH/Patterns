package patterns;

public class Pattern8 {
    public static void main(String[] args){

        pattern(5);
        }
    static void pattern(int n)
    {
        for(int row=1; row<=n; row++){
            int spaces = n- row;
            for(int s=0; s<=spaces;s++) {
                System.out.print("  ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}
