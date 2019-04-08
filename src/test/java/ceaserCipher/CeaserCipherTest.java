package ceaserCipher;
import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCipherTest{
@Test
    public void encrypt_getsUserTextInput_String(){
    CeaserCipher testCaesar = new CeaserCipher();
    testCaesar.encrypt("sample",2);
    assertEquals("sample", testCaesar.getText());
}
@Test
    public void encrypt_getShiftKeyInput_Int(){
    CeaserCipher testCaesar = new CeaserCipher();
    testCaesar.encrypt("sample",2);
    assertEquals(2,testCaesar.getShift());
}
@Test
    public void encrypt_encryptWithAShiftOf2_String(){
    CeaserCipher testCaesar = new CeaserCipher();
    testCaesar.encrypt("sample",2);
    assertEquals("ucorng",testCaesar.encrypt("sample",2));
}
}