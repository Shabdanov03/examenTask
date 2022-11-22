import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* 1.Car деген абстракт класс тузунуз поляларын толтурунуз.
         String name;
         String colour;
         int maxGuest;
         int price;
         2.Person класс тузунуз полелерин озунуз жазыныз жана бардык
         эске алынчуу нерселердин алдын алыныз.
         3.Car классын мурастаган 2 класс тузунуз.Bus(private Person[]people)
         жана Taxi(private Person[]client).
         4.StopAble деген interface ачыныз.
         1-public void stop() бул метод машинада места барбы ошону текшеруучу метод болот эгер
         стоп методун иштетсек эгер места бар болсо токтоду деп чыгат места жок болсо места жок деп чыгат.
         2-баардык машиналарды кайтаруучу метод жазыныз!
         3-Ошол машинанын атын жазсак ошондо отурган адамдарды чыгарып беруучу метод жазыныз.
         4-Машинанын аты менен тапчуу метод жазыныз.
         5.StopAble интерфейсин Bus жана Taxi деген класстар implements
         кылсын жана логикасын ошол класста жазыныз.
         6.Баардык методдорду Main класста иштетиниз.  */

        Person person = new Person("Ilim", 18);
        Person person1 = new Person("Nurik", 20);
        Person person2 = new Person("Dastan", 19);
        Person[] people = {person, person1, person2};


        Person client = new Person("Rahim", 20);
        Person client3 = new Person("Bayish", 20);
        Person client1 = new Person("Mukhammed", 25);
        Person client2 = new Person("Aijamal", 23);
        Person[] cleints = {client, client1, client2, client3};

        Bus bus = new Bus("157-Bus", "white", 25, 150000, people);
        Bus bus1 = new Bus("152-Bus", "white", 20, 200000, people);
        Taxi taxi = new Taxi("yandeks", "Black", 4, 500000, cleints);
        Taxi taxi2 = new Taxi("jorgo", "blue", 5, 900000, cleints);
        Car[] cars = {bus, bus1, taxi2, taxi};


        System.out.println(" Oll Cars : ");
        Car.getAllCar(cars);
        System.out.println("--------------------------------------");
        System.out.println(" Enter by car name :");
        String name = new Scanner(System.in).nextLine();
        Car.getCarName(cars, name);
        System.out.println("--------------------------------------");
        System.out.println(" Enter by car name for find person  ");
        String nameClient = new Scanner(System.in).nextLine();
        Car.getCarClientName(cars, people, nameClient);
        System.out.println("--------------------------------------");
        taxi.stop();
        taxi2.stop();
        bus.stop();
        bus1.stop();


    }
}