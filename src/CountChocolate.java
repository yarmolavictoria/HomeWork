public class CountChocolate {
    public static void main(String[] args) {

        ManyCostWrapClass(10, 5, 2);


    }

    public static void ManyCostWrapClass(int money, int moneyCost, int wrapCost) {

        int chockolateCount = 0;
        int count = 0;

        if (wrapCost==1){
            System.out.print("Incorrect wrapCost!");
            return;
        }
        chockolateCount = money / moneyCost;
        count=chockolateCount;

            while (chockolateCount>=wrapCost){
                chockolateCount = chockolateCount/wrapCost;
                count+=chockolateCount;
            }

        System.out.println(count);

    }
}

