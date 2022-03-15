
жpublic class main {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 1;
        int skimmedMilkAmount = 2;
        int noLactoseMilkAmount = 2;

        boolean isBlocked = false;

        int capuccinoMilkRequired = 60;
        int capuccinoCoffeeRequired = 10;

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
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println("Готовим кофе");
            System.out.println("хорошего дня");

        }

    }
}
