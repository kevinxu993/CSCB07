package b07.labs;

public class Vehicle {
  private double speed;
  private int wheels;

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public void setNumberOfWheels(int wheels) {
    this.wheels = wheels;
  }

  public int getNumberofWheels() {
    return wheels;
  }

  public String toString() {
    return "Vehicle with " + wheels + " wheels, travelling at speed " + speed
        + " km/h";
  }

}
