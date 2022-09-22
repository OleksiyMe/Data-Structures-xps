package homeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SunsetViewsSolved {
    public static void main(String[] args) {

        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
        System.out.println(Arrays.toString(buildings));
        System.out.println(sunsetViews(buildings, "EAST"));
        sunsetViews(buildings, "EAST").forEach(p-> System.out.print(buildings[p]+ ", "));
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int previous = 0;
        if (direction.equals("EAST")) {
            result.add(buildings.length - 1);
            for (int i = buildings.length - 2; i >= 0; i--) {
                if (buildings[i] > previous) {
                    result.add(i);
                    previous = buildings[i];
                }
            }
            Collections.reverse(result);
        } else {
            result.add(0);
            for (int i = 1; i < buildings.length; i++) {
                if (buildings[i] > previous) {
                    result.add(i);
                    previous = buildings[i];
                }
            }
        }

        return result;
    }
}