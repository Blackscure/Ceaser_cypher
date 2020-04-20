package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarCipherDecoderTest {
    @Test
    public void newCaesarCipherObject_instantiatesCorrectly() throws Exception {
        CaesarCipherDecoder testCaesarCipherDecoder = new CaesarCipherDecoder("A", 1);
        assertEquals(true, testCaesarCipherDecoder instanceof CaesarCipherDecoder);
    }
}