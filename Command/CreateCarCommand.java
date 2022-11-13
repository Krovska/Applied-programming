package Command;

import Menu.TrainService;

/**
 * клас, що створює вагон
 */
public class CreateCarCommand implements Command{
    TrainService service = new TrainService();

    public CreateCarCommand(TrainService service){
        this.service = service;
    }

    @Override
    public void executeMenu(TrainService service) {

        TrainService.createCar();
    }

}
