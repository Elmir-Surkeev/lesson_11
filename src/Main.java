//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        polym(new Milk("Milk", 60, true));
        polym(new Salt("Salt", 0, true));
        polym(new Fish("Fish", 20, false));
        polym(new Corn("Corn", 150, false));
        polym(new Stew("Stew", 180, true));
    }
    public static void polym(Product product){
        product.isFresh();
    }
}