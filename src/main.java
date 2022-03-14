
public class main {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 1;
        int skimmedMilkAmount = 2;
        int noLactoseMilkAmount = 2;

        boolean isBlocked = false;

        int capuccinoMilkRequired = 70;
        int capuccinoCoffeeRequired = 15;

        boolean milkIsEnough = milkAmount >= capuccinoMilkRequired ||
                skimmedMilkAmount >= capuccinoMilkRequired ||
                noLactoseMilkAmount >= capuccinoMilkRequired;

        boolean coffeeIsEnough = coffeeAmount >= capuccinoCoffeeRequired;

        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Кофе-машина заблокированна");
            hasErrors = true;
        }

        if (!coffeeIsEnough) {
            System.out.println("Кофе недостаточно");
            hasErrors = true;
        }

        if (!milkIsEnough) {
            System.out.println("Молока недостаточно");
            System.out.println("Налей молока, сука!!!");
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println("Готовим кофе");

        }

    }
}
