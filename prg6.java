import java.util.*;

public class prg6 {
    public static void main(String[] args) {
        int[] preferred = {3, 5, 12, 5, 11};
        Set<Integer> booked = new HashSet<>();
        for (int seat : preferred) {
            if (booked.contains(seat)) {
                System.out.println("Seat " + seat + " Already Booked");
            } else {
                booked.add(seat);
                System.out.println("Seat " + seat + " Booked");
            }
        }
    }
}
