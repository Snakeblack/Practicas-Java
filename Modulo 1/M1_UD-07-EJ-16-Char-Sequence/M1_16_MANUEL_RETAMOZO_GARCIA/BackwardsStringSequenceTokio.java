package M1_T07_P27;

public class BackwardsStringSequenceTokio implements CharSequenceTokio {

    private String str;

    public BackwardsStringSequenceTokio(String str) {
        this.str = str;
    }

    public int length() {
        return str.length();
    }

    public char charAt(int index) {
        return str.charAt(str.length() - 1 - index);
    }
    // Metodo subSequence que empieza del final y acaba en el principio
    public CharSequenceTokio subSequence(int start, int end) {
        String subStr = "";
        for (int i = start; i < end; i++) {
            subStr += str.charAt(str.length() - 1 - i);
        }
        return new BackwardsStringSequenceTokio(subStr);
    }

    @Override
    public String toString() {
        return "BackwardsStringSequenceTokio [str=" + str + "]";
    }

}
