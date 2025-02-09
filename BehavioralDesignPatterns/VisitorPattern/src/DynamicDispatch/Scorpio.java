package DynamicDispatch;

public class Scorpio {
    public String getVehicleName(){
        return "DynamicDispatch.Scorpio";
    }

    public void applyBrakes(StandardBrakes standardBrakes){
        System.out.println(this.getVehicleName() + " applying normal brakes " + standardBrakes.playSound());
    }

    public void applyBrakes(AdvancedBrakes advancedBrakes){
        System.out.println(this.getVehicleName() + " applying advanced brakes " + advancedBrakes.playSound());
    }
}
