public class Corn extends Product{
    public Corn(String name,int bestBeforeDate, boolean inIcebox){
        super(name, bestBeforeDate, inIcebox);
    }

    @Override
    void isFresh() {
        System.out.println("Ваш продукт " + getName());
        super.isFresh();
    }
}
