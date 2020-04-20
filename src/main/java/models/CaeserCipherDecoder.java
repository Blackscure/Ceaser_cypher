package models;

import java.util.ArrayList;
import java.util.List;

public class CaesarCipherDecoder {
    private CaesarCipherEncoder EncoderDetails = new CaesarCipherEncoder("", 0);

    private String userText;
    private int decodeKey;
    private List<String> decodedOutput = new ArrayList<String>();


    public CaesarCipherDecoder(String userText, int decodeKey) {
        this.userText = userText;
        this.decodeKey = decodeKey;
    }
}