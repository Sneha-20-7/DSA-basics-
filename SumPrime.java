public class SumPrime {
    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10, sum = 0;

        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                sum += i;
            }
        }

        System.out.println("Sum = " + sum);
    }
}