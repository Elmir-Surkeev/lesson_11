public class Fish extends Product{
    public Fish(String name,  int bestBeforeDate, boolean inIcebox){
        super(name, bestBeforeDate, inIcebox);
    }

    @Override
    void isFresh() {
        super.isFresh();
    }
}
