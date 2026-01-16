package practice5.theMuseum;

import java.util.ArrayList;
import java.util.List;

public class MuseumManager {
    private List<Exhibit> exhibits = new ArrayList<>();

    public void setExhibit(Exhibit e) {
        exhibits.add(e);
        e.maintain();
    }

    public void showExhibit() {
        System.out.println("\n--- Museum of Art and History ---");
        for (Exhibit exhibit : exhibits) {
            exhibit.info();
        }
    }
}
