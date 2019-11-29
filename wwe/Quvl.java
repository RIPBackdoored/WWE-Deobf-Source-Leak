package wwe;

import java.io.*;

public class Quvl extends rfyb
{
    private final String tKXX = "irc.mibbit.net";
    private final int VqZU = 6667;
    private final String jqOi = "#WWEHackedClient";
    private static String WrQX;
    
    public Quvl(String string) {
        super();
        try {
            Integer.parseInt(string.substring(0, 1));
            string = "MC" + string;
        }
        catch (NumberFormatException ex) {}
        Quvl.WrQX = string;
    }
    
    public void XJrX() {
        this.iYjn(true);
        this.JcTH(Quvl.WrQX);
        this.jtNl(Quvl.WrQX);
        try {
            this.qMNW("irc.mibbit.net", 6667);
        }
        catch (woMI woMI) {
            woMI.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (ltaQ ltaQ) {
            ltaQ.printStackTrace();
        }
        this.eExQ("#WWEHackedClient");
    }
}
