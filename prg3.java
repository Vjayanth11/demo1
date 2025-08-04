import java.util.*;

public class prg3 {

    public static void main(String[] args) {
        int[] skills = {10, 20, 30, 40};
        splitTeams(skills);
    }

    public static void splitTeams(int[] skills) {
        Arrays.sort(skills);
        List<Integer> teamA = new ArrayList<>();
        List<Integer> teamB = new ArrayList<>();
        int sumA = 0, sumB = 0;

        for (int i = skills.length - 1; i >= 0; i--) {
            if (teamA.size() < skills.length / 2 && (sumA <= sumB || teamB.size() == skills.length / 2)) {
                teamA.add(skills[i]);
                sumA += skills[i];
            } else {
                teamB.add(skills[i]);
                sumB += skills[i];
            }
        }

        System.out.println("Team A: " + teamA + " | Sum: " + sumA);
        System.out.println("Team B: " + teamB + " | Sum: " + sumB);
    }
}
