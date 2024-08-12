public class Milk extends Product {
    public Milk(String name, int bestBeforeDate) {
        super(name, bestBeforeDate);
    }

    @Override
    void isFresh() {
        System.out.println("Ваш продукт " + getName());
        super.isFresh();
    }
}
