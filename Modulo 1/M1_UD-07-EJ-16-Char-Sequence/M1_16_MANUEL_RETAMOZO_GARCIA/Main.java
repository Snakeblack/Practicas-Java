package M1_T07_P27;

public class Main {
    public static void main(String[] args) {
        CharSequenceTokio cst = new ArrayCharSequenceTokio(new char[] { 'H', 'e', 'l', 'l', 'o' });
        CharSequenceTokio cst2 = new BackwardsStringSequenceTokio("Hello");
        System.out.println(cst);
        System.out.println(cst.subSequence(0, 3));
        System.out.println(cst.subSequence(0, 3).subSequence(1, 2));

        System.out.println(cst2);
        System.out.println(cst2.subSequence(1, 4));

        System.out.println(cst2.subSequence(1, 4).subSequence(0, 2));

    }
}
