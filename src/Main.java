import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створення об'єкта для класу Population
        Population population = new Population(); // Введення даних для населення
        population.displayInfo();  // Вивід інформації
        System.out.println("Густота населення: " + population.calculateDensity() + " осіб/кв. ");

        // Оновлення загальної кількості населення
        population.updatePopulation(); // Виклик методу для оновлення

        // Введення даних для економіки
        Economy economy = new Economy(); // Створення об'єкта для класу Economy
        System.out.print("Введіть загальний дохід населення: ");
        double annualSalary = scanner.nextDouble();
        double taxRevenue = economy.calculateTax(annualSalary); // Розрахунок податкових надходжень
        economy.distributeTax(taxRevenue); // Розподіл податкових надходжень

        // Створення об'єкта для класу Geography
        Geography geography = new Geography(); // Введення даних для географії
        System.out.println("Відсоток суші: " + geography.calculateLandPercentage() + "%");
        System.out.println("Відношення води до суші: " + geography.calculateWaterToLandRatio());

        scanner.close(); // Закриття сканера
    }
}
