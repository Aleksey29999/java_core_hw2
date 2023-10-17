package org.example;
public class SummArrayElements {

    public static int summArrayElements (int array[]){
        int count =0;
        for (int i=0; i< array.length; i++){
            if (array[i]%2==0) {
                count+= 1;
            }
        }
        return count;
    }
}
