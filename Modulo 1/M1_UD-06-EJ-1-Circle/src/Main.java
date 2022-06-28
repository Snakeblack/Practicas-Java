public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(4);
        System.out.println("Area c1: " + c1.area());
        System.out.println("Area c2: " + c2.area());
        System.out.println("Altura c3: " + c3.getHeight());
    }
}
