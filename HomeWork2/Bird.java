
public abstract class Bird extends Animal {
    protected Double flightAltitude;

    protected Bird(Double growth, Double weight, String eyeColor, Double flightAltitude) {
        super(growth, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }

    public abstract void voice();
    public abstract void fly();

    @Override
    public String toString() {
        return super.toString() + ", высота полета:" + flightAltitude;
    }


}
