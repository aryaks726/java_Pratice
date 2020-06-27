package basic_Practice;

import java.util.Scanner;

public class volwel_Consonent {
   //a, e, i, o, u are vowels
   char ch;
   public void getInput(){
      System.out.println("Enter character: ");
      Scanner sc = new Scanner(System.in);
      ch = sc.next().charAt(0);

      if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
         System.out.println(ch +" is vowel ");
      }else {
         System.out.println(ch +" is consonent");
      }
   }

   public static void main(String[] args) {
      volwel_Consonent alphabetIsVowelOrConsonant = new volwel_Consonent();
      alphabetIsVowelOrConsonant.getInput();


   }


}
