package wwe;

import java.util.*;

public class MLmK extends HAxG
{
    public MLmK() {
        super("t");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 1) {
                HAxG.TuzD(this.ZlRY());
                return;
            }
            qMIe qmIe = null;
            for (final qMIe qmIe2 : vlwv.hNxW.ijZl) {
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
                HAxG.TuzD(append.append(s2).append(")").toString());
                }
            }
            else {
                HAxG.TuzD("Thats not a module?");
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
