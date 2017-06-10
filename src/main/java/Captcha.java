public class Captcha {
    private int left;

    public Captcha(int i, int left, int i2, int i3) {
        this.left = left;
    }

    public String left() {
        if (this.left == 1) {
            return "ONE";
        }

        return "TWO";
    }
}
