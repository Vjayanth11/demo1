public class prg5 {
    public static void main(String[] args) {
        int number = 363;
        String str = Integer.toString(number);
        String rev = new StringBuilder(str).reverse().toString();
        int sum = 0;
        for (char c : str.toCharArray()) sum += c - '0';
        if (str.equals(rev) && sum % 3 == 0) {
            System.out.println("Jackpot!");
        } else {
            System.out.println("Try Again.");
        }
    }
}

