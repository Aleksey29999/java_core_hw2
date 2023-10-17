package org.example;

public class NearElements {
    public static boolean nearElement(int array[]) {
        for (int i = 1; i < array.length-1; i++) {
            if ((array[i-1] == 0) && (array[i] == 0)) {
                return true;
            }
        }
        return false;
    }
}

