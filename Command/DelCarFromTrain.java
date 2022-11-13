package Command;

import Menu.TrainService;

/**
 * клас, що видаляє вагон з поїзда
 */
public class DelCarFromTrain implements Command{

    TrainService service = new TrainService();

    public DelCarFromTrain(TrainService service){
        this.service = service;
    }

    @Override
    public void executeMenu(TrainService service) {
        TrainService.delCarFromTrain();
    }

}
