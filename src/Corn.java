public class Corn extends Product{
    public Corn(String name,int bestBeforeDate){
        super(name, bestBeforeDate);
    }

    @Override
    void isFresh() {
        System.out.println("Ваш продукт " + getName());
        super.isFresh();
    }
}
