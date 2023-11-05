package JOOP_01_2_Working_with_Abstraction_Ex.P04_TrafficLights;

public class TrafficLights {
    private Lights light;

    public TrafficLights(String light) {
        this.light = Lights.valueOf(light);
    }

    public String switchLight() {
        if (this.light == Lights.RED) {
            this.light = Lights.GREEN;
        } else if (this.light == Lights.GREEN) {
            this.light = Lights.YELLOW;
        } else {
            this.light = Lights.RED;
        }
        return this.light.name();
    }
}
