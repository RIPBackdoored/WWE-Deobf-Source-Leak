package wwe;

import wwe.utils.*;

public class THBI extends HAxG
{
    public THBI() {
        super("friend");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 2) {
                HAxG.TuzD(this.ZlRY());
                return;
            }
            if (array[0].equalsIgnoreCase("add")) {
                if (vlwv.Zqnd().UsVJ(array[1])) {
                    HAxG.TuzD(array[1] + " is already your friend");
                }
                else {
                    vlwv.Zqnd().kDXm(array[1], array[1]);
                    HAxG.TuzD(array[1] + " has been added to the friends list");
                    Wrapper.ypJK().pRVY();
                }
            }
            else if (this.wJNH(array[0])) {
                if (!vlwv.Zqnd().UsVJ(array[1])) {
                    HAxG.TuzD(array[1] + " isent your friend");
                }
                else {
                    vlwv.Zqnd().bSEt(array[1]);
                    HAxG.TuzD("Removed " + array[1] + " from the friends list");
                    Wrapper.ypJK().pRVY();
                }
            }
            else {
                HAxG.TuzD(this.ZlRY());
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
