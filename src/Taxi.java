import java.util.Arrays;

public class Taxi extends Car implements Stopable {
    private Person[] client;

    public Taxi(String name, String colour, int maxGuest, int price, Person[] client) {
        super(name, colour, maxGuest, price);
        this.client = client;
    }

    @Override
    public void stop() {
        if (client.length < getMaxGuest()) {
            System.out.println(" Taxi name : "+getName()+" => "+" stop  mesta bar ");
        } else {
            System.out.println(" Taxi name : "+getName()+" => "+" mesta jok ! ");
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                " client = " + Arrays.toString(client);
    }
}
