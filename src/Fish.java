public class Fish extends Product{
    public Fish(String name,  int bestBeforeDate){
        super(name, bestBeforeDate);
    }

    @Override
    void isFresh() {
        System.out.println("Ваш продукт " + getName());
        super.isFresh();
    }
}
