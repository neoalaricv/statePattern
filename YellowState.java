public class YellowState implements TrafficLightState {
    public void switchState(TrafficLightController controller){
        controller.setState(new RedState());
    }
    public String getColor(){
        return "Yellow";
    }
}
