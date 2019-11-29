package wwe.commands;

import wwe.utils.*;
import net.minecraft.util.text.*;
import net.minecraft.util.text.event.*;

public abstract class Command
{
    private String VFHF;
    
    public Command(final String vfhf) {
        super();
        this.VFHF = vfhf;
    }
    
    public abstract void lpzH(final String p0, final String[] p1);
    
    public abstract String UiIp();
    
    public abstract String ZlRY();
    
    public String thqu() {
        return this.VFHF;
    }
    
    public static void TuzD(final Object o) {
        Wrapper.mc.player.sendMessage((ITextComponent)new TextComponentString(TextFormatting.DARK_GRAY + "[" + TextFormatting.DARK_RED + TextFormatting.BOLD + "WWE" + TextFormatting.DARK_GRAY + "]" + TextFormatting.DARK_RED + " " + o.toString().replace(" ", TextFormatting.DARK_RED + " " + TextFormatting.DARK_RED)));
    }
    
    public static void POsd(final Object o) {
        Wrapper.mc.player.sendMessage((ITextComponent)new TextComponentString(TextFormatting.DARK_GRAY + "[" + TextFormatting.DARK_RED + TextFormatting.BOLD + "WWE" + TextFormatting.DARK_GRAY + "]" + TextFormatting.RESET + " " + o.toString().replace(" ", TextFormatting.RESET + " " + TextFormatting.RESET)));
    }
    
    public static void CuSq(final Object o, final String s) {
        Wrapper.mc.player.sendMessage(new TextComponentString(TextFormatting.DARK_GRAY + "[" + TextFormatting.DARK_RED + TextFormatting.BOLD + "WWE" + TextFormatting.DARK_GRAY + "]" + TextFormatting.DARK_RED + " " + o.toString().replace(" ", TextFormatting.DARK_RED + " " + TextFormatting.DARK_RED)).setStyle(new Style().setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, s)).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, (ITextComponent)new TextComponentString(s)))));
    }
    
    public boolean wJNH(final String s) {
        boolean b;
        if (s.equalsIgnoreCase("remove") || s.equalsIgnoreCase("rem") || s.equalsIgnoreCase("delete") || s.equalsIgnoreCase("del")) {
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public void kVjF(final Exception ex) {
        ex.printStackTrace();
        POsd("We have a problem): " + ex.toString());
        int i = 0;
        while (i < ex.getStackTrace().length) {
            POsd(ex.getStackTrace()[i].toString());
            if (i >= 2) {
                break;
            else {
                ++i;
                continue;
        }
    }
}
