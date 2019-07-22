import org.junit.Test;
import static org.junit.Assert.*;

public class DecryptionTest {
    @Test
    public void runCeaserCipher_isEntryString_String() {
        Decrypt testEncrypt = new Decrypt();
        String expectedOutput = "cde";
        assertEquals(expectedOutput, testEncrypt.decryption("abc", 2));
    }
    @Test
    public void runCeaserCipher_isEntryString2_String() {
        Decrypt testEncrypt = new Decrypt();
        String expectedOutput = "www";
        assertEquals(expectedOutput, testEncrypt.decryption("yyy", 2));
    }
    @Test
    public void runCeaserCipher_isEntryString3_String() {
        Decrypt testEncrypt = new Decrypt();
        String expectedOutput = "bbb";
        assertEquals(expectedOutput, testEncrypt.decryption("ddd", 2));
    }
    @Test
    public void runCeaserCipher_isEntryString4_String() {
        Decrypt testEncrypt = new Decrypt();
        String expectedOutput = "ddd";
        assertEquals(expectedOutput, testEncrypt.decryption("ccc", -1));
    }

}