package postlabweek3;

public class BikeFactory implements VehicleFactory
{
public Vehicle createVehicle() {
return new Bike();
}
}