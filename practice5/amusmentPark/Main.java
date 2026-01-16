package practice5.amusmentPark;

public class Main {
    public static void main(String[] args) {
        AttractionManager disneyPark = new AttractionManager();

        Attraction rollercoaster = new Rollercoaster();
        Attraction carousel = new Carousel();

        disneyPark.setAttraction(rollercoaster);
        disneyPark.setAttraction(carousel);

        disneyPark.getInfo();
    }
}
