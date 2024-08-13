public class Salt extends Product{
    public Salt(String name,  int bestBeforeDate, boolean inIceBox){
        super(name,  bestBeforeDate, inIceBox);
    }

    @Override
    void isFresh() {
        System.out.println("Ваш продукт " + getName());
        super.isFresh();
    }
}
