package ru.vmk;

public class Main {

    public static void main(String[] args) {
        System.out.println(binpow(2,4));
    }
// Бинароное(двоичное) возведение в степень
     private static int binpow(int x, int n){
        if( n == 0) {
            return 1;
        }

        if(n % 2 == 1){
           return binpow(x, n - 1) * x ;
        } else {
             int b = binpow(x,n / 2);
            return b * b;
        }


    }
}
