//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        polym(new Milk("Milk", 60));
        polym(new Salt("Salt", 0));
        polym(new Fish("Fish", 20));
        polym(new Corn("Corn", 150));
        polym(new Stew("Stew", 180));
    }
    public static void polym(Product product){
        product.isFresh();
    }
}