import org.junit.Assert;
import org.junit.Test;

public class CoinTest {
    @Test
    public void test() {
        try {
            Coin.main(null);
        } catch (InterruptedException e) {
            Assert.fail();
        }
    }
}
