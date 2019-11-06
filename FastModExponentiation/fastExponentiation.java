package FastModExponentiation;

import java.math.BigInteger;

public class fastExponentiation{

    public static void main(String[] args){

        int a= 851515;
        int n= 15;
        int z= 8;

        System.out.println(fastModExponentiation(a,n,z));

        BigInteger a1= new BigInteger("1363172135135135");
        BigInteger n1= new BigInteger("124125631713713");
        BigInteger z1= new BigInteger("131516");
        System.out.println(bigFastModExponentiation(a1,n1,z1));
    }

    //return a^n mod(z) by using the fast exponentiation algorithm
    public static int fastModExponentiation(int a, int n, int z){
        int result= 1;
        int x= a % z;
        while(n > 0){
            if(n % 2 ==1)
                result = (result*x) % z;
            x= (x*x) %z;
            n = n/2;
        }
        return result;
    }

    /*return a Big Integer a^n mod(z) by using the fast exponentiation algorithm 
    you can use this when working with big numbers */
    public static BigInteger bigFastModExponentiation(BigInteger a, BigInteger n, BigInteger z){
        BigInteger result = new BigInteger("1"); 
        BigInteger two = new BigInteger("2"); 
        BigInteger x = a.mod(z);
        while(n.compareTo(BigInteger.ZERO) ==1){
            if(n.mod(two).equals(BigInteger.ONE))
                result= result.multiply(x).mod(z);
            x= x.multiply(x).mod(z);
            n= n.divide(two);
        }
        return result;
    }
}