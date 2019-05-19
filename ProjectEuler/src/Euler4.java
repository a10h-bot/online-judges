/*The prime factors of 13195 are 5, 7, 13 and 29.

        What is the largest prime factor of the number
        600851475143

          ? */
public class Euler4 {
    public static void main(String[] args) {
        long l = Long.valueOf("600851475143");
        var o = 0;
        var valMax=0;
        for (var i=2;i<=Math.sqrt(l);i++){
            if(isPrime(i) && l%i==0) if (i > valMax) {
                valMax = i;
            }
        }
        System.out.println(valMax);
    }
    private static boolean isPrime(int n){
        var res= true;
        for (var i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                res=false;
            }
        }
        return res;
    }
}
