package org.example;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;

public class MaxMin {
    public static int max_minArrayElements(int array[]) {
        int result = 0;
//       int[] sortArray = new int[];
       Arrays.sort(array);
        result = array[array.length-1] - array[0];
        return result;
    }
}
