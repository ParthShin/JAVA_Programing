public class OverloadingMethode {
    static int plusMethode(int x,int y){
        return x + y;
    }
    public static void main(String[] args) {
        int sum = plusMethode(1, 2);

        System.out.println(sum);
    }
}
