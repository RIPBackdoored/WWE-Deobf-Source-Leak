package wwe;

import wwe.modules.world.*;

public class BcuG extends HAxG
{
    public BcuG() {
        super("pathfinder");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 1) {
                HAxG.TuzD(this.ZlRY());
                return;
            }
            if (array[0].equalsIgnoreCase("clear")) {
                PathFinder.LpTn.clear();
                HAxG.TuzD("Clearing path finder");
            }
            else {
                HAxG.TuzD(this.ZlRY());
            }
            }
        }
        catch (Exception ex) {
            this.kVjF(ex);
        }
    }
    
    @Override
    public String UiIp() {
        return "Removes all chunks captured in path finder, may fix lag";
    }
    
    @Override
    public String ZlRY() {
        return "Pathfinder clear";
    }
}
