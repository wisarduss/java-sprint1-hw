import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            String command = scanner.next().trim();
            switch (command) {
                case "1":
                    stepTracker.addNewNumberStepsPerDay();
                    break;
                case "2":
                    stepTracker.changeStepGoal();
                    break;
                case "3":
                    stepTracker.printStatistic();
                    break;
                case "0":
                    System.out.println("До Свидания!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Такой команды нет");
                    break;
            }

        }
    }


    private static void printMenu() {
        System.out.println("Выберите команду.");
        System.out.println("1-Ввести количество шагов за определённый день.");
        System.out.println("2-Изменить цель по количеству шагов в день.");
        System.out.println("3-Напечатать статистику за определённый месяц.");
        System.out.println("0-Выйти из приложения.");
    }
}
