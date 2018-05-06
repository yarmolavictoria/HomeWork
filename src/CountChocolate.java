public class CountChocolate {
    public static void main(String[] args) {

        ManyCostWrapClass(10, 5, 2);


    }

    public static void ManyCostWrapClass(int money, int moneyCost, int wrapCost) {

        int chocolateCount = 0;
        int count = 0;

        if (wrapCost==1){
            System.out.print("Incorrect wrapCost!");
            return;
        }
        chocolateCount = money / moneyCost;
        count=chocolateCount;

            while (chocolateCount>=wrapCost){
                chocolateCount = chocolateCount/wrapCost;
                count+=chocolateCount;
            }

        System.out.println(count);

    }
}

