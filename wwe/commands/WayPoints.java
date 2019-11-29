package wwe.commands;

import wwe.utils.*;
import net.minecraft.util.math.*;
import net.minecraft.item.*;
import java.util.*;
import net.minecraft.client.gui.*;
import wwe.*;

public class WayPoints extends Command
{
    Xssq cFha;
    
    public WayPoints() {
        super("WayPoints");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 1) {
                Command.TuzD(this.ZlRY());
                return;
            }
            if (array[0].equalsIgnoreCase("list")) {
                for (final Xssq xssq : wwe.modules.world.WayPoints.COfQ) {
                    Command.TuzD(xssq.CkDS + " X:" + xssq.Nehz.getX() + " Y:" + xssq.Nehz.getY() + " Z:" + xssq.Nehz.getZ());
                }
                return;
            }
            if (array.length < 2) {
                Command.TuzD(this.ZlRY());
                return;
            }
            if (array[0].equalsIgnoreCase("add")) {
                final Iterator<Xssq> iterator2 = wwe.modules.world.WayPoints.COfQ.iterator();
                while (iterator2.hasNext()) {
                    if (iterator2.next().CkDS.equalsIgnoreCase(array[1])) {
                        Command.TuzD(array[1] + " is already a way point?");
                        return;
                }
                wwe.modules.world.WayPoints.VlSt(new Xssq(array[1], new BlockPos(Wrapper.mc.player.posX, Wrapper.mc.player.posY, Wrapper.mc.player.posZ), EnumDyeColor.RED, true, false, false));
                Command.TuzD("Added waypoint " + array[1]);
                Wrapper.ypJK().VLak();
                }
            }
            else if (this.wJNH(array[0])) {
                for (final Xssq xssq2 : wwe.modules.world.WayPoints.COfQ) {
                    if (xssq2.CkDS.equalsIgnoreCase(array[1])) {
                        wwe.modules.world.WayPoints.COfQ.remove(xssq2);
                        Command.TuzD("Removed way point " + array[1]);
                        Wrapper.ypJK().VLak();
                        break;
                    else {
                        Command.TuzD(array[1] + " isent a way point?");
                        continue;
                }
                }
            }
            else if (array[0].equalsIgnoreCase("edit")) {
                for (final Xssq cFha : wwe.modules.world.WayPoints.COfQ) {
                    if (cFha.CkDS.equalsIgnoreCase(array[1])) {
                        this.cFha = cFha;
                        hSNE.lyvR(this);
                        break;
                    else {
                        continue;
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
        return "Edits WayPoint's";
    }
    
    @Override
    public String ZlRY() {
        return "WayPoint add/remove/edit/list name";
    }
    
    @oqrr
    public void KnYY(final omqH omqH) {
        Wrapper.mc.displayGuiScreen((GuiScreen)new bSlU(this.cFha));
        hSNE.kduK(this);
    }
}
