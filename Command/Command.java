package Command;

import Menu.TrainService;

/**
 * інтерфейс, що виконує меню
 */
public interface Command {
    void executeMenu(TrainService service);
}
