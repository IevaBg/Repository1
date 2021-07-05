public class SuperHero {

    public static void main (String[] args) {


        String nameOfHero = "Dark Monkey";
        short ageOfHero = 9;
        boolean isReal = true;
        int netWorth = 9000;
        double averageWorthPerYear = netWorth / (double) ageOfHero;
        float lifeExpectancyYears = 100000000.56f;
        char currencyOfNetWorth = 'X';
        byte happinessLevel = 127;
        String heroPower1, heroPower2, heroPower3;

        heroPower1 = "can fly";
        heroPower2 = "can turn invisible";
        heroPower3 = "can be very funny";

        System.out.println("************************************************************");
        System.out.println();
        System.out.print("Hero name: ");
        System.out.println(nameOfHero);
        System.out.print("Hero age: ");
        System.out.println(ageOfHero);
        System.out.print("Hero life expectancy in years: ");
        System.out.println(lifeExpectancyYears);

        System.out.println("------------");
        System.out.println();
        System.out.println("Hero powers:");
        System.out.println(heroPower1);
        System.out.println(heroPower2);
        System.out.println(heroPower3);

        System.out.println("------------");
        System.out.println();
        System.out.print("Net worth of " + nameOfHero + ": ");
        System.out.println(netWorth + "(" + currencyOfNetWorth + ")");

        System.out.println("------------");

        System.out.print("Is it real? - ");
        System.out.println(isReal);
        System.out.print("Happiness level (-128 - 127): ");
        System.out.println(happinessLevel);
        System.out.println("\n");
        System.out.println("************************************************************");

    }
}
