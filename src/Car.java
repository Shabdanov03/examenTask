public abstract class Car {
    private String name;
    private String colour;
    private int maxGuest;
    private int price;

    public Car(String name, String colour, int maxGuest, int price) {
        this.name = name;
        this.colour = colour;
        this.maxGuest = maxGuest;
        this.price = price;
    }

    public Car() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void getAllCar(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static void getCarName(Car[] cars, String name) {
        for (Car car : cars) {
            if (car.getName().equals(name)) System.out.println(car);
        }
    }

    public static void getCarClientName(Car[] cars, Person[] people, String nameClient) {
        for (Car car : cars) {
            for (Person person : people) {
                if (car.getName().equals(nameClient)) {
                    System.out.println(person.getName());
                }
            }
        }
    }

    @Override
    public String toString() {
        return "-------------------------------------------------------------" + '\n' +
                " Car => " +
                " name = " + name + '\'' +
                " colour = " + colour + '\'' +
                " maxGuest = " + maxGuest + '\'' +
                " price = " + price + '\n';
    }
}
