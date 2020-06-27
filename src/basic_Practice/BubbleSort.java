package basic_Practice;

public class BubbleSort {

    public static void swap(int[] arrayValue, int i, int j){
        if (i==j){
            return;
        }

        int temp = arrayValue[i];
        arrayValue[i] = arrayValue[j];
        arrayValue[j] = temp;

    }

    public static void main(String[] args) {
        int[] intArray = {5, 20, -7, 60, 45, 22};

        for (int lastUnsortedArrayIndex = intArray.length - 1; lastUnsortedArrayIndex>0;
             lastUnsortedArrayIndex--){
            for (int i =0; i<lastUnsortedArrayIndex; i++){
                if (intArray[i]> intArray[i+1]){
                    swap(intArray, i, i + 1);
                }

            }
        }
        for (int i = 0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

}
