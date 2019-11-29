package wwe;

import net.minecraft.util.text.*;
import java.util.*;

public class YRhC extends HAxG
{
    public YRhC() {
        super("help");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        for (final HAxG hAxG : DhFe.ACXD) {
            if (hAxG != this) {
                HAxG.CuSq(hAxG.thqu() + " " + TextFormatting.DARK_GRAY + "-" + TextFormatting.DARK_RED + " " + hAxG.UiIp(), "https://wweclient.com/documentation/commands/" + hAxG.thqu() + ".php");
            }
            }
        }
    }
    
    @Override
    public String UiIp() {
        return "Lists all commands";
    }
    
    @Override
    public String ZlRY() {
        return "help";
    }
}
