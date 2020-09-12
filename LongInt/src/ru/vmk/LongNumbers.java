package ru.vmk;

import java.math.BigInteger;

public class BigPow {
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
//    public static boolean testMillerRabin(BigInteger number){
//        if(number.equals(BigInteger.valueOf(2))|| number.equals(BigInteger.valueOf(3)))
//            return true;
//        if(number < BigInteger.valueOf(2))
//    }
}
