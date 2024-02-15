public class RedState implements TrafficLightState {
    public void switchState(TrafficLightController controller){
        controller.setState(new GreenState());
    }
    public String getColor(){
        return "Red";
    }
}
