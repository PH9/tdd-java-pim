public class Captcha {
    private int left;

    public Captcha(int i, int left, int i2, int i3) {
        this.left = left;
    }

    public String left() {
        return this.left == 1 ? "ONE" : "TWO";
    }
}
