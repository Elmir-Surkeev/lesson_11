public class Stew extends Product{

    public Stew(String name, int bestBeforeDate){
        super(name, bestBeforeDate);
    }

    @Override
    void isFresh() {
        System.out.println("Ваш продукт " + getName());
        super.isFresh();
    }
}
