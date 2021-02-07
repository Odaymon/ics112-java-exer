public class Denomination{
    public static int oneHundred(int change){
        return change/100;
    }

    public static int fifty(int change){
        return change/50;
    }

    public static int twenty(int change){
        return change/20;
    }

    public static int ten(int change){
        return change/10;
    }

    public static int one(int change){
        return change;
    }
}