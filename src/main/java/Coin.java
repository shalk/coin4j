import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Coin {
    public static void main(String[] args) throws InterruptedException {
        String[] candidates = new String[]{"🌝", "🌖", "🌗", "🌘", "🌚", "🌒", "🌓", "🌔"};
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            for (String s : candidates) {
                System.out.print(s);
                TimeUnit.MILLISECONDS.sleep(42);
                System.out.print("\b\b");
            }
        }
        System.out.println(r.nextBoolean() ? "🌝" : "🌚");
    }
}
