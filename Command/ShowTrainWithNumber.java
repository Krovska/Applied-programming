package Command;

import Menu.TrainService;

/**
 * клас, який показує номер поїзда
 */
public class ShowTrainWithNumber implements Command{

    TrainService service = new TrainService();

    public ShowTrainWithNumber(TrainService service){
        this.service = service;
    }

    @Override
    public void executeMenu(TrainService service) {
        service.showTrainWithNumber();

    }

}
