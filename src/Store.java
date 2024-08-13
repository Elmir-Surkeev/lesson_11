import java.util.Random;
public class Store {
    public static void main(String[] args) {
        Product[] products = new Product[20];
        Random rnd = new Random();

        for(int i = 0; i< products.length; i++){
            int inFridje = rnd.nextInt(2);

            int productType = rnd.nextInt(1, 5);
            switch (productType){
                case 1:
                    if (inFridje == 0){
                        products[i] = new Milk("Milk", 60, false);
                    }else {
                        products[i] = new Milk("Milk", 60, true);

                    }
                    break;
                case 2:
                    if (inFridje == 0){
                        products[i] = new Milk("Salt", 20, false);
                    }else {
                        products[i] = new Milk("Salt", 20, true);

                    }
                    break;
                case 3:
                    if (inFridje == 0){
                        products[i] = new Milk("Fish", 0, false);
                    }else {
                        products[i] = new Milk("Fish", 0, true);

                    }
                    break;
                case 4:
                    if (inFridje == 0){
                        products[i] = new Milk("Corn", 150, false);
                    }else {
                        products[i] = new Milk("Corn", 150, true);

                    }
                    break;
                case 5:
                    if (inFridje == 0){
                        products[i] = new Milk("Stew", 180, false);
                    }else {
                        products[i] = new Milk("Stew", 180, true);

                    }
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
