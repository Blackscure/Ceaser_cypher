package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarCipherEncoderTest {
    @Test
    public void newCaesarCipherObject_instantiatesApproprietly() throws Exception {
        CaesarCipherDecoder testCaesarCipherDecoder = new CaesarCipherDecoder("A", 1);
        assertEquals(true, testCaesarCipherDecoder instanceof CaesarCipherDecoder);
    }
}
