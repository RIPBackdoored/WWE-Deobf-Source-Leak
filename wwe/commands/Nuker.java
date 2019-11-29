package wwe.commands;

import net.minecraft.block.*;
import wwe.utils.*;

public class Nuker extends Command
{
    public Nuker() {
        super("nuker");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 2) {
                Command.TuzD(this.ZlRY());
                return;
            }
            if (array[0].equalsIgnoreCase("add")) {
                if (Block.getBlockFromName(array[1]) != null) {
                    if (wwe.modules.world.Nuker.mTio.contains(Block.getBlockFromName(array[1]))) {
                        Command.TuzD("Thats already in the nuker list");
                        return;
                    }
                    wwe.modules.world.Nuker.mTio.add(Block.getBlockFromName(array[1]));
                    Command.TuzD("Added " + array[1] + " to the nuker list");
                    Wrapper.ypJK().pRYs();
                    }
                }
                else {
                    Command.TuzD("Thats not a block?");
                    }
                }
            }
            else if (this.wJNH(array[0])) {
                if (Block.getBlockFromName(array[1]) != null) {
                    if (!wwe.modules.world.Nuker.mTio.contains(Block.getBlockFromName(array[1]))) {
                        Command.TuzD("Thats not in the nuker list");
                        return;
                    }
                    wwe.modules.world.Nuker.mTio.remove(Block.getBlockFromName(array[1]));
                    Command.TuzD("Removed " + array[1] + " from the nuker list");
                    Wrapper.ypJK().pRYs();
                    }
                }
                else {
                    Command.TuzD("Thats not a block?");
                    }
                }
            }
            else {
                Command.TuzD(this.ZlRY());
            }
            }
        }
        catch (Exception ex) {
            this.kVjF(ex);
        }
    }
    
    @Override
    public String UiIp() {
        return "add/remove blocks from nuker, without option allBlocks on";
    }
    
    @Override
    public String ZlRY() {
        return "nuker add/remove name of block";
    }
}
