package BasicProgram;

public class MathOperation {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        mathOperation.sumTotal();
        mathOperation.multi();
        mathOperation.division();
        mathOperation.difference();
    }

    public void sumTotal(){
        int a = 80;
        int b = 50;
        int sum = a + b;
        System.out.println("Sum is"+ sum);
    }
    public void multi(){
        int a = 80;
        int b = 50;
        int mul = a * b;
        System.out.println("multiplication" + mul);
    }
    public void difference(){
        int a = 80;
        int b = 50;
        int min = a - b;
        int div = a / b;
        System.out.println("Difference" + min);
    }
    public void division(){
        int a = 80;
        int b = 50;
        int div = a / b;
        System.out.println("Division" + div);
    }
}
