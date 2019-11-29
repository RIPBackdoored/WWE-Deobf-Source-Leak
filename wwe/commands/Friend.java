package wwe.commands;

import wwe.*;
import wwe.utils.*;

public class Friend extends Command
{
    public Friend() {
        super("friend");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 2) {
                Command.TuzD(this.ZlRY());
                return;
            }
            if (array[0].equalsIgnoreCase("add")) {
                if (Client.Zqnd().UsVJ(array[1])) {
                    Command.TuzD(array[1] + " is already your friend");
                }
                else {
                    Client.Zqnd().kDXm(array[1], array[1]);
                    Command.TuzD(array[1] + " has been added to the friends list");
                    Wrapper.ypJK().pRVY();
                }
            }
            else if (this.wJNH(array[0])) {
                if (!Client.Zqnd().UsVJ(array[1])) {
                    Command.TuzD(array[1] + " isent your friend");
                }
                else {
                    Client.Zqnd().bSEt(array[1]);
                    Command.TuzD("Removed " + array[1] + " from the friends list");
                    Wrapper.ypJK().pRVY();
                }
            }
            else {
                Command.TuzD(this.ZlRY());
            }
            }
        }
        catch (Exception ex) {
            this.kVjF(ex);
        }
    }
    
    @Override
    public String UiIp() {
        return "Adds a friend";
    }
    
    @Override
    public String ZlRY() {
        return "friend add/remove name";
    }
}
