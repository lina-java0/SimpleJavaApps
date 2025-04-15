public class CoffeeMachine {
    public static void main(String[] args) {
        int coffeeAmount = 110;
        int milkAmount = 110;
        int skimmedMilkAmount = 0;

        boolean isWork = true;
        boolean isBlocked = false;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeRequired = 15;

        boolean milkEnough = milkAmount >= cappuchinoMilkRequired || skimmedMilkAmount >= cappuchinoMilkRequired;
        boolean cofFeeEnough = coffeeAmount >= cappuchinoCoffeRequired;

        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Coffe machine is blocked");
            hasErrors = true;
        }

        if (!cofFeeEnough) {
            System.out.println("Not enough coffee");
            hasErrors = true;
        }

        if (!milkEnough) {
            System.out.println("Not enough milk");
            hasErrors = true;
        }

        if(!hasErrors) {
            System.out.println("Let's cook coffee");
        }
    }
}
