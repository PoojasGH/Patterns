package patterns;

public class Pattern7 {
    public static void main(String[] args){
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1; row<=2*n-1; row++){

            int toltalnoofcolsinrow = row>n ? 2*n-row : row;

            int noofspaces = n-toltalnoofcolsinrow;

            for(int s=0; s<=noofspaces; s++){
                System.out.print(" ");
            }
            for(int col =1; col<=toltalnoofcolsinrow; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
