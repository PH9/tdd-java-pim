public class Captcha {
    public static final String[] string = {
            "ONE", "TWO", "THEE", "FOUR", "FIVE", "SIX",
            "SEVEN", "EIGHT", "NINE", "TEN"
    };

    private int pattern, left, operator, right;

    public Captcha(int pattern, int left, int operator, int right) {
        this.pattern = pattern;
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String toString() {
        String result = "";

        if (this.pattern == 1) {
            result += string[this.left - 1];
        } else {
            result += this.left;
        }

        switch (this.operator) {
            case 1:
                result += "+";
                break;
            case 2:
                result += "-";
                break;
            case 3:
                result += "*";
                break;
        }

        if (this.pattern == 2) {
            result += string[this.right - 1];
        } else {
            result += this.right;
        }

        return result;
    }
}
