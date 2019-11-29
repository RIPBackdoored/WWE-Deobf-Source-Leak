package wwe.commands;

import wwe.*;
import wwe.utils.*;

public class Prefix extends Command
{
    public Prefix() {
        super("prefix");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        if (array.length < 1) {
            Command.TuzD(this.ZlRY());
            return;
        }
        if (array[0].length() > 1) {
            Command.TuzD("The prefix cant be more then one character");
            return;
        }
        DhFe.itOx = array[0];
        Wrapper.ypJK().OsgT();
        Command.TuzD("Set prefix to, " + array[0]);
    }
    
    @Override
    public String UiIp() {
        return "Changes the prefix for commands, default .";
    }
    
    @Override
    public String ZlRY() {
        return "prefix key";
    }
}
