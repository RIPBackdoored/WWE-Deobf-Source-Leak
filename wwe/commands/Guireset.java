package wwe.commands;

import wwe.utils.*;
import wwe.*;

public class Guireset extends Command
{
    public Guireset() {
        super("guireset");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        if (array.length < 1) {
            Command.TuzD(this.ZlRY());
            return;
        }
        if (array[0].equalsIgnoreCase("preset") || array[0].equalsIgnoreCase("presets")) {
            final hEGx prNz = Client.pRNz;
            final XdhZ aTlJ = hEGx.aTlJ;
            final hEGx prNz2 = Client.pRNz;
            aTlJ.OsiI = hEGx.aTlJ.KyWB;
            final hEGx prNz3 = Client.pRNz;
            final XdhZ aTlJ2 = hEGx.aTlJ;
            final hEGx prNz4 = Client.pRNz;
            aTlJ2.zzJD = hEGx.aTlJ.PVCD;
            Wrapper.ypJK().VvWw();
            Command.TuzD("Reset the position of the frame presets");
            return;
        }
        if (array[0].equalsIgnoreCase("all")) {
            int i = 0;
            while (i < Client.pRNz.nYFA.size()) {
                final FinI finI = Client.pRNz.nYFA.get(i);
                finI.kVnf = finI.ypmq;
                finI.CQIZ = finI.noHS;
                Wrapper.ypJK().VvWw();
                ++i;
            }
            final hEGx prNz5 = Client.pRNz;
            final XdhZ aTlJ3 = hEGx.aTlJ;
            final hEGx prNz6 = Client.pRNz;
            aTlJ3.OsiI = hEGx.aTlJ.KyWB;
            final hEGx prNz7 = Client.pRNz;
            final XdhZ aTlJ4 = hEGx.aTlJ;
            final hEGx prNz8 = Client.pRNz;
            aTlJ4.zzJD = hEGx.aTlJ.PVCD;
            Wrapper.ypJK().VvWw();
            Command.TuzD("Reset positions of all frames");
            return;
        }
        int j = 0;
        while (j < Client.pRNz.nYFA.size()) {
            final FinI finI2 = Client.pRNz.nYFA.get(j);
            if (finI2.XLez.name().equalsIgnoreCase(array[0])) {
                finI2.kVnf = finI2.ypmq;
                finI2.CQIZ = finI2.noHS;
                Wrapper.ypJK().VvWw();
                Command.TuzD("Reset the position of the frame " + finI2.XLez.name());
                return;
            }
            ++j;
            }
        }
    }
    
    @Override
    public String UiIp() {
        return "Reset a frames position in the gui";
    }
    
    @Override
    public String ZlRY() {
        return "guireset FrameName/All";
    }
}
