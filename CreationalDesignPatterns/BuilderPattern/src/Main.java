import Models.ICar;

public class Main {
    public static void main(String[] args) {
        ICarBuilder carBuilder = new FortunerBuilder();

        Director director = new Director(carBuilder);
        director.construct(true,true,false,true);
        ICar car = carBuilder.build();
    }
}