public class Password {

    public static String generate(int length) {
        String password = "";

        for (int i = 0; i < length; i++) {
            password = password + randomSymbol("0123456789_+=*/?!@#&abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");

        }
        return password;
    }

    public static String randomSymbol(String symbols) {
        int numOfSymbols = symbols.length();
        int r = (int) (numOfSymbols * Math.random());
        return symbols.substring(r, r + 1);
    }
}
