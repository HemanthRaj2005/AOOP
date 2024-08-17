package postlabweek3;

public class CarFactory implements VehicleFactory
{
public Vehicle createVehicle() {
return new Car();
}
}
