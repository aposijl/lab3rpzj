import java.util.Arrays;
import java.util.Comparator;

/*С11 = 1: визначити клас автомобіль, який складається як мінімум з 5-и полів. */

public class Main {
    public static void main(String[] args) {

        // створення масиву об'єктів класу Car
        Car[] cars = {
                new Car("Lanos", "ZAZ", 2010, 1.5, 4000),
                new Car("Niva", "VAZ", 2010, 1.7, 6000),
                new Car("Niva", "VAZ", 2010, 1.7, 6000),
                new Car("Sens", "ZAZ", 2012, 1.3, 3500),
                new Car("Tavria", "ZAZ", 2005, 1.2, 2000),
                new Car("Lada 2107", "VAZ", 2012, 1.6, 4500)
        };

        System.out.println("початковий список автомобілів:");
        for (Car car : cars) {
            System.out.println(car);
        }

        // сортування масиву за роком (за зростанням) і за ціною (за спаданням)
        Arrays.sort(cars, Comparator.comparing(Car::getYear).thenComparing(Comparator.comparing(Car::getPrice).reversed()));

        // виведення відсортованого масиву
        System.out.println("\nвідсортований масив автомобілів:");
        for (Car car : cars) {
            System.out.println(car);
        }

        Car selectedCar = new Car("Niva", "VAZ", 2010, 1.7, 6000);

        // пошук ідентичного автомобіля до заданого в масиві та його виведення
        Arrays.stream(cars)
                .filter(car -> car.equals(selectedCar))  // порівняння через equals()
                .findAny()
                .ifPresentOrElse(
                        car -> System.out.println("\nзнайдено автомобіль: " + car),
                        () -> System.out.println("\nавтомобіль не знайдено"));
    }
}
