import java.util.Random;
public class Store {
    public static void main(String[] args) {
        Product[] products = new Product[20];
        Random rnd = new Random();


        for(int i = 0; i< products.length; i++){

            int productType = rnd.nextInt(4);
            switch (productType){
                case 0:
                    products[i] = new Milk("Milk", 60);
                    break;
                case 1:
                    products[i] = new Salt("Salt", 0);
                    break;
                case 2:
                    products[i] = new Fish("Fish", 20);
                    break;
                case 3:
                    products[i] = new Corn("Corn", 150);
                    break;
                case 4:
                    products[i] = new Stew("Stew", 180);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }

    polym(products);
    }


    public static void polym(Product[] products) {
        for (Product product : products) {
            product.isFresh();
        }
    }
}
