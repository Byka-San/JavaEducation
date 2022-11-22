package Lr_06;

public class example10_08 {
    public static void main(String[] args) {
    int[] x = new int[]{432,38,5632,68,728};
    System.out.print("Среднее значение элементов в массиве: "+Medium.program(x));
}
    static class Medium{
        static double program(int[] nums){
            double result=0;
            for (int a=0; a< nums.length;a++){
                result+=nums[a];
            }
            result/=nums.length;
            return result;
        }
    }
}