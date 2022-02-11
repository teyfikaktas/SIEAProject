package com.example.crpito;

import org.bouncycastle.jcajce.provider.digest.SHA3;
import org.bouncycastle.util.encoders.Hex;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class encrypt {

    private static final String OUTPUT_FORMAT = "%-20s:%s";
    private final Charset UTF_8 = StandardCharsets.UTF_8;

    public static String convertStringToBinary(String input) {

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))
                            .replaceAll(" ", "0")
            );
        }
        return result.toString();

    }

    public static String Sha3Algorithm(String input) {
        SHA3.DigestSHA3 digestSHA3 = new SHA3.Digest256();
        byte[] digest = digestSHA3.digest(input.getBytes());
        String binary = Hex.toHexString(digest);
        return binary;

    }
    public static String Converty( String input){

        return  convertStringToBinary(input);
    }


}


