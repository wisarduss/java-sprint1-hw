import java.util.Scanner;

public class StepTracker {
    int goalByStepsPerDay = 10000;
    private final Converter converter = new Converter();
    private final MonthData[] monthToData = new MonthData[12];
    private final Scanner scanner;

    StepTracker(Scanner scanner) {
        this.scanner = scanner;


        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void printStatistic() {
        System.out.println("Введите месяц.");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Такого месяца не существует!");
            return;
        }
        MonthData monthData = monthToData[month - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println("Количество пройденных шагов по дням");
        monthData.printDaysAndStepsFromMonth();
        System.out.println("общее количество шагов за месяц: " + monthData.sumStepsFromMonth());
        System.out.println("максимальное пройденное количество шагов в месяце: " + sumSteps);
        System.out.println("среднее количество шагов: " + sumSteps/ monthData.days.length);
        System.out.println("пройденная дистанция (в км): " + converter.convertToKm(sumSteps));
        System.out.println("количество сожжённых килокалорий: " + converter.convertStepsToKilocalories(sumSteps));
        System.out.println("лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));
        System.out.println();

    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца.");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Такого месяца не существует!");
            return;
        }

        System.out.println("Выберите день.");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Такого дня не существует!");
            return;
        }
        System.out.println("Введите количество шагов.");
        int steps = scanner.nextInt();
        if (steps < 0) {
            System.out.println("Количество шагов не может быть отрицательным");
            return;
        }
        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] = steps;
    }

    void changeStepGoal() {
        System.out.println("Введите новую цель по количеству шагов");
        int newGoalByStepsPerDay = scanner.nextInt();
        if (newGoalByStepsPerDay <= 0) {
            System.out.println("Количество шагов не может быть отрицательным!");
            return;
        } else if (newGoalByStepsPerDay == goalByStepsPerDay) {
            System.out.println("У вас уже задано такое количество шагов");
            return;
        }
        goalByStepsPerDay = newGoalByStepsPerDay;
    }
}
