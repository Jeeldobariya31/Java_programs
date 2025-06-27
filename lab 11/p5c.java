import java.util.Random;
class SharedResource {
    private int number;
    private boolean isGenerated = false;

    public synchronized void generateNumber() {
        Random rand = new Random();
        number = rand.nextInt(100); 
        System.out.println("Generated Number: " + number);
        isGenerated = true;
        notifyAll(); 
    }

    public synchronized int getNumber() {
        while (!isGenerated) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isGenerated = false;
        return number;
    }
}

class NumberGenerator extends Thread {
    SharedResource resource;

    public NumberGenerator(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        while (true) {
            resource.generateNumber();
            try {
                Thread.sleep(1000); 
                e.printStackTrace();
            }
        }
    }
}

class SquareCalculator extends Thread {
    SharedResource resource;

    public SquareCalculator(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        while (true) {
            int num = resource.getNumber();
            if (num % 2 == 0) {
                System.out.println("Square of " + num + " = " + (num * num));
            }
        }
    }
}

class CubeCalculator extends Thread {
    SharedResource resource;

    public CubeCalculator(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        while (true) {
            int num = resource.getNumber();
            if (num % 2 != 0) {
                System.out.println("Cube of " + num + " = " + (num * num * num));
            }
        }
    }
}

public class p5c {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        NumberGenerator generator = new NumberGenerator(resource);
        SquareCalculator squareCalc = new SquareCalculator(resource);
        CubeCalculator cubeCalc = new CubeCalculator(resource);

        generator.start();
        squareCalc.start();
        cubeCalc.start();
    }
}
