package Command;

import Menu.TrainService;

/**
 * додавання вагону до поїзда
 */
public class AddCarToTrain implements Command{

    TrainService service = new TrainService();

    public AddCarToTrain(TrainService service){
        this.service = service;
    }

    @Override
    public void executeMenu(TrainService service) {
        TrainService.addCarToTrain();
    }

}
