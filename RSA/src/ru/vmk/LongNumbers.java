package ru.vmk;

import java.math.BigInteger;

public class LongNumbers {
    public static void main(String[] args) {
        BigInteger x = BigInteger.valueOf(2);
        BigInteger n = BigInteger.valueOf(4);

        System.out.println(binPow(x,n));
    }
    public static BigInteger binPow(BigInteger number, BigInteger n ){

        if(n.equals(BigInteger.valueOf(0))){
            return BigInteger.valueOf(1);
        }

        if (number.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(1))){
            return number.multiply(binPow(number,n.subtract(BigInteger.valueOf(1))));
        }else{
            BigInteger b = binPow(number,n.divide(BigInteger.valueOf(2)));
            return b.multiply(b);
        }

    }
    public static boolean testMillerRabin(BigInteger number, int k){
        if(number.equals(BigInteger.valueOf(2)) || number.equals(BigInteger.valueOf(3)))
            return true;
        if((number.compareTo(BigInteger.valueOf(2)) == -1 ) && ((number.mod(BigInteger.valueOf(2))).equals(0))){
            return false;
        }
        BigInteger t = number.subtract(BigInteger.valueOf(1));
        int s = 0;
        while( (t.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0)))){
            t = t.divide(BigInteger.valueOf(2));
            s += 1;
        }
        for (int i = 0; i < k; i++ ){
            
        }
    }
}
