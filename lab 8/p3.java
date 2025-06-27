
interface Transport {
        void deliver();
    }
    
    abstract class Animal {
        abstract void display();
    } 

    class Tiger extends Animal {
        @Override
        void display() {
            System.out.println("Tiger: Roars in the jungle.");
        }
    }
    
    class Camel extends Animal implements Transport {
        @Override
        void display() {
            System.out.println("Camel: Survives in the desert.");
        }
    
        @Override
        public void deliver() {
            System.out.println("Camel: Delivering goods across the desert.");
        }
    }
    class Deer extends Animal {
        @Override
        void display() {
            System.out.println("Deer: Grazes in the forest.");
        }
    }
    class Donkey extends Animal implements Transport {
        @Override
        void display() {
            System.out.println("Donkey: Hardworking and strong.");
        }
    
        @Override
        public void deliver() {
            System.out.println("Donkey: Delivering heavy loads.");
        }
    }
    public class p3 {
        public static void main(String[] args) {
            Animal[] animals = { new Tiger(), new Camel(), new Deer(), new Donkey() };
            ((Transport)animals[1]).deliver();
            ((Transport)animals[3]).deliver();
            animals[0].display();
            animals[1].display();
            animals[2].display();
            animals[3].display();
        }
    }
    