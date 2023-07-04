package ObjectAndClasses_exam;

import java.util.*;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> phrases = Arrays.asList("Excellent product.","Such a great product.","I always use that product."
        ,"Best product of its category."
        ,"Exceptional product.","I can’t live without this product.");

        List<String> events = Arrays.asList("Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                 "Try it yourself, I am very satisfied.",
                 "I feel great!");

        List<String> authours = Arrays.asList("Diana",
                 "Petya",
                 "Stella",
                 "Elena",
                 "Katya",
                 "Iva",
                 "Annie",
                 "Eva"
        );
        List<String> city = Arrays.asList("Burgas",
                 "Sofia",
                 "Plovdiv",
                 "Varna",
                 "Ruse"
        );
        int n = Integer.parseInt(scan.nextLine());
        Random rnd = new Random();
        for(int i =0;i<n;i++){
            int indexPhrases = rnd.nextInt(phrases.size());
            int indexEvents = rnd.nextInt(events.size());
            int indexAuthors = rnd.nextInt(authours.size());
            int indexCity =rnd.nextInt(city.size());
            System.out.printf("%s %s %s - %s\n",phrases.get(indexPhrases),events.get(indexEvents),
                    authours.get(indexAuthors),city.get(indexCity));
        }



    }
}
