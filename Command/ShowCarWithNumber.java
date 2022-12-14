package Command;

import Menu.TrainService;

/**
 * клас, який показує номер вагона
 */
public class ShowCarWithNumber implements Command{

    TrainService service = new TrainService();

    public ShowCarWithNumber(TrainService service){
        this.service = service;
    }

    @Override
    public void executeMenu(TrainService service) {
        service.showCarWithNumber();
    }
}
