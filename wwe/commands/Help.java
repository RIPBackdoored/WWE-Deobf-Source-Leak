package wwe.commands;

import net.minecraft.util.text.*;
import java.util.*;
import wwe.*;

public class Help extends Command
{
    public Help() {
        super("help");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        for (final Command command : DhFe.ACXD) {
            if (command != this) {
                Command.CuSq(command.thqu() + " " + TextFormatting.DARK_GRAY + "-" + TextFormatting.DARK_RED + " " + command.UiIp(), "https://wweclient.com/documentation/commands/" + command.thqu() + ".php");
            }
            }
        }
    }
    
    @Override
    public String UiIp() {
        return "Lists all commands";
    }
    
    @Override
    public String ZlRY() {
        return "help";
    }
}
