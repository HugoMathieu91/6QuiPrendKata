

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {

        int bullHeads = 1 ;

        if(value % 5 == 0){
            bullHeads+=1 ;
        }

        if(value %10 == 0){
            bullHeads += 1 ;
        }

        if(value %11 == 0){
            bullHeads+=4 ;
        }

        if(value == 55){
            bullHeads=7 ;
        }
        return bullHeads ;

    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}
