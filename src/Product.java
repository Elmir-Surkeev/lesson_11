import java.time.LocalDate;
import java.util.Random;
public abstract class Product {
    Random rnd = new Random();
    private String name;

   boolean getInIcebox(){
       return inIcebox;
   }

    private int bestBeforeDate;
    private boolean inIcebox;

    public Product(String name,int bestBeforeDate, boolean inIcebox){
        this.name = name;
        this.bestBeforeDate = bestBeforeDate;
        this.inIcebox = inIcebox;
    }
    String getName(){
        return name;
    }
    void isFresh(){
        Random rnd = new Random();
        int random = rnd.nextInt(1, 200);

        LocalDate produceOn = LocalDate.now().minusDays(random); // Дата производства
        LocalDate expiryDate = produceOn.plusDays(bestBeforeDate); // Дата истечения срока годности

      //  if (placeProduct())
        if (LocalDate.now().isBefore(expiryDate) || bestBeforeDate == 0) {;
            System.out.println("Продукт свежий, произведен: " + produceOn );
            System.out.println("Можно употреблять до: " + expiryDate );
            System.out.println("___________________________________________");
        }
        else if (LocalDate.now().isAfter(expiryDate)) {
            System.out.println("Продукт просрочен, произведен: " + produceOn);
            System.out.println("___________________________________________");
        }
        else{
            System.out.println("asf: " + produceOn);

        }
    }
//    void placeProduct(){
//        int place = rnd.nextInt(1);
//        if (place == 0){
//            inIcebox = true;
//        }else if (place==1){
//            inIcebox = false;
//        }

}
