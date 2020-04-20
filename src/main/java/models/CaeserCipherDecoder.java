package models;

import java.util.ArrayList;

public class CaeserCipherDecoder {
    private CaesarCipherEncoder EncoderDetails = new CaesarCipherEncoder("", 0);

    private String userText;
    private int decodeKey;
    private List<String> decodedOutput = new ArrayList<String>();
}
