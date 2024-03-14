public class Shatles {
    public static void main(String[] args){
        int[] shatles = new int[100];
        int a= 1;
        while (a <= 100){
            if(a % 10 != 4 && a % 10 != 9){
                shatles[a - 1] = a;
            }
            a++;
        }
        System.out.println("Numbers of shatles : ");
        for (int i = 0; i < shatles.length; i++) {
            if(shatles[i] != 0){
                System.out.print(shatles[i] + ", ");
            }
        }
    }
}
