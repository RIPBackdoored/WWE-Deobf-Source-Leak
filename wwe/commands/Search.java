package wwe.commands;

import java.awt.*;
import net.minecraft.block.*;
import wwe.utils.*;
import wwe.*;
import java.util.*;

public class Search extends Command
{
    public Search() {
        super("search");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 1) {
                Command.TuzD(this.ZlRY());
                return;
            }
            if (array[0].equalsIgnoreCase("add")) {
                if (array.length < 5) {
                    Command.TuzD(this.ZlRY());
                    return;
                }
                final Color color = new Color(Integer.parseInt(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]));
                if (Block.getBlockFromName(array[1]) != null) {
                    if (wwe.modules.render.Search.Hxmz.containsKey(Block.getBlockFromName(array[1]))) {
                        Command.TuzD("Thats already in the search list");
                        return;
                    }
                    wwe.modules.render.Search.Hxmz.put(Block.getBlockFromName(array[1]), color);
                    Wrapper.ypJK().JDPi();
                    Command.TuzD("Added " + array[1] + " to the search list");
                    if (((QSTh)Client.hNxW.qHPF((Class<wwe.modules.render.Search>)QSTh.class)).IuiN()) {
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
                    if (!wwe.modules.render.Search.Hxmz.containsKey(Block.getBlockFromName(array[1]))) {
                        Command.TuzD("Thats not in the search list");
                        return;
                    }
                    final HashMap<Block, Object> hxmz = new HashMap<Block, Object>();
                    for (final Map.Entry<Block, Color> entry : wwe.modules.render.Search.Hxmz.entrySet()) {
                        if (entry.getKey() != Block.getBlockFromName(array[1])) {
                            hxmz.put(entry.getKey(), entry.getValue());
                    }
                    wwe.modules.render.Search.Hxmz = (HashMap<Block, Color>)hxmz;
                    Wrapper.ypJK().JDPi();
                    wwe.modules.render.Search.Hxmz.remove(Block.getBlockFromName(array[1]));
                    Command.TuzD("Removed " + array[1] + " from the search list");
                    if (((QSTh)Client.hNxW.qHPF((Class<wwe.modules.render.Search>)QSTh.class)).IuiN()) {
                        Wrapper.mc.renderGlobal.loadRenderers();
                    }
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
            Command.TuzD("Maybe one or more of the colors is incorrect, pick a number between 0 and 255");
            this.kVjF(ex);
        }
    }
    
    @Override
    public String UiIp() {
        return "add/remove a block from the search module";
    }
    
    @Override
    public String ZlRY() {
        return "search add/remove blockname red green blue";
    }
}
