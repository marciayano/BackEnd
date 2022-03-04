package A7FlyweightPattern;

import A7FlyweightPattern.Factory.ComputerFactory;
import A7FlyweightPattern.model.Computer;

public class Program {
    public static void main(String[] args) {

        // Execução do App
        ComputerFactory fabrica = new ComputerFactory();
        Computer mac1 = fabrica.getComputer(16,500);
        Computer windows = fabrica.getComputer(2,256);
        Computer mac2 = fabrica.getComputer(16,500);
        Computer windows2 = fabrica.getComputer(8,1024);
        Computer windows3 = fabrica.getComputer(8,1024);

        System.out.println(mac1);
        System.out.println(mac2);
        System.out.println(windows);
        System.out.println(windows2);
        System.out.println(windows3);
    }
}
