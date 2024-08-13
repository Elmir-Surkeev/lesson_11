public class Stew extends Product{

    public Stew(String name, int bestBeforeDate, boolean inIcebox){
        super(name, bestBeforeDate, inIcebox);
    }

    @Override
    void isFresh() {
        System.out.println("Ваш продукт " + getName());
        super.isFresh();
    }
}
