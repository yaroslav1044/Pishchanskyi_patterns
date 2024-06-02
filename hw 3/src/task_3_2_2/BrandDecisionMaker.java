package task_3_2_2;

import task_3_2_2.factory.*;
import task_3_2_2.transport.Transport;

public class BrandDecisionMaker {

    private static Transport[] createTransports(TransportFactory factory, int numberBuses, int numberTrolleybuses, int numberTrams) {
        Transport[] transports = new Transport[numberBuses + numberTrolleybuses + numberTrams];
        int i = 0;
        for (; i < numberBuses; i++) {
            transports[i] = factory.createBus();
        }
        for (; i < numberBuses + numberTrolleybuses; i++) {
            transports[i] = factory.createTrolleybus();
        }
        for (; i < numberBuses + numberTrolleybuses + numberTrams; i++) {
            transports[i] = factory.createTram();
        }
        return transports;
    }

    private static int calculateTotalCost(Transport[] transports, int N) {
        int totalCost = 0;
        for (Transport transport : transports) {
            totalCost += transport.getPurchaseCost() + transport.calculateDistanceCost(N * 1000);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int numberBuses = 15;
        int numberTrolleybuses = 10;
        int numberTrams = 5;
        int N = 1000;
        int hyundaiTotalCost;
        int skodaTotalCost;
        int volvoTotalCost;

        TransportFactory hyundaiFactory = new HyundaiTransportFactory();
        TransportFactory skodaFactory = new SkodaTransportFactory();
        TransportFactory volvoFactory = new VolvoTransportFactory();

        Transport[] transports;

        transports = createTransports(skodaFactory, numberBuses, numberTrolleybuses, numberTrams);
        skodaTotalCost = calculateTotalCost(transports, N);

        transports = createTransports(volvoFactory, numberBuses, numberTrolleybuses, numberTrams);
        volvoTotalCost = calculateTotalCost(transports, N);

        System.out.println("Skoda total cost: " + skodaTotalCost);
        System.out.println("Volvo total cost: " + volvoTotalCost);

        if (skodaTotalCost < volvoTotalCost) {
            System.out.println("Skoda is better");
        } else if (skodaTotalCost > volvoTotalCost) {
            System.out.println("Volvo is better");
        } else {
            System.out.println("Skoda and Volvo are equal");
        }

        transports = createTransports(hyundaiFactory, numberBuses, numberTrolleybuses, numberTrams);
        hyundaiTotalCost = calculateTotalCost(transports, N);

        System.out.println("\nWow! We have a new competitor - Hyundai!");

        System.out.println("Hyundai total cost: " + hyundaiTotalCost);

        if (hyundaiTotalCost < skodaTotalCost) {
            if (hyundaiTotalCost < volvoTotalCost) {
                System.out.println("Hyundai is better");
            } else if (hyundaiTotalCost > volvoTotalCost) {
                System.out.println("Volvo is better");
            } else {
                System.out.println("Hyundai and Volvo are equal");
            }
        } else if (hyundaiTotalCost > skodaTotalCost) {
            if (skodaTotalCost < volvoTotalCost) {
                System.out.println("Skoda is better");
            } else if (skodaTotalCost > volvoTotalCost) {
                System.out.println("Volvo is better");
            } else {
                System.out.println("Skoda and Volvo are equal");
            }
        } else {
            if (hyundaiTotalCost < volvoTotalCost) {
                System.out.println("Hyundai and Skoda are equal");
            } else if (hyundaiTotalCost > volvoTotalCost) {
                System.out.println("Volvo is better");
            } else {
                System.out.println("Hyundai, Skoda and Volvo are equal");
            }
        }
    }
}
