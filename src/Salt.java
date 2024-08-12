public class Salt extends Product{
    public Salt(String name,  int bestBeforeDate){
        super(name,  bestBeforeDate);
    }

    @Override
    void isFresh() {
        System.out.println("Ваш продукт " + getName());
        super.isFresh();
    }
}
