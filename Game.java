package TicTacToeOOP;

public interface Game {
    void MakeField(int dim);

    int[] MakeMove();

    boolean GameContinue();
}