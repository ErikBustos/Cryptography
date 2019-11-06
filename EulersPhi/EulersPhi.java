package EulersPhi;

public class EulersPhi{
    public static void main(String[] args){ 
        int n=319; 
        System.out.println("phi(" + n + ") = " + phi(n)); 
    } 

//Euler's Phi function that returns the number of integers relatively prime to m
    static int phi(int m){  
        int result = 1; 
        for (int i = 2; i < m; i++) 
            if (gcd(i, m) == 1) 
                result++; 
        return result; 
    } 


// Function to calculate GCD of a and b 
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
 

}
