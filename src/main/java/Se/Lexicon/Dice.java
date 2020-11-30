package Se.Lexicon;


public enum Dice {

    D6(1, 6),
    D10(1,10),
    D20(1,20),
    D100(1,100);

    private int startValue;
    private int maxValue;

    Dice(int startValue, int maxValue) {
        this.startValue = startValue;
        this.maxValue = maxValue;




    } public static int getRandom(int startValue, int maxValue){
        return ((int) (Math.random()*(maxValue - startValue))) + startValue;
    }

    public static void main(String[] args) {

        System.out.println("Random value of D6 : " + getRandom(1, 6));
        System.out.println("Random value of D10 : " + getRandom(1, 10));
        System.out.println("Random value of D20 : " + getRandom(1, 20));
        System.out.println("Random value of 100 : " + getRandom(1, 100));


    }
}
