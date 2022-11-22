package Lr_06;

public class example10_06 {public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    array = test.getArray(array, 5);
    for (int i=0; i < test.getArray(array, 5).length; i++) {
        System.out.println(array[i]);
        }
    }
}


class test{
    public static int [] getArray (int[] array, int size){
        if(array.length < size) {
            return array;
        }
        int[] newArray = new int[size];
        for(int a = 0; a < size; a++){
            newArray[a]= array[a];
        }
        return newArray;
    }
}