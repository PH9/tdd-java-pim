import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaptchaTest {

    @Test
    public void captcha_OnePlus1() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        String actual = captcha.getResult();
        assertEquals("ONE+1", actual);
    }
}
