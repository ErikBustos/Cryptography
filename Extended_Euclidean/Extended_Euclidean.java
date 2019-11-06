package Extended_Euclidean;

import java.math.BigInteger;

public class Extended_Euclidean{
    public static void main(String[] args){
		
		BigInteger a = new BigInteger("103"); 
        BigInteger b = new BigInteger("2035800"); 
		Extended_Euclidean ee = new Extended_Euclidean();
		System.out.println(ee.xeuclid(a,b));
    }

    public BigInteger xeuclid(BigInteger a, BigInteger b){
        BigInteger x[]= new BigInteger[2];
        BigInteger y[]= new BigInteger[2];
        BigInteger q,r, xx ,yy;
        int sign = 1;
        BigInteger bCopy= b;

        //initializes the coefficients
        x[0] = BigInteger.ONE; x[1]= BigInteger.ZERO;
        y[0] = BigInteger.ZERO;  y[1] = BigInteger.ONE;
        
        // As long as b != 0 we replace a by b and b by a % b.
        while( !b.equals(BigInteger.ZERO) ){
            r= a.mod(b);
            q= a.divide(b);
            a= b;
            b= r;
            xx= x[1];
            yy= y[1];
            x[1] = (q.multiply(x[1])).add(x[0]);
            y[1] = (q.multiply(y[1])).add(y[0]);
            x[0] = xx;
            y[0] = yy;
            sign = -sign;
        }
        //Final computation of the coefficients

        x[0] = x[0].multiply(new BigInteger(String.valueOf(sign)));
        y[0] = y[0].multiply(new BigInteger(String.valueOf(-sign)));
        System.out.println(" x : " + x[0] );
        System.out.println(" y : " + y[0] );

        if(x[0].compareTo(BigInteger.ZERO) < 0) { //less than 0
            System.out.println("The inverse is: " + (bCopy.add(x[0])));
            return bCopy.add(x[0]);
        } else { //equal or greater than 0
            System.out.println("The inverse is : " + x[0]);
            return x[0];
        }
    }
}