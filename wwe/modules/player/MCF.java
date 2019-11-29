package wwe.modules.player;

import wwe.modules.*;
import wwe.utils.*;
import net.minecraft.entity.player.*;
import wwe.*;
import net.minecraft.util.text.*;
import wwe.commands.*;

public class MCF extends qMIe
{
    public MCF() {
        super("MCF", "Middle Click Friends", 0, Category.PLAYER);
    }
    
    @Override
    public void OgHM() {
        if (!this.IuiN()) {
            return;
        }
        if (Wrapper.mc.objectMouseOver != null && Wrapper.mc.objectMouseOver.entityHit instanceof EntityPlayer) {
            final String name = Wrapper.mc.objectMouseOver.entityHit.getName();
            if (!Client.Zqnd().UsVJ(name)) {
                Client.Zqnd().kDXm(name, name);
                Command.TuzD("Added " + TextFormatting.DARK_RED + name + TextFormatting.DARK_RED + " to friend" + TextFormatting.DARK_RED + "s list");
                Wrapper.ypJK().pRVY();
            }
            else {
                Client.Zqnd().bSEt(name);
                Command.TuzD("Removed " + TextFormatting.DARK_RED + name + TextFormatting.DARK_RED + " from friend" + TextFormatting.DARK_RED + "s list");
                Wrapper.ypJK().pRVY();
            }
        }
    }
}
