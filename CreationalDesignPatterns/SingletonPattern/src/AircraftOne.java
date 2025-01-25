public class AircraftOne {
    private static AircraftOne aircraftInstance;

    private AircraftOne() {
        System.out.println("Inside ctor of AircraftOne, marked ctor as private");
    }

    public static AircraftOne getInstance(){
        if (aircraftInstance == null){
            aircraftInstance = new AircraftOne();
        }
        return aircraftInstance;
    }
}
