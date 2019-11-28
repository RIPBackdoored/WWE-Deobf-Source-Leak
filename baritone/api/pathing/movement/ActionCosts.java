package baritone.api.pathing.movement;

public interface ActionCosts
{
    public static final double WALK_ONE_BLOCK_COST = 4.63284688441047;
    public static final double WALK_ONE_IN_WATER_COST = 9.09090909090909;
    public static final double WALK_ONE_OVER_SOUL_SAND_COST = 9.26569376882094;
    public static final double LADDER_UP_ONE_COST = 8.51063829787234;
    public static final double LADDER_DOWN_ONE_COST = 6.666666666666667;
    public static final double SNEAK_ONE_BLOCK_COST = 15.384615384615383;
    public static final double SPRINT_ONE_BLOCK_COST = 3.563791874554526;
    public static final double SPRINT_MULTIPLIER = 0.7692444761225944;
    public static final double WALK_OFF_BLOCK_COST = 3.7062775075283763;
    public static final double CENTER_AFTER_FALL_COST = 0.9265693768820937;
    public static final double COST_INF = 1000000.0;
    public static final double[] FALL_N_BLOCKS_COST = generateFallNBlocksCost();
    public static final double FALL_1_25_BLOCKS_COST = distanceToTicks(1.25);
    public static final double FALL_0_25_BLOCKS_COST = distanceToTicks(0.25);
    public static final double JUMP_ONE_BLOCK_COST = ActionCosts.FALL_1_25_BLOCKS_COST - ActionCosts.FALL_0_25_BLOCKS_COST;
    
    default double[] generateFallNBlocksCost() {
        final double[] array = new double[257];
        for (int i = 0; i < 257; ++i) {
            final double[] array2 = array;
            final int n = i;
            array2[n] = distanceToTicks(n);
        }
        return array;
    }
    
    default double velocity(final int n) {
        return (Math.pow(0.98, n) - 1.0) * -3.92;
    }
    
    default double oldFormula(final double n) {
        return -3.92 * (99.0 - 49.5 * (Math.pow(0.98, n) + 1.0) - n);
    }
    
    default double distanceToTicks(final double n) {
        if (n == 0.0) {
            return 0.0;
        }
        double n2 = n;
        int n3 = 0;
        double velocity;
        while (true) {
            velocity = velocity(n3);
            if (n2 <= velocity) {
                break;
            }
            n2 -= velocity;
            ++n3;
        }
        return n3 + n2 / velocity;
    }
}
