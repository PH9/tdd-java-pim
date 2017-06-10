import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {

    @Test
    public void captcha_leftShouldReturn_ONE() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        assertEquals("ONE", captcha.left());
    }

    @Test
    public void captcha_leftShouldReturn_TWO() {
        Captcha captcha = new Captcha(1, 2, 1, 1);
        assertEquals("TWO", captcha.left());
    }

    @Test
    public void captcha_rightShouldReturn_1() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        assertEquals("1", captcha.right());
    }
}
