package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] BunchOfUnsortedValues = {10,1,2,0,15,9,7};
        Bubble_Sort(BunchOfUnsortedValues);
        System.out.println(Arrays.toString(BunchOfUnsortedValues));
    }


    public static void Bubble_Sort(int[] BunchOfUnsortedValues){
        for (int mainElement = 0; mainElement < BunchOfUnsortedValues.length; mainElement++) {
            for (int secondElement = 1; secondElement < BunchOfUnsortedValues.length-mainElement; secondElement++) {
                // checking and swapping the values
                if(BunchOfUnsortedValues[secondElement-1] > BunchOfUnsortedValues[secondElement]){
                    int temp = BunchOfUnsortedValues[secondElement-1];
                    BunchOfUnsortedValues[secondElement-1] = BunchOfUnsortedValues[secondElement];
                    BunchOfUnsortedValues[secondElement] = temp;
                }
            }
        }
    }
}