import java.io.PrintWriter;

public class Car {
    public Car() {
    }

    public void close() {
        try {
            System.out.println("Mashina jabylyp jatat");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    public void drive(){
        try {
            System.out.println("Mashina Jurup jatat");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


    }
}