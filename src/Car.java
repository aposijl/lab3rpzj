// клас для опису автомобіля
public class Car {
    private String model;
    private String manufacturer;
    private int year;
    private double engineCapacity;
    private double price;

    // конструктор класу
    public Car(String model, String manufacturer, int year, double engineCapacity, double price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.price = price;
    }

    // геттери та сеттери
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // перевизначений метод toString для форматованого виведення об'єкта Car
    @Override
    public String toString() {
        return "car {" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", engineCapacity=" + engineCapacity +
                ", price=" + price +
                '}';
    }

    // перевизначений метод equals для порівняння двох об'єктів Car
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;

        // порівняння всіх полів: рік, об'єм двигуна, ціна, модель, виробник
        return year == car.year &&
                Double.compare(car.engineCapacity, engineCapacity) == 0 &&
                Double.compare(car.price, price) == 0 &&
                model.equals(car.model) &&
                manufacturer.equals(car.manufacturer);
    }
}
