public class TrafficLightController {
    private TrafficLightState state;

    //default state
    public TrafficLightController(){
        state = new RedState();
    }
    public TrafficLightState getState() {
        return state;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }
    
}
