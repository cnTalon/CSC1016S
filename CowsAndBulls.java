// Assignment 6
// Exercise 2
// 17 September 2022

public class CowsAndBulls {
    public final static int NUM_DIGITS = 4;
    public final static int MAX_VALUE = 9876;
    public final static int MIN_VALUE = 1234;
    public final static int MAX_GUESSES = 10;

    private NumberPicker randomNum;
    private int secretNum;
    private int guessesRem;
    private int bulls;
    private int cows;

    public CowsAndBulls(int seed) {
        randomNum = new NumberPicker(seed, 1, 9);
        secretNum = randomNum.nextInt();
        guessesRem = MAX_GUESSES;
        for (int i = 1;i < NUM_DIGITS; i++ ) {
            secretNum = secretNum*10 + randomNum.nextInt();
        }
    }

    // Obtain the number of guesses remaining.
    public int guessesRemaining() {
        return guessesRem;
    }

    public Result guess(int guessNumber) {
        bulls = NumberUtils.countMatches(secretNum, guessNumber);
        cows = NumberUtils.countIntersect(secretNum, guessNumber) - bulls;
        guessesRem --;
        return new Result(cows, bulls);
    }

    // ends game and returns secret number
    public int giveUp() {
        this.guessesRem = 0;
        return secretNum;
    }

    public boolean gameOver() {
        return guessesRem == 0 || bulls == 4;
    }
}
