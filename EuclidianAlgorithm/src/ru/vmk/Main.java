package ru.vmk;

public class Main {

    public static void main(String[] args) {
        System.out.println(5%10);
        System.out.println(10%5);
//        System.out.println(gcd(180180,23100));
    }
    public static int gcd (int a,int b){
        int temp;
        while (b != 0){
            temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}
