package task_2;

import static java.lang.Math.abs;

public class KnightMove {
    public static boolean isCorrectKnightMove(int knightX, int knightY, int nextMoveX, int nextMoveY){
        int xDifference = abs(nextMoveX - knightX);
        int yDifference = abs(nextMoveY - knightY);
        if( (xDifference == 1 && yDifference == 2) || (xDifference == 2 && yDifference == 1) )
        {
            return  true;
        }
        return false;
    }
}
