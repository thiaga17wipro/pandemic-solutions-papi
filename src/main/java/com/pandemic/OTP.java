package com.pandemic;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class OTP {

public static String generate(String str) throws NoSuchAlgorithmException{
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    md.update(str.getBytes());
    byte[] digest = md.digest();
    String result = new BigInteger(1, digest).toString(16).toLowerCase();
    System.out.println(result);
    return result;
}


//  public static void main (String args[]) throws NoSuchAlgorithmException { OTP
// otp = new OTP(); otp.generate("365813"); }
 
}