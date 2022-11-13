package object;

/**
 * клас, що репрезентує вагон поїзда
 */
public class Car {
    private final int carNumber;
    private int trainNumber=0;
    private int sequenceNumber=0;
    private final int seatsNumber;
    private int passengersNumber=0;

    private int cargoAmount=0;
    private int freePlaces;
    private final ComfortRating comfortClass;


    public Car(int carNumber, int seatsNumber, ComfortRating comfortClass, int passengersNumber){//пасажирів має бути менше чим місць
        this.carNumber=carNumber;
        this.seatsNumber=seatsNumber;
        this.comfortClass=comfortClass;
        this.freePlaces=seatsNumber-passengersNumber;
    }

    public void setTrainNumber(int trainNumber){
        this.trainNumber=trainNumber;
    }

    public void setSequenceNumber(int sequenceNumber){
        this.sequenceNumber=sequenceNumber;
    }

    public void serTrainNumber(Train train){
        this.trainNumber=train.getTrainNumber();
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public void setCargoAmount(int cargoAmount) {
        this.cargoAmount = cargoAmount;
    }

    public void setFreePlaces(int freePlaces) {
        this.freePlaces = freePlaces;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public ComfortRating getComfortClass() {
        return comfortClass;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public int getCargoAmount() {
        return cargoAmount;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    @Override
    public String toString() {
        String trainNumberStr;
        if(this.trainNumber==0)
            trainNumberStr=" Не привʼязаний до жодного поїзда";
        else
            trainNumberStr=" Номер поїзда-"+this.trainNumber+" Порядковий номер вагону у поїзді-"+this.sequenceNumber;
        return this.comfortClass.toString()+" Кількість місць-"+ this.seatsNumber + " Номер вагона-" + this.carNumber+trainNumberStr;
    }

}
