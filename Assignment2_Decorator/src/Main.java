// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IceCream iceCream = new SimpleIceCream();
        System.out.println(iceCream.getFlavors() +" "+ iceCream.getPrice());

        iceCream = new BananaDecorator(iceCream);
        System.out.println(iceCream.getFlavors() +" "+ iceCream.getPrice());

        iceCream = new ChickenDecorator(iceCream);
        System.out.println(iceCream.getFlavors() +" "+ iceCream.getPrice());

        iceCream = new ChickenDecorator(iceCream);
        System.out.println(iceCream.getFlavors() +" "+  iceCream.getPrice());
    }
}