package models;

import java.util.ArrayList;
import java.util.List;

class CaesarCipherDecoder {
    private CaesarCipherEncoder EncoderDetails = new CaesarCipherEncoder(user, 0);

    private String userText;
    private int decodeKey;
    private List<String> decodedOutput = new ArrayList<String>();


    public CaesarCipherDecoder(String userText, int decodeKey) {
        this.userText = userText;
        this.decodeKey = decodeKey;
    }

    public String decodeUserText() {
        for (int i = 0; i < userText.length(); i++) {
            if (Character.isUpperCase(userText.charAt(i))) {
                int decodedValue = ((int)(userText.charAt(i)) + (26 - decodeKey) - 65) % 26 + 65;
                char decodedChar = (char)(decodedValue);
                String decodedString = Character.toString(decodedChar);
                decodedOutput.add(decodedString);
            } else if (Character.isLowerCase(userText.charAt(i))) {
                int decodedValue = ((int)(userText.charAt(i)) + (26 - decodeKey) - 97) % 26 + 97;
                char decodedChar = (char)(decodedValue);
                String decodedString = Character.toString(decodedChar);
                decodedOutput.add(decodedString);
            } else {
                String encodedString = Character.toString(userText.charAt(i));
                decodedOutput.add(encodedString);
            }
        }
        return String.join("", decodedOutput);
    }
}