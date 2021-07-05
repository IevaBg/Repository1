public class SuperHero {
    public static void main(String[] args) {
	// write your code here
        /**
         ## Lesson 3 - Variables and Data Types
         - Create variables:
         - Hero name - String
         - Hero age - int
         - Hero powers - heroPower1, heroPower2, heroPower3
         - Create "Hero Card" view. Print variables to console
         */
        String nameOfHero;
        short ageOfHero;
        boolean isAwake;
        int netWorth;
        double averageWorthPerYear;
        float heightOfHero;
        char currencyOfNetWorth;
        byte gradeOfSuccess;
        String heroPower1, heroPower2, heroPower3;
        nameOfHero = "Dark Monkey";
        ageOfHero = 9;
        heightOfHero = 0.5F;
        isAwake = true;
        netWorth = 1000;
        averageWorthPerYear = (double)netWorth / ageOfHero;
        currencyOfNetWorth = 'Y';
        gradeOfSuccess = 14;
        heroPower1 = "can fly";
        heroPower2 = "can turn invisable";
        heroPower3 = "can be very funny";
        System.out.println("************************************************************");
        System.out.println();
        System.out.println("Hero name: ");
        System.out.println(nameOfHero);
        System.out.print("Hero age: ");
        System.out.println(ageOfHero);
        System.out.println("Hero height: ");
        System.out.println(heightOfHero);
        System.out.println("------------");
        System.out.println();
        System.out.println("Hero powers:");
        System.out.println(heroPower1);
        System.out.println(heroPower2);
        System.out.println(heroPower3);
        System.out.println("------------");
        System.out.println();
        System.out.println("Net worth of nameOfHero " + nameOfHero + ": ");
        System.out.println(netWorth + "(" + currencyOfNetWorth + ")");
        System.out.println("------------");
        System.out.print("Is always awake? - ");
        System.out.println(isAwake);
        System.out.print("Grade of success (1 - 100): ");
        System.out.println(gradeOfSuccess);
        System.out.println("\n");
        System.out.println("************************************************************");
