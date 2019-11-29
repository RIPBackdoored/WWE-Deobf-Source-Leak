package wwe.commands;

import wwe.*;

public class WhosOn extends Command
{
    public WhosOn() {
        super("WhosOn");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        class vFmD extends Thread
        {
            final WhosOn PmVv;
            
            vFmD(final WhosOn pmVv) {
                this.PmVv = pmVv;
                super();
            }
            
            @Override
            public void run() {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: return         
                //     4: ldc             "Checking whos online..."
                //     6: invokestatic    wwe/commands/Command.TuzD:(Ljava/lang/Object;)V
                //     9: invokestatic    wwe/Client.wNWV:()V
                //    12: getstatic       wwe/Client.wMQO:Lwwe/sbfc;
                //    15: ifnull          24
                //    18: getstatic       wwe/Client.wMQO:Lwwe/sbfc;
                //    21: invokevirtual   wwe/sbfc.BBwj:()V
                //    24: getstatic       wwe/Client.uPqc:Ljava/util/ArrayList;
                //    27: invokevirtual   java/util/ArrayList.isEmpty:()Z
                //    30: ifeq            43
                //    33: ldc             "No one):"
                //    35: invokestatic    wwe/commands/Command.TuzD:(Ljava/lang/Object;)V
                //    38: return         
                //    39: nop            
                //    40: nop            
                //    41: nop            
                //    42: athrow         
                //    43: ldc             "Theses people are on/have been on within the last 15 minutes"
                //    45: invokestatic    wwe/commands/Command.TuzD:(Ljava/lang/Object;)V
                //    48: getstatic       wwe/Client.uPqc:Ljava/util/ArrayList;
                //    51: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
                //    54: astore_1       
                //    55: aload_1        
                //    56: invokevirtual   java/util/Iterator.hasNext:()Z
                //    59: ifeq            86
                //    62: aload_1        
                //    63: invokevirtual   java/util/Iterator.next:()Ljava/lang/Object;
                //    66: checkcast       Ljava/lang/String;
                //    69: astore_2       
                //    70: aload_2        
                //    71: invokestatic    wwe/commands/Command.TuzD:(Ljava/lang/Object;)V
                //    74: getstatic       wwe/vFmD.\u2006\u200c\u2003\u2008\u200d\u2008\u2004\u2001:Z
                //    77: ifeq            55
                //    80: aconst_null    
                //    81: athrow         
                //    82: nop            
                //    83: nop            
                //    84: nop            
                //    85: athrow         
                //    86: getstatic       wwe/vFmD.\u2006\u200c\u2003\u2008\u200d\u2008\u2004\u2001:Z
                //    89: ifeq            99
                //    92: aconst_null    
                //    93: athrow         
                //    94: astore_1       
                //    95: aload_1        
                //    96: invokevirtual   java/lang/Exception.printStackTrace:()V
                //    99: return         
                //   100: nop            
                //   101: nop            
                //   102: nop            
                //   103: athrow         
                //    StackMapTable: 00 0B FE 00 03 00 00 01 00 13 FF 00 0E 00 00 00 01 07 00 0F FF 00 03 00 04 07 00 02 00 00 01 00 00 FF 00 0B 00 04 07 00 02 07 00 43 00 01 00 00 FF 00 1A 00 00 00 01 07 00 0F FF 00 03 00 04 07 00 02 07 00 43 00 01 00 00 FF 00 07 00 04 07 00 02 00 00 01 00 01 07 00 19 FF 00 04 00 04 07 00 02 07 00 55 00 01 00 00 FF 00 00 00 00 00 01 07 00 0F
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                 
                //  -----  -----  -----  -----  ---------------------
                //  4      38     94     99     Ljava/lang/Exception;
                //  43     82     94     99     Ljava/lang/Exception;
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: return         
        //     4: aload_2        
        //     5: arraylength    
        //     6: ldc             1
        //     8: if_icmplt       23
        //    11: aload_0        
        //    12: invokevirtual   wwe/commands/WhosOn.ZlRY:()Ljava/lang/String;
        //    15: invokestatic    wwe/commands/Command.TuzD:(Ljava/lang/Object;)V
        //    18: return         
        //    19: nop            
        //    20: nop            
        //    21: nop            
        //    22: athrow         
        //    23: new             Lwwe/vFmD;
        //    26: dup            
        //    27: aload_0        
        //    28: invokespecial   wwe/vFmD.<init>:(Lwwe/commands/WhosOn;)V
        //    31: invokevirtual   wwe/vFmD.start:()V
        //    34: return         
        //    35: nop            
        //    36: nop            
        //    37: nop            
        //    38: athrow         
        //    StackMapTable: 00 05 FF 00 03 00 04 07 00 13 07 00 15 07 00 17 01 00 00 00 FF 00 0E 00 00 00 01 07 00 0B FF 00 03 00 04 07 00 13 07 00 15 07 00 17 01 00 00 FF 00 0B 00 00 00 01 07 00 0B
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public String UiIp() {
        return "Shows current WWE users";
    }
    
    @Override
    public String ZlRY() {
        return "whoson";
    }
}
