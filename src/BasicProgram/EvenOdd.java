package BasicProgram;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.fineEvenOdd();

    }
    public void fineEvenOdd(){
        int a = 20;
        if (a % 2 == 0 ){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
