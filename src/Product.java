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

    public int getBestBeforeDate() {
        return bestBeforeDate;
    }

    void isFresh(){
        Random rnd = new Random();
        int random = rnd.nextInt(1, 200);
        String location = getInIcebox() ? "Ice box" : "Show case";

        LocalDate produceOn = LocalDate.now().minusDays(random);
        LocalDate expiryDate = produceOn.plusDays(bestBeforeDate);
        if (LocalDate.now().isBefore(expiryDate) || bestBeforeDate == 0) {;
            if (getInIcebox() == true){
                System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, bestBeforeDate, "True");
            }else{
                System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, bestBeforeDate, "True");
            }
        }
        else if (LocalDate.now().isAfter(expiryDate)) {
            if (getInIcebox() == true){
                System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, bestBeforeDate, "False");
            }else{
                System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, bestBeforeDate, "False");
            }
        }
    }
}
