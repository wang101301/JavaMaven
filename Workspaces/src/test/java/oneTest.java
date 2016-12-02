import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangyy on 2016/11/22.
 */
public class oneTest {
    @Test
    public void TestOne() {
        one o = new one();
        String refusal= o.Say("wangyy");
        Assert.assertEquals("wangyy say hello",refusal);
    }
}
