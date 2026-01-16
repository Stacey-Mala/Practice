package practice5.theMuseum;

public class Main {
    public static void main(String[] args){
        MuseumManager nationalMuseum = new MuseumManager();

        Exhibit caesarManuscript = new Manuscript();
        Exhibit ancientSculpture = new Sculpture();

        nationalMuseum.setExhibit(caesarManuscript);
        nationalMuseum.setExhibit(ancientSculpture);

        nationalMuseum.showExhibit();
    }
}
