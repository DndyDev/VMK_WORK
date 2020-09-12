package ru.vmk;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        String message = "This is a very secret message !!!";

        BigInteger aPublic = BigInteger.valueOf(197);
        BigInteger bPublic = BigInteger.valueOf(151);

        BigInteger aPrivate = BigInteger.valueOf(199);
        BigInteger bPrivate = BigInteger.valueOf(157);

        DHEndpoint Alice = new DHEndpoint(aPublic,bPublic,aPrivate);
        DHEndpoint Bob = new DHEndpoint(aPublic,bPublic,bPrivate);

        BigInteger aPartial = Alice.generatePracticalKey();
        System.out.println(aPartial);
        BigInteger bPartial = Bob.generatePracticalKey();
        System.out.println(bPartial);

        BigInteger aFull = Alice.generateFullKey(bPartial);
        System.out.println(aFull);
        BigInteger bFull = Bob.generateFullKey(aPartial);
        System.out.println(bFull);

        String aEncrypted = Alice.encryptMessage(message);
        System.out.println(aEncrypted);

        message = Bob.decryptMessage(aEncrypted);
        System.out.println(message);
    }

}
