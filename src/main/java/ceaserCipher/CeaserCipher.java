package ceaserCipher;

public class CeaserCipher {
    private String mText;
    private int mShift;

    public String encrypt(String textInput, int shiftKey) {
        mText = textInput;
        mShift = shiftKey;
        String result = "";
        for (int i = 0; i < mText.length(); i++) {
            char myChar = mText.charAt(i);
            if (Character.isUpperCase(mText.charAt(i))) {
                char shifted = (char) (myChar + mShift);
                if (shifted > 'Z') {
                    result += (char) (myChar - (26 - mShift));
                } else {
                    result += shifted;
                }
            } else {
                char shifted = (char) (myChar + mShift);
                if (shifted > 'z') {
                    result += (char) (myChar - (26 - mShift));
                } else
                {
                    result += shifted;
                }
            }

        }
        return result;
    }
    public String getText(){
        return mText;
    }
    public int getShift(){
        return mShift;
    }

    public String decrypt(String textInput, int shiftKey) {
        textInput = encrypt(textInput,shiftKey);
        mShift = shiftKey;
        String result = "";
        for (int i = 0; i < textInput.length(); i++) {
            char myChar = textInput.charAt(i);
            if (Character.isUpperCase(textInput.charAt(i))) {
                char shifted = (char) (myChar - mShift);
                    result += shifted;
            }
            else {
                char shifted = (char) (myChar - mShift);
                    result += shifted;
            }
        }
        return result;
    }
}