package wwe.commands;

import net.minecraft.block.*;
import wwe.utils.*;
import wwe.*;

public class Xray extends Command
{
    public Xray() {
        super("xray");
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
                    if (wwe.modules.render.Xray.dMba.contains(Block.getBlockFromName(array[1]))) {
                        Command.TuzD("Thats already in the xray list");
                        return;
                    }
                    wwe.modules.render.Xray.dMba.add(Block.getBlockFromName(array[1]));
                    Command.TuzD("Added " + array[1] + " to the xray list");
                    Wrapper.ypJK().TQyP();
                    if (Client.hNxW.qHPF((Class<wwe.modules.render.Xray>)jCBS.class).IuiN()) {
                        Wrapper.mc.renderGlobal.loadRenderers();
                    }
                }
                else {
                    Command.TuzD("Thats not a block?");
                    }
                }
            }
            else if (this.wJNH(array[0])) {
                if (Block.getBlockFromName(array[1]) != null) {
                    if (!wwe.modules.render.Xray.dMba.contains(Block.getBlockFromName(array[1]))) {
                        Command.TuzD("Thats not in the xray list");
                        return;
                    }
                    wwe.modules.render.Xray.dMba.remove(Block.getBlockFromName(array[1]));
                    Command.TuzD("Removed " + array[1] + " from the xray list");
                    Wrapper.ypJK().TQyP();
                    if (Client.hNxW.qHPF((Class<wwe.modules.render.Xray>)jCBS.class).IuiN()) {
                        Wrapper.mc.renderGlobal.loadRenderers();
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
        return "add/remove blocks from xray";
    }
    
    @Override
    public String ZlRY() {
        return "xray add/remove name of block";
    }
}
