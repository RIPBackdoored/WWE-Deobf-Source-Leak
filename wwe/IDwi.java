package wwe;

import java.util.*;
import java.net.*;
import java.io.*;
import net.minecraftforge.fml.common.*;

public class IDwi
{
    public static ArrayList<String> dJfQ;
    
    public IDwi() {
        super();
    }
    
    public static void SPcL() {
        try {
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://www.dropbox.com/s/zmz9y3t9ckhj72v/BannedUsers.txt?raw=1").openStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                IDwi.dJfQ.add(line);
            }
            bufferedReader.close();
            }
        }
        catch (Exception ex) {}
    }
    
    public static boolean JzGa(final String s) {
        return IDwi.dJfQ.contains(s);
    }
    
    public static void lZga(final String s) {
        if (IDwi.dJfQ.contains(s)) {
            FMLCommonHandler.instance().exitJava(1, true);
        }
    }
    
    static {
        IDwi.dJfQ = new ArrayList<String>();
    }
}
