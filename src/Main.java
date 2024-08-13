//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        doInception(new Milk("Milk", 60, true));
        doInception(new Salt("Salt", 0, true));
        doInception(new Fish("Fish", 20, false));
        doInception(new Corn("Corn", 150, false));
        doInception(new Stew("Stew", 180, true));
    }
    public static void doInception(Product product){
        product.isFresh();
    }
}