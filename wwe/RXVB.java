package wwe;

import java.net.*;
import java.io.*;

public class RXVB
{
    public RXVB() {
        super();
    }
    
    public static boolean XSfe() {
        boolean b = false;
        try {
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://www.dropbox.com/s/b93na80slsgxwbw/WWEVersion.txt?raw=1").openStream()));
            if (!"2.7.2".equals(bufferedReader.readLine())) {
                b = true;
            }
            bufferedReader.close();
            }
        }
        catch (Exception ex) {}
        return b;
    }
}
