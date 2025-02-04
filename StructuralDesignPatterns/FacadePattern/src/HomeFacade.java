public class HomeFacade {
    private PlumberSystem plumberSystem;
    private WaterSystem waterSystem;
    private ElectricSystem electricSystem;
    private GasSystem gasSystem;

    public HomeFacade() {
        this.plumberSystem = new PlumberSystem();
        this.waterSystem = new WaterSystem();
        this.electricSystem = new ElectricSystem();
        this.gasSystem = new GasSystem();
    }


    void geyserOn() {
        // Interaction with plumberSystem, waterSystem and electricSystem
        System.out.println("Geyser is ON");
    }

    void geyserOff() {
        // Interaction with plumberSystem, waterSystem and electricSystem
        System.out.println("Geyser is OFF");
    }

}
