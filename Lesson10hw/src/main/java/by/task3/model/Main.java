package by.task3.model;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cosmodrome cos = new Cosmodrome();
        Union spaceUnion = new Union("Союз");
        SpaceX spaceShipX = new SpaceX("SpaceX");
        cos.Start(spaceUnion);
        cos.Start(spaceShipX);
    }
}
