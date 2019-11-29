package wwe;

import wwe.commands.*;
import java.util.*;

public class DhFe
{
    public static ArrayList<HAxG> ACXD;
    public static String itOx;
    
    public DhFe() {
        super();
        DhFe.ACXD.clear();
        DhFe.ACXD.add((HAxG)new Help());
        DhFe.ACXD.add((HAxG)new Toggle());
        DhFe.ACXD.add((HAxG)new Bind());
        DhFe.ACXD.add((HAxG)new Friend());
        DhFe.ACXD.add((HAxG)new Peek());
        DhFe.ACXD.add((HAxG)new Xray());
        DhFe.ACXD.add((HAxG)new LogOutSpot());
        DhFe.ACXD.add((HAxG)new InventoryCleaner());
        DhFe.ACXD.add((HAxG)new T());
        DhFe.ACXD.add((HAxG)new WayPoints());
        DhFe.ACXD.add((HAxG)new Value());
        DhFe.ACXD.add((HAxG)new Mobowner());
        DhFe.ACXD.add((HAxG)new Customfont());
        DhFe.ACXD.add((HAxG)new Search());
        DhFe.ACXD.add((HAxG)new F3Spoof());
        if (!Boolean.parseBoolean(System.getProperty("disablebaritone"))) {
            DhFe.ACXD.add((HAxG)new B());
        }
        DhFe.ACXD.add((HAxG)new Pathfinder());
        DhFe.ACXD.add((HAxG)new Randombook());
        DhFe.ACXD.add((HAxG)new Nuker());
        DhFe.ACXD.add((HAxG)new Prefix());
        DhFe.ACXD.add((HAxG)new Guireset());
        DhFe.ACXD.add((HAxG)new Notebot());
        DhFe.ACXD.add((HAxG)new Clip());
        DhFe.ACXD.add((HAxG)new Dupe());
        DhFe.ACXD.add((HAxG)new Vanish());
    }
    
    public void RRWX(final String s) {
        if (!s.contains(DhFe.itOx) || !s.startsWith(DhFe.itOx)) {
            return;
        }
        final String trim = s.trim().substring(DhFe.itOx.length()).trim();
        final boolean contains = trim.trim().contains(" ");
        String trim2;
        if (contains) {
            trim2 = trim.split(" ")[0];
        }
        else {
            trim2 = trim.trim();
        }
        final String s2 = trim2;
        String[] array;
        if (contains) {
            array = trim.substring(s2.length()).trim().split(" ");
        }
        else {
            array = new String[0];
        }
        final String[] array2 = array;
        for (final Command command : DhFe.ACXD) {
            if (command.thqu().trim().equalsIgnoreCase(s2.trim())) {
                command.lpzH(trim, array2);
                break;
            else {
                continue;
        }
        Command.TuzD("Invalid command. Try .help for a list of commands.");
    }
    
    static {
        DhFe.ACXD = new ArrayList<HAxG>();
        DhFe.itOx = ".";
    }
}
