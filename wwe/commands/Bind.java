package wwe.commands;

import wwe.*;
import org.lwjgl.input.*;
import wwe.utils.*;
import java.util.*;

public class Bind extends Command
{
    public Bind() {
        super("bind");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 2) {
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
                qmIe.hzzk(Keyboard.getKeyIndex(array[1].toUpperCase()));
                Command.TuzD(qmIe.czUH() + " bound to: " + Keyboard.getKeyName(qmIe.APjp()));
                Wrapper.ypJK().hUMI();
                }
            }
            else {
                Command.TuzD("Thats not a module?");
            }
            }
        }
        catch (Exception ex) {
            Command.TuzD("Maybe try binding in the gui");
            this.kVjF(ex);
        }
    }
    
    @Override
    public String UiIp() {
        return "Binds a Module to a  set key";
    }
    
    @Override
    public String ZlRY() {
        return "bind Module key";
    }
}
