public class ChickenDecorator extends IceCreamDecorator{
    public ChickenDecorator(IceCream iceCream) {
        super(iceCream);
    }
    @Override
    public String getFlavors()
    {
        return super.getFlavors() + ", Chicken";
    }
    @Override
    public int getPrice()
    {
        return super.getPrice() + 300;
    }
}
