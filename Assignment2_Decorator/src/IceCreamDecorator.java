public abstract class IceCreamDecorator implements IceCream{

    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream){
        this.iceCream= iceCream;
    }
    @Override
    public String getFlavors(){
        return iceCream.getFlavors();
    }

    @Override
    public int getPrice(){
        return iceCream.getPrice();
    }

}