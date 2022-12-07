package by.task3.model;

public class Main {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        Union spaceUnion = new Union("Союз");
        SpaceX spaceShipX = new SpaceX("SpaceX");
        cosmodrome.start(spaceUnion);
        cosmodrome.start(spaceShipX);
    }
}
