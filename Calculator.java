public class Calculator {
    private int result;

    public void action(String action, int... params) {

        switch (action) {
            case ("+"):
                add(params);
                break;

            case ("-"):
                subtraction(params);
                break;

            case ("*"):
                multiplication(params);
                break;

            case ("/"):
                division(params);
                break;

            default:
                System.out.println("Wrong action.");
        }

    }

    public void add(int... params) {
        for (Integer param : params) {
            this.result += param;
        }
    }

    public void subtraction(int... params) {
        for (Integer param : params) {
            this.result = params[0] - params[1];
        }
    }

    public void multiplication(int... params) {
        for (Integer param : params) {
            this.result *= param;
        }
    }

    public void division(int... params) {
        for (Integer param : params) {
            this.result = params[0] / params[1];
        }
    }

    public int getResult() {
        return result;
    }

    public void cleanResult(String cleanResult) {
        if (cleanResult.equals("clean")) {
            result = 0;
        }
    }
}