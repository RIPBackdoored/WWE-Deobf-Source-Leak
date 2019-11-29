package wwe.commands;

import wwe.*;
import java.util.*;

public class Toggle extends Command
{
    public Toggle() {
        super("toggle");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 1) {
                Command.TuzD(this.ZlRY());
                return;
            }
            qMIe qmIe = null;
            for (final qMIe qmIe2 : Client.hNxW.ijZl) {
                if (qmIe2.czUH().replace(" ", "_").equalsIgnoreCase(array[0])) {
                    qmIe = qmIe2;
                    break;
                }
                else {
                    continue;
                }
            }
            if (qmIe != null) {
                qmIe.GDVp();
                final StringBuilder append = new StringBuilder().append("Toggled ").append(qmIe.czUH()).append(" (");
                String s2;
                if (qmIe.IuiN()) {
                    s2 = "on";
                }
                else {
                    s2 = "off";
                }
                Command.TuzD(append.append(s2).append(")").toString());
                }
            }
            else {
                Command.TuzD("Thats not a module?");
            }
            }
        }
        catch (Exception ex) {
            this.kVjF(ex);
        }
    }
    
    @Override
    public String UiIp() {
        return "Toggles a module";
    }
    
    @Override
    public String ZlRY() {
        return "Toggle name of module";
    }
}
