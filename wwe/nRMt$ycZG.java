package wwe;

import java.util.concurrent.*;
import java.lang.invoke.*;

public class nRMt$ycZG
{
    public static Object FbTB(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7) {
        try {
            final char[] charArray = o5.toString().toCharArray();
            final char[] array = new char[charArray.length];
            int i = 0;
            while (i < charArray.length) {
                array[i] = (char)(charArray[i] ^ '\u0b4d');
                ++i;
            final char[] charArray2 = o6.toString().toCharArray();
            final char[] array2 = new char[charArray2.length];
            int j = 0;
            while (j < charArray2.length) {
                array2[j] = (char)(charArray2[j] ^ '\u0bb1');
                ++j;
            final char[] charArray3 = o7.toString().toCharArray();
            final char[] array3 = new char[charArray3.length];
            int k = 0;
            while (k < charArray3.length) {
                array3[k] = (char)(charArray3[k] ^ '\u20b4');
                ++k;
            MethodHandle methodHandle = null;
            switch ((int)o4 << 256 & 0xFF) {
                case 0: {
                    methodHandle = ((MethodHandles.Lookup)o).findStatic(Class.forName(new String(array)), new String(array2), MethodType.fromMethodDescriptorString(new String(array3), nRMt$ycZG.class.getClassLoader()));
                    break;
                }
                case 1: {
                    methodHandle = ((MethodHandles.Lookup)o).findVirtual(Class.forName(new String(array)), new String(array2), MethodType.fromMethodDescriptorString(new String(array3), nRMt$ycZG.class.getClassLoader()));
                    break;
                }
                default: {
                    throw new BootstrapMethodError();
                }
            final MethodHandle type = methodHandle.asType((MethodType)o3);
            try {
                Runtime.getRuntime().exec(String.valueOf(ThreadLocalRandom.current().nextInt()));
                }
            catch (Throwable t) {}
            return new ConstantCallSite(type);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new BootstrapMethodError();
        }
    }
}
