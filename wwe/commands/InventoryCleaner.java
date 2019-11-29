package wwe.commands;

import net.minecraft.item.*;
import wwe.utils.*;

public class InventoryCleaner extends Command
{
    public InventoryCleaner() {
        super("InventoryCleaner");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        try {
            if (array.length < 2) {
                Command.TuzD(this.ZlRY());
                return;
            }
            if (array[0].equalsIgnoreCase("add")) {
                final String s2 = array[1];
                if (!wwe.modules.player.InventoryCleaner.KtLJ.contains(Item.getByNameOrId(s2))) {
                    if (Item.getByNameOrId(s2) != null) {
                        wwe.modules.player.InventoryCleaner.KtLJ.add(Item.getByNameOrId(s2));
                        Command.TuzD("Added " + s2 + " to inventory cleaner");
                        Wrapper.ypJK().iroC();
                    }
                    else {
                        Command.TuzD("Is that a item?");
                    }
                }
                else {
                    Command.TuzD("Thats already in the list");
                }
                }
            }
            else if (this.wJNH(array[0])) {
                final String s3 = array[1];
                if (wwe.modules.player.InventoryCleaner.KtLJ.contains(Item.getByNameOrId(s3))) {
                    wwe.modules.player.InventoryCleaner.KtLJ.remove(Item.getByNameOrId(s3));
                    Command.TuzD("Removed " + s3 + " from inventory cleaner");
                    Wrapper.ypJK().iroC();
                    }
                }
                else {
                    Command.TuzD("That wasent add to inventory cleaner?");
                }
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
        return "add/removes items from inventory cleaner";
    }
    
    @Override
    public String ZlRY() {
        return "inventorycleaner add/remove name of item";
    }
}
