package FinalKeyword;
// put final in class name to make it final class, final class cannot be extended.
 public class PrintMsg {
    int length = 20;
    int breadth = 30;

    final void displayMessage(int a, int b) {
        this.length = a;
        this.breadth = b;
    }


}
