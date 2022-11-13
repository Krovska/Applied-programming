package object;

import java.util.ArrayList;
import java.util.List;

/**
 * клас, що репрезентує поїзд
 */
public class Train {
    private final int trainNumber;
    private int passengersNumber=0;

    private int cargoAmount;
    private int numberOfCars=0;
    private Time start;
    private Time arrive;
    private String destination;
    private List<Car> cars = new ArrayList<>();

    public Train(int trainNumber, String destination, String startTime, String arriveTime){
        this.trainNumber=trainNumber;
        this.destination=destination;
        this.start = new Time(startTime);
        this.arrive = new Time(arriveTime);
    }

    public static void setSequenceNumbers(List<Car> cars){
        for(int i= 0; i<cars.size(); i++)
            cars.get(i).setSequenceNumber(i+1);
    }

    public void setCargoAmount(int cargoAmount) {
        this.cargoAmount = cargoAmount;
    }

    public int getPassengersNumber() {
        for(Car car: cars)
            this.passengersNumber+=car.getPassengersNumber();

        return passengersNumber;
    }

    public void addCar(Car car){
        this.cars.add(car);
        car.setTrainNumber(this.trainNumber);
    }

    public Car delCar(int sequenceNumber){
        this.cars.remove(sequenceNumber);
        return cars.get(sequenceNumber);
    }


    public int getTrainNumber() {
        return trainNumber;
    }

    public int getNubberOfCars(){
        numberOfCars=cars.size();
        return numberOfCars;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumberOfCars() {
        numberOfCars=cars.size();
        return numberOfCars;

    }

    public int getCargoAmount() {
        return cargoAmount;
    }

    @Override
    public String toString() {
        return " Номер поїзда-"+this.trainNumber+ " " +destination + " Час відправлення-"+start.getStrTime() +" Час прибуття-"+this.arrive.getStrTime()+ " Кількість вагонів-" +cars.size() ;
    }

    public boolean isEqual(Train train){
        if(this.destination.equals(train.getDestination()) || train.getDestination().isEmpty()) {
            if (this.start.getStrTime().equals(train.start.getStrTime()) || train.start.getStrTime().isEmpty())
                return true;
        }
        return false;
    }

}
