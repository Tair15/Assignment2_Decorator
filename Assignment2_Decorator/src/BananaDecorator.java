public class BananaDecorator extends IceCreamDecorator{
    public BananaDecorator(IceCream iceCream) {
        super(iceCream);
    }
    @Override
    public String getFlavors()
    {
        return super.getFlavors() + ", Banana";
    }
    @Override
    public int getPrice()
    {
        return super.getPrice() + 200;
    }
}
