public class GreenState implements TrafficLightState {
    public void switchState(TrafficLightController controller){
        controller.setState(new YellowState());
    }
    public String getColor(){
        return "Green";
    }
}
