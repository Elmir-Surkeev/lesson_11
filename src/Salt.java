public class Salt extends Product{
    public Salt(String name,  int bestBeforeDate, boolean inIceBox){
        super(name,  bestBeforeDate, inIceBox);
    }

    @Override
    void isFresh() {
        super.isFresh();
    }
}
