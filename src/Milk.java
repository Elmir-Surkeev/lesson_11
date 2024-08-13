public class Milk extends Product {
    public Milk(String name, int bestBeforeDate, boolean iceBox) {
        super(name, bestBeforeDate, iceBox);
    }

    @Override
    void isFresh() {
        System.out.println("Ваш продукт " + getName() + getInIcebox());
        super.isFresh();
    }
}
