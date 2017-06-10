import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {

    @Test
    public void captcha_leftShouldReturn_ONE() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        assertEquals("ONE", captcha.left());
    }
}
