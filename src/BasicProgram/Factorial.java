package BasicProgram;

class Factorial{
    public static void main(String args[]){
        Factorial obj = new Factorial();
        obj.findFact();

    }
    public void findFact(){
        int i;
        int num = 5;
        int fact = 1;
        for (i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of "+ num + " is: "+ fact);
    }


}