
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            Car car = new Car();
            car.drive();
        } catch (RuntimeException e) {
            System.out.println("Error");
        }

    }
}


