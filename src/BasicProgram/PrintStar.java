package BasicProgram;

public class PrintStar {
    public static void main(String[] args){
        PrintStar obj = new PrintStar();
        obj.Star();
        obj.revStar();

    }
    public void Star(){
        int i;
        int j;
        for(i=1; i<=6; i++)
        {
            for(j=1; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println(""); //To separate two modules of star
    }

    public void revStar(){
        for(int i = 5; i>=1; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} //End of class
