package practice5.amusmentPark;

import java.util.ArrayList;
import java.util.List;

public class AttractionManager {
    private List<Attraction> attractions = new ArrayList<>();

    public void setAttraction(Attraction a) {
        attractions.add(a);
        a.maintain();
    }

    public void getInfo() {
        System.out.println("\n--- Disney Land ---");
        for (Attraction attraction : attractions) {
            attraction.info();
        }
    }
}
