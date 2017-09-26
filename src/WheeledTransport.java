import java.awt.*;

public class WheeledTransport {

    private String type;
    private String color;
    private Wheel[] wheels;

    public WheeledTransport(String type, String color) {

        switch (type)
        {
            case "car":
                wheels = new Wheel[4];
                addWheels(50);
                break;
            case "scooter":
                wheels = new Wheel[2];
                addWheels(30);
                break;
            case "truck":
                wheels = new Wheel[12];
                addWheels(90);
                break;
        }
        this.type = type;
        this.color = color;

        System.out.println("We made a " + this.color + " " + this.type + ".");
    }

    private void addWheels(int size)
    {
        for(int i =0; i< wheels.length;i++)
        {
            wheels[i] = new Wheel(size);
        }
    }
}
