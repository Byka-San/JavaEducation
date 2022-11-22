package Lr_06;

public class example10_10 {
    public static void main(String[] args) {
        int[] a = new int[]{35,454,221,1182,2};

        System.out.println("Минимальным и минимальным числом являются: ");
        a = Lupa.go(a);
        for(int b=0;b<a.length;b++){
            System.out.print(a[b]+"  ");
        }
    }
    static class Lupa{
        static int[] go(int ... nums){
            int[] c = nums;
            int[] num = new int[2];
            int max = 0, min = 3;
            for (int b=0;b<c.length;b++){
                if (max<c[b]){
                    max=c[b];
                }
                if (min>c[b]){
                    min=c[b];
                }
            }
            num[0]=min;
            num[1]=max;
            return num;
        }
    }
}
