package com.example.umpire;

/**
 * Represents a ball strike counter that a baseball or softball umpire would use
 */
public class BallStrikeCounter {
    /** Number of balls in the count, range = 0 to BALLS_FOR_WALK */
    private int nBalls;

    /** Number of strikes in the count, range = 0 to STRIKES_FOR_OUT */
    private int nStrikes;

    /** Number outs in the inning. range = 0 to 3 */
    private int nOuts;

    /** Number of balls resulting in a walk */
    private static final int BALLS_FOR_WALK = 4;

    /** Number of strikes for an out */
    private static final int STRIKES_FOR_OUT = 3;

    /**
     * Creates a new counter in the default state of 0 balls, 0 strikes
     */
    public BallStrikeCounter() {
        reset();
    }

    /**
     *
     * @return the current number of balls in the count
     */
    public int getNBalls() {
        return nBalls;
    }

    /**
     *
     * @return the current number of strikes in the count
     */
    public int getNStrikes() {
        return nStrikes;
    }

    /**
     * Adds one ball to the count
     */
    public void callBall() {
        nBalls++;

        if (nBalls >= BALLS_FOR_WALK) {
            nBalls = 0;
            nStrikes = 0;
    }

    /**
     * Adds one strike to the count
     */
    public void callStrike() {
        nStrikes++;

        if (nStrikes >= STRIKES_FOR_OUT) {
            nBalls = 0;
            nStrikes = 0;
            addOut();
        }
    }

    /**
     * Resets the count to no balls and no strikes
     */
    public void reset() {
        nBalls = 0;
        nStrikes = 0;
        nOuts = 0;
    }

    public void addOut(){
        nOuts++;
    }
    public int getnOuts(){
        return nOuts;
    }
}
