package Command;

import Menu.TrainService;

/**
 * клас, який показує параметри поїзда
 */
public class ShowTrainWithParameters implements Command{

    TrainService service = new TrainService();

    public ShowTrainWithParameters(TrainService service){
        this.service = service;
    }

    @Override
    public void executeMenu(TrainService service) {
        service.showTrainWithParameters();

    }
}
