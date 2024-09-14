package postlabweek3;

public class ScooterFactory implements VehicleFactory
{
public Vehicle createVehicle() {
return new Scooter();
}
}