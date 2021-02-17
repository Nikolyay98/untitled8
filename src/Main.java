import jdk.internal.util.xml.impl.Input;

import java.lang.reflect.Array;

public class Main {
    public static void main{
        System.out.println("Task 1.");
        int[] array = { 1, 1, 0, 0, 1, 1, 0, 0};

        System.out.println(Array.toString(array));
        changeZeroesAndOnes(array);
        System.out.println(Array.toString(array));

    }

    static void changeZeroesAndOnes(int[] inputArray){
        for (int i = 0, i < inputArray.length; i++){

            inputArray[i] = 1 - inputArray[i];
        }
    }

}
