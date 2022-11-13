package Command;

import Menu.TrainService;

import java.util.ArrayList;
import java.util.List;

/**
 * клас, через який додаються команди
 */
public class Receiver {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void runCommand(int commandIndex, TrainService service){
        try {
            commands.get(commandIndex).executeMenu(service);
        }catch (Exception e){
            System.out.println("Неправильно введено дані. ");
        }

    }

}
