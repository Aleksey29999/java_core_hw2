package org.example;
import java.util.Arrays;

import static org.example.MaxMin.max_minArrayElements;
import static org.example.NearElements.nearElement;
import static org.example.SummArrayElements.summArrayElements;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 0, 0, 1, 0, 4};
        System.out.println(Arrays.toString( arr));
        System.out.println();
        System.out.printf("если в переданном массиве есть два соседних элемента, с нулевым значением = %b", nearElement(arr));
        System.out.println();
        System.out.printf("Колличество четных элементов= %d", summArrayElements(arr));
        System.out.println();
        System.out.printf("Разница между максимальным и минимальным значением массива = %d", max_minArrayElements(arr));
        System.out.println();





    }


}