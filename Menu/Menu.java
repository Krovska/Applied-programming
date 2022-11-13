package Menu;

import Command.*;
import java.util.Scanner;

/**
 * клас меню
 */
public class Menu {
    private static TrainService service = new TrainService();
    Scanner obj = new Scanner(System.in);

    public int menu() throws Exception{
        Receiver receiver = addAllCommand(service);
        while(true) {
        System.out.println(" Виберіть пункт меню:\n 1 - Додати новий вагон до списку\n 2 - Створити новий поїзд\n 3 - Додати вагон у певний поїзд\n 4 - Видалити вагон з певного поїзда\n 5 - Вивести інформацію про певний вагон\n 6 - Вивести інформацію про поїзд за номером \n 7 - Вивести інофрмацію про поїздом за певними параметрами\n 8 - Завершити роботу");
        int commandIndex = obj.nextInt();
        obj.nextLine();
        if (commandIndex==8)
            break;
        if (commandIndex < 1 || commandIndex > 8)
        	throw new Exception("Введіть номер пункту меню!");
        receiver.runCommand(commandIndex-1, service);
        }
        return 0;
    }
    public static Receiver addAllCommand(TrainService service){
        Receiver receiver = new Receiver();
        receiver.addCommand(new CreateCarCommand(service));
        receiver.addCommand(new CreateTrainComand(service));
        receiver.addCommand(new AddCarToTrain(service));
        receiver.addCommand(new DelCarFromTrain(service));
        receiver.addCommand(new ShowCarWithNumber(service));
        receiver.addCommand(new ShowTrainWithNumber(service));
        receiver.addCommand(new ShowTrainWithParameters(service));

        return receiver;
    }
}
