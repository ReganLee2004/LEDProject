public class LED_Lamp {
    private LED red, green, blue;
    public LED_Lamp(){
        red = new LED("Red");
        green = new LED("Green");
        blue = new LED("Blue");
    }

    public boolean showLight(int lightIdx){
        red.turnOff();
        green.turnOff();
        blue.turnOff();

        switch (lightIdx){
            case 0:
                red.turnOn();
                System.out.println("Light is now "+red.getColor());
                return true;
            case 1:
                green.turnOn();
                System.out.println("Light is now "+green.getColor());
                return true;
            case 2:
                blue.turnOn();
                System.out.println("Light is now "+blue.getColor());
                return true;
            default:
                System.out.println("Error!! Expects 0, 1 or 2");
                return false;
        }
    }
}
