public class SimpleIceCream implements IceCream{
    @Override
    public String getFlavors() {
        return "Chocolate";
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
