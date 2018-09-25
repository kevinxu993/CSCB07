package b07.labs;

public class Motorcycle extends Vehicle {
  private double engineSize;

  public double getEngineSize() {
    return engineSize;
  }

  public void setEngineSize(double size) {
    engineSize = size;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "The motorcycle has a big engine, it’s " + engineSize + " L cubed";
  }


}
