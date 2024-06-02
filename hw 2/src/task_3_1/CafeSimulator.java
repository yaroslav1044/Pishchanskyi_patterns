package task_3_1;

import task_3_1.DrinkMachine.*;

public class CafeSimulator {

    private DrinkType getRandomDrinkType() {
        boolean getCoffee = Math.random() < 0.5;
        if (getCoffee) {
            return CoffeeType.values()[(int) (Math.random() * CoffeeType.values().length)];
        } else {
            return TeaType.values()[(int) (Math.random() * TeaType.values().length)];
        }
    }
    public double simulateCafeDay(){
        int dayWorkMinutes = 8 * 60;
        int time = 0;
        double totalIncome = 0;
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        TeaMachine teaMachine = new TeaMachine();

        DrinkType randomDrinkType;
        boolean clientArrived;

        while (time < dayWorkMinutes) {
            clientArrived = Math.random() < 0.5;

            if (clientArrived) {
                randomDrinkType = getRandomDrinkType();
                if (randomDrinkType instanceof CoffeeType) {
                    totalIncome += coffeeMachine.makeDrink(randomDrinkType, (int) (Math.random() * 4)).getPrice();
                } else if (randomDrinkType instanceof TeaType) {
                    totalIncome += teaMachine.makeDrink(randomDrinkType, (int) (Math.random() * 4)).getPrice();
                }
            }

            time += 5;
        }

        return totalIncome;
    }

    public static void main(String[] args) {
        CafeSimulator cafeSimulator = new CafeSimulator();
        System.out.println("Total income: " + cafeSimulator.simulateCafeDay());
    }
}
