package Timus;

import java.util.Scanner;
public class example10_1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] arr = new String[num+2];
        for (int i = 0; i < arr.length-2; i++) {
            arr[i] = in.nextLine();
        }
        for(String x : arr){
            if (x.charAt(0) == 'a' || x.charAt(0) == 'h' || x.charAt(1) == '1' || x.charAt(1) == '8')
                System.out.println(2);
        }
    }
}
