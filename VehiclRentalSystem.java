class vehicle{
    private String brand;
    private String model;
    private int year;
    private double rentalPrice;

    public vehicle(String brand, String model, int year, double rentalPrice){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.rentalPrice=rentalPrice;
    }
    public String getbrand(){
        return brand;
    }
    public String getmodel(){
        return model;
    }
    public int getyear(){
        return year;
    }
    public double getrentalPrice(){
        return rentalPrice;
    }

    public void displayVehicleInfo(){
        System.out.println("Brand :" + brand );
        System.out.println("Model :" + model );
        System.out.println("Year :" + year );
        System.out.println("rental price :" + rentalPrice);

    }

}
class Car extends vehicle{
    private int NoOfSets;

    public Car(String brand, String model, int year, double rentalPrice, int NoOfSets){
        super(brand, model, year, rentalPrice);
        this.NoOfSets=NoOfSets;
    }
    public int getNoOfSets(){
        return NoOfSets;
    }
}
class MotorCycle extends vehicle{
    private int engineCapacity;

    public MotorCycle(String brand, String model, int year, double rentalPrice, int engineCapacity){
        super(brand, model, year, rentalPrice);
        this.engineCapacity=engineCapacity;
    }
    public int getengineCapacity(){
        return engineCapacity;
    }     
}

public class VehiclRentalSystem{
    public static void main(String[] args){
        Car car = new Car("tempo", "qwerty", 1019, 1200,04);
        MotorCycle motorCycle = new MotorCycle("java", "Rw123", 2022, 2000,05);

        car.displayVehicleInfo();
        System.out.println("NoOfSets : " + car.getNoOfSets());
        motorCycle.displayVehicleInfo();
        System.out.println("Engine capacity :" + motorCycle.getengineCapacity());
        
    }
}