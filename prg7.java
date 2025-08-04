public class prg7 {
    public static void main(String[] args) {
        String input = "Java1234";
        String result = "";
        for (char c : input.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) result += "@";
            else if (Character.isDigit(c) && (c - '0') % 2 == 0) result += "*";
            else result += c;
        }
        System.out.println(result.toUpperCase());
    }
}
