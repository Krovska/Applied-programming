package Menu;

import object.Car;
import object.Train;
import object.ComfortRating;

import java.util.HashMap;
import java.util.Scanner;

/**
 * клас з командами
 */
public class TrainService {

    public static HashMap<Integer, Train> trains = new HashMap<>();
    public static HashMap<Integer, Car> cars = new HashMap<>();


    public static void createCar(){  //якщо не існує вагона з таким номером
        ComfortRating comfortRating = ComfortRating.SEATING;

        Car car = new Car(1,20, comfortRating , 12);
        if(cars.get(car.getCarNumber())==null)
            cars.put(car.getCarNumber(), car);
        else System.out.println("sdf");
    }

    public void showCarWithNumber(){
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        obj.nextLine();
        System.out.println(cars.get(number));
    }

    public static Train createTrain(){//rewrite
        ComfortRating comfortRating  = ComfortRating.LUXE;
        Car car1 = new Car(1,20, comfortRating , 12);
        Car car2 = new Car(1,20, comfortRating , 12);

        Train train = new Train(1, "Lviv-Odessa", "12:00", "20:30");
        train.addCar(car1);
        train.addCar(car2);
        System.out.println(train);
        trains.put(train.getTrainNumber(), train);
        return train;
    }

    public static void addCarToTrain(){
        int carNumber = 1;
        int trainNumber = 1;
        if(cars.get(carNumber).getTrainNumber()==0)
            trains.get(trainNumber ).addCar(cars.get(carNumber));
        else
            System.out.println("Даний вагон вже ннаявний в іншому поїзді або його немає в базі:"+cars.get(carNumber).getTrainNumber());
    }

    public static void delCarFromTrain(){
        int sequenceNumber = 1;
        int trainNumber = 1;
        if(sequenceNumber<=trains.get(trainNumber).getNumberOfCars()){
            Car delCar = trains.get(trainNumber).delCar(sequenceNumber-1);
            delCar.setTrainNumber(0);
        }else System.out.println("В поїзді не існує даного вагона");
    }

    public void showTrainWithNumber(){
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        obj.nextLine();
        System.out.println(trains.get(number));
    }

    public void showTrainWithParameters(){
/*
        Train serchedTrain = TrainService.createTrain();
        trains.replace(serchedTrain.getTrainNumber(), serchedTrain);
        for(Train train: trains.values()){
            if(trains.get(train).isEqual(serchedTrain))
                System.out.println(train);
        }*/
    }

}





