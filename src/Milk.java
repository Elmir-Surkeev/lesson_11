import java.time.LocalDate;
import java.util.Random;
public class Milk extends Product {
    public Milk(String name, int bestBeforeDate, boolean iceBox) {
        super(name, bestBeforeDate, iceBox);
    }

    @Override
    void isFresh() {
        Random rnd = new Random();
        int random = rnd.nextInt(1, 200);



        if (getInIcebox() == false){
            LocalDate produceOn = LocalDate.now().minusDays(random);
            LocalDate expiryDate = produceOn.plusDays(getBestBeforeDate()/2);

            String location = getInIcebox() ? "Ice box" : "Show case";
            if (LocalDate.now().isBefore(expiryDate) || getBestBeforeDate() == 0) {;
                if (getInIcebox() == true){
                    System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, getBestBeforeDate(), "True");
                }else{
                    System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, getBestBeforeDate(), "True");
                }
            }
            else if (LocalDate.now().isAfter(expiryDate)) {
                if (getInIcebox() == true){
                    System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, getBestBeforeDate(), "False");
                }else{
                    System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, getBestBeforeDate(), "False");
                }
            }

        }else {
            LocalDate produceOn = LocalDate.now().minusDays(random);
            LocalDate expiryDate = produceOn.plusDays(getBestBeforeDate());

            String location = getInIcebox() ? "Ice box" : "Show case";
            if (LocalDate.now().isBefore(expiryDate) || getBestBeforeDate() == 0) {;
                if (getInIcebox() == true){
                    System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, getBestBeforeDate(), "True");
                }else{
                    System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, getBestBeforeDate(), "True");
                }
            }
            else if (LocalDate.now().isAfter(expiryDate)) {
                if (getInIcebox() == true){
                    System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, getBestBeforeDate(), "False");
                }else{
                    System.out.printf("%-7s | %-16s | %-16s | %-17d | %-5s%n", getName(), produceOn, location, getBestBeforeDate(), "False");
                }
            }
        }


    }
}
