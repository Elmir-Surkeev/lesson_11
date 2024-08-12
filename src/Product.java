import java.time.LocalDate;

public abstract class Product {
    private String name;
    private int bestBeforeDate;
    public Product(String name,int bestBeforeDate){
        this.name = name;
        this.bestBeforeDate = bestBeforeDate;
    }
    void isFresh(){
        int day = 0;
        boolean fresh;
        LocalDate produceOn = LocalDate.now().minusDays(bestBeforeDate); // Дата производства
        LocalDate expiryDate = produceOn.plusDays(bestBeforeDate); // Дата истечения срока годности

        if (LocalDate.now().isBefore(expiryDate)) {
            System.out.println("Продукт свежий, произведен: " + produceOn);
        } else {
            System.out.println("Продукт просрочен, произведен: " + produceOn);
        }
    }
}
