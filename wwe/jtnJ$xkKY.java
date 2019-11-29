package wwe;

import java.util.*;

public class jtnJ$xkKY
{
    private static HashMap inSV;
    
    static {
        jtnJ$xkKY.inSV = new HashMap();
    }
    
    public jtnJ$xkKY() {
        super();
    }
    
    private static void lfKG(final String s, final String s2) {
        jtnJ$xkKY.inSV.put(s, s2);
    }
    
    private static String iQqm(final String s) {
        return jtnJ$xkKY.inSV.get(s);
    }
    
    private static boolean koXu(final String s) {
        return jtnJ$xkKY.inSV.containsKey(s);
    }
    
    public static String kXYT(final String s, final int n) {
        final String string = s + n;
        if (koXu(string)) {
            return iQqm(string);
        }
        final char[] charArray = s.toCharArray();
        final StringBuilder sb = new StringBuilder();
        int i = 0;
        }
        while (i < charArray.length) {
            sb.append((char)(charArray[i] ^ n));
            ++i;
        }
        final String string2 = sb.toString();
        lfKG(string, string2);
        return string2;
    }
}
