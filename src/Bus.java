import java.util.Arrays;

public class Bus extends Car implements Stopable {
        private Person[] people;

        public Bus(String name, String colour, int maxGuest, int price, Person[] people) {
            super(name, colour, maxGuest, price);
            this.people = people;
        }



        @Override
        public void stop() {
            if (people.length < getMaxGuest()) {
                System.out.println(" Bus name : "+getName()+" => "+" stop mesta bar");
            } else {
                System.out.println(" Bus name : "+getName()+" => "+" mesta jok ! ");
            }
        }

        @Override
        public String toString() {
            return super.toString() +
                    " people = " + Arrays.toString(people);
        }
    }

