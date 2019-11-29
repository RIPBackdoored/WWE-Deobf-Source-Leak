package wwe.commands;

import wwe.*;
import java.util.*;

public class Value extends Command
{
    public Value() {
        super("value");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 3) {
                Command.TuzD(this.ZlRY());
                return;
            }
            qMIe qmIe = null;
            for (final qMIe qmIe2 : Client.hNxW.xRen()) {
                if (qmIe2.czUH().replace(" ", "_").equalsIgnoreCase(array[0])) {
                    qmIe = qmIe2;
                }
                }
            }
            if (qmIe == null) {
                Command.TuzD(this.ZlRY());
                return;
            }
            for (final IcRI<Double> icRI : Client.tiEw) {
                if (icRI.MATs()) {
                    if (qmIe.czUH().equalsIgnoreCase(icRI.lJZv.czUH()) && icRI.VQBN.replace(" ", "_").equalsIgnoreCase(array[1])) {
                        icRI.NdCc(Double.parseDouble(array[2]));
                        Command.TuzD("Changed " + qmIe.czUH() + "'s value \"" + icRI.VQBN + "\" to " + Double.parseDouble(array[2]));
                        break;
                    }
                }
                else if (icRI.wnpo()) {
                    if (qmIe.czUH().equalsIgnoreCase(icRI.lJZv.czUH()) && icRI.VQBN.replace(" ", "_").equalsIgnoreCase(array[1])) {
                        icRI.NdCc((Double)(Object)Boolean.valueOf(Boolean.parseBoolean(array[2])));
                        Command.TuzD("Changed " + qmIe.czUH() + "'s value \"" + icRI.VQBN + "\" to " + Boolean.parseBoolean(array[2]));
                        break;
                    }
                }
                else if (icRI.dTln() && qmIe.czUH().equalsIgnoreCase(icRI.lJZv.czUH()) && icRI.VQBN.replace(" ", "_").equalsIgnoreCase(array[1])) {
                    icRI.NdCc((Double)s.substring(7 + qmIe.czUH().length() + 1 + icRI.VQBN.replace(" ", "_").length()));
                    Command.TuzD("Changed " + qmIe.czUH() + "'s value \"" + icRI.VQBN + "\" to " + s.substring(7 + qmIe.czUH().length() + 1 + icRI.VQBN.replace(" ", "_").length()));
                    }
                    break;
                }
                }
            }
            Command.TuzD(this.ZlRY());
            Command.TuzD("");
            Command.TuzD(this.WKzX());
            }
        }
        catch (Exception ex) {
            this.kVjF(ex);
        }
    }
    
    @Override
    public String UiIp() {
        return "Sets a value of one of the settings";
    }
    
    @Override
    public String ZlRY() {
        return "value module_name name_of_setting_with_no_spaces some_value";
    }
    
    public String WKzX() {
        return "Try replacing the setting's or module's spaces in the name with a _";
    }
}
