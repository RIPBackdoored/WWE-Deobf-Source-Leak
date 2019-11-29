package wwe.commands;

import net.minecraft.client.gui.*;
import wwe.utils.*;
import wwe.*;

public class LogOutSpot extends Command
{
    public GuiScreen cCpj;
    
    public LogOutSpot() {
        super("LogOutSpot");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 1) {
                Command.TuzD(this.ZlRY());
                return;
            }
            if (this.wJNH(array[0])) {
                if (array.length < 2) {
                    Command.TuzD(this.ZlRY());
                    return;
                }
                int i = 0;
                while (i < wwe.modules.combat.LogOutSpot.zEsy.size()) {
                    if (wwe.modules.combat.LogOutSpot.zEsy.get(i).AAtC.replace(" ", "_").equalsIgnoreCase(array[1])) {
                        wwe.modules.combat.LogOutSpot.zEsy.remove(i);
                        Command.TuzD("Removed " + array[1] + "'s log out spot");
                        break;
                    }
                    else {
                        ++i;
                        continue;
                    }
                }
                Command.TuzD("Did not find a log out spot with the name, " + array[1]);
                }
            }
            else if (array[0].equalsIgnoreCase("clear")) {
                wwe.modules.combat.LogOutSpot.zEsy.clear();
                Command.TuzD("Cleared all log out spots");
                Wrapper.ypJK().stpV();
                }
            }
            else if (array[0].equalsIgnoreCase("open")) {
                if (array.length < 2) {
                    Command.TuzD(this.ZlRY());
                    return;
                }
                int j = 0;
                while (j < wwe.modules.combat.LogOutSpot.zEsy.size()) {
                    if (wwe.modules.combat.LogOutSpot.zEsy.get(j).AAtC.replace(" ", "_").equalsIgnoreCase(array[1])) {
                        this.cCpj = new sSoG(wwe.modules.combat.LogOutSpot.zEsy.get(j));
                        hSNE.lyvR(this);
                        break;
                    }
                    else {
                        ++j;
                        continue;
                    }
                }
                Command.TuzD(array[1] + " isent a log out spot");
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
        return "Manage log out spot's";
    }
    
    @Override
    public String ZlRY() {
        return "LogOutSpot remove/clear/open";
    }
    
    @oqrr
    public void KnYY(final omqH omqH) {
        if (this.cCpj != null) {
            Wrapper.mc.displayGuiScreen(this.cCpj);
        }
        hSNE.kduK(this);
    }
}
