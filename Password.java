public class Password {

    static String symbols = "0123456789_+=*/?!@#&abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static int numOfSymbols = symbols.length();

    public static String generate(int length) {
        String password = "";

        for (int i = 0; i < length; i++) {
            password = password + randomSymbol();

        }
        return password;
    }

    public static String randomSymbol() {
        int r = (int) (numOfSymbols * Math.random());
        return symbols.substring(r, r + 1);
    }
}
