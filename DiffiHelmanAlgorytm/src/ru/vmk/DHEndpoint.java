package ru.vmk;

import java.math.BigInteger;

public  class DHEndpoint {
    private BigInteger publicKeyA;
    private BigInteger publicKeyB;
    private BigInteger privateKey;
    BigInteger fullKey;
//    int partialKey;


    public DHEndpoint(BigInteger publicKeyA, BigInteger publicKeyB, BigInteger privateKey) {
        this.publicKeyA = publicKeyA;
        this.publicKeyB = publicKeyB;
        this.privateKey = privateKey;
        this.fullKey = BigInteger.valueOf(0);
    }
    public  BigInteger generatePracticalKey(){
        return modExp(publicKeyA,privateKey,publicKeyB);
    }
    public BigInteger generateFullKey( BigInteger partialKeyR){
        fullKey = modExp(partialKeyR,privateKey,publicKeyB);
        return fullKey ;
    }
    public String encryptMessage (String message){
         StringBuilder encryptedMessage = new StringBuilder();
         BigInteger key = fullKey;
         for (int c = 0; c < message.length();c++){
             encryptedMessage.append((char) (c + key.intValue()));
         }
         return encryptedMessage.toString();
    }
    public String decryptMessage(String encryptedMessage){
        StringBuilder decryptedMessage = new StringBuilder();
        BigInteger key = fullKey;

        for (int c = encryptedMessage.length(); c > 0;c --){
            decryptedMessage.append((char) (c - key.intValue()));
        }
        return decryptedMessage.toString();
    }
//    Возведение в степень
    static   BigInteger modExp (BigInteger base, BigInteger
            exponent, BigInteger m) {
        int trailing_zero_bits_count = exponent.getLowestSetBit();
        if (trailing_zero_bits_count == -1) // exponent = 0
            return BigInteger.ONE.mod(m);  // return 1

        BigInteger z = modExp(base, exponent.shiftRight(1), m); // base**2)% (exponent//m
        BigInteger z_sq = z.pow(2).mod(m); // z**2 % m
        if (trailing_zero_bits_count != 0) // even
            return z_sq;
        return z_sq.multiply(base).mod(m); // z**2 * base % m
    }



}
