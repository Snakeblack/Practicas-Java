package M1_T07_P27;

import java.util.Arrays;

public class ArrayCharSequenceTokio implements CharSequenceTokio {

    private char[] chars;

    public ArrayCharSequenceTokio(char[] chars) {
        this.chars = chars;
    }

    public int length() {
        return chars.length;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public CharSequenceTokio subSequence(int start, int end) {
        char[] subChars = new char[end - start];
        for (int i = start; i < end; i++) {
            subChars[i - start] = chars[i];
        }
        return new ArrayCharSequenceTokio(subChars);
    }

    @Override
    public String toString() {
        return "ArrayCharSequenceTokio [chars=" + Arrays.toString(chars) + "]";
    }

}
