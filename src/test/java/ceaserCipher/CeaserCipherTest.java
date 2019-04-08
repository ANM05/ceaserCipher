package ceaserCipher;
import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCipherTest{
@Test
    public void encrypt_getsUserTextInput_String(){
    CeaserCipher testCaesar = new CeaserCipher();
    assertEquals("sample", testCaesar.gettextInput());
}
}