package Lr_06;

public class example10_03 {
    public static void main(String[] args){
        System.out.println("Вычисление данных из масива:");
        int[] a = new int[]{5,15,46,131,240,301,603,1002,1400,2002};
        System.out.print("Максимальное значение: ");
        program.MethodMax(a);
        System.out.print("Минимальное значение: ");
        program.MethodMin(a);
        System.out.print("Среднее значение: ");
        program.MethodMed(a);
    }

    static class program{
        static void MethodMax(int... num){
            int[] nums = num;
            int b = 0;
            for ( int a = 0; a < num.length; a++){
                if (b < num[a]);{
                    b = num[a];
                }
            }
            System.out.println(b);
        }

        static void MethodMin(int... num){
            int[] nums = num;
            double b = 3000;
            for (int a = 0; a < num.length; a++){
                if (b > nums[a]){
                    b = nums[a];
                }
            }
            System.out.println(b);
        }

        static void MethodMed(int... num){
            int[] nums = num;
            double b = 0;
            for (int a = 0; a < nums.length; a++){
                b += num[a];
            }

            b = b/nums.length;
            System.out.println(b);

        }
    }
}
