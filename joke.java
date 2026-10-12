public class joke {
    import java.util.Random;

public class joke {
    public static void main(String[] args) {
        String[] jokes = {
            "Why did the scarecrow win an award? Because he was outstanding in his field!",
            "Why don't scientists trust atoms? Because they make up everything!",
            "What do you call a bear with no teeth? A gummy bear!",
            "Why did the bicycle fall over? It was two-tired!"
        };

        Random random = new Random();
        System.out.println(jokes[random.nextInt(jokes.length)]);
    }
}
}
