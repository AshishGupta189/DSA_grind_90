public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibb(6));
    }

    static int fibb(int n){
        if(n<2) return n;

        return fibb(n-1) + fibb(n-2);
    }
}
