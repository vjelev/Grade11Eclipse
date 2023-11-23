package Stars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        List<Star> stars= new ArrayList<Star>();
        String[] starInfo = inp.nextLine().split(", ");
        while(stars.size()<2000 && !starInfo[0].equals("end"))
        {
            String starName = starInfo[0];
            double starDistance = Double.parseDouble(starInfo[1]);
            int starClassification = Integer.parseInt(starInfo[2]);
            double starMass = Double.parseDouble(starInfo[3]);
            String constName = starInfo[4];
            int constStars = Integer.parseInt(starInfo[5]);
            double constArea = Double.parseDouble(starInfo[6]);
            Constellation constellation = new Constellation(constName,constStars,constArea);
            Star star = new Star(starName,starDistance,starClassification,starMass,constellation);
            stars.add(star);

            starInfo = inp.nextLine().split(", ");
        }

        Collections.sort(stars);

        for (Star star : stars) {
            System.out.println(star);
        }

        Map<String, Double> constellationMassMap = new HashMap<>();
        Map<String, Integer> constellationCountMap = new HashMap<>();

        for (Star star : stars) {
            String constellationName = star.getConstellation().getName();

            constellationMassMap.put(constellationName, constellationMassMap.getOrDefault(constellationName, 0.0) + star.getMass());
            constellationCountMap.put(constellationName, constellationCountMap.getOrDefault(constellationName, 0) + 1);
        }

        for (String constellationName : constellationMassMap.keySet()) {
            double totalMass = constellationMassMap.get(constellationName);
            int starCount = constellationCountMap.get(constellationName);
            double averageMass = totalMass / starCount;

            System.out.printf("%s, %.2f%n", constellationName, averageMass);
        }
    }
}

/*
�������� ��������, 10.5, 1, 5.0, ��������, 25, 120.5
���� ��������, 8.3, 2, 3.2, ��������, 118, 90.2
������� ������, 15.7, 3, 7.8, Malka mechka, 30, 150.0
���������, 6.9, 1, 4.5, Golqmata mechka, 25, 120.5
������ �, 12.1, 2, 6.0, Golqmata mechka, 25, 90.2
Star6, 18.2, 3, 8.2, Constellation3, 30, 150.0
Star7, 9.8, 1, 4.8, Constellation1, 25, 120.5
Star8, 14.3, 2, 7.0, Golqmata mechka, 51, 90.2
Star9, 7.6, 3, 3.5, Malka mechka, 30, 150.0
Star10, 11.4, 1, 5.5, Constellation1, 25, 120.5
end

 */