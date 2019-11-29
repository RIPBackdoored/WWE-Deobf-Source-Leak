package wwe.commands;

import wwe.utils.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public class Clip extends Command
{
    public Clip() {
        super("clip");
    }
    
    @Override
    public void lpzH(final String s, final String[] array) {
        if (array.length < 2) {
            Command.TuzD(this.ZlRY());
            return;
        }
        if (array[0].equalsIgnoreCase("v")) {
            final Double value = Double.parseDouble(array[1]);
            Wrapper.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Wrapper.mc.player.posX, Wrapper.mc.player.posY + value, Wrapper.mc.player.posZ, false));
            Wrapper.mc.player.setPosition(Wrapper.mc.player.posX, Wrapper.mc.player.posY + value, Wrapper.mc.player.posZ);
            Command.TuzD("Clipped " + value + ", blocks vertically");
        }
        else {
            if (!array[0].equalsIgnoreCase("h")) {
                Command.TuzD(this.ZlRY());
                return;
            final Double value2 = Double.parseDouble(array[1]);
            Wrapper.mc.player.getLookVec();
            Wrapper.mc.player.connection.sendPacket((Packet)new CPacketPlayer.Position(Wrapper.mc.player.posX + Math.cos(Math.toRadians(Wrapper.mc.player.rotationYaw + 90.0f)) * value2, Wrapper.mc.player.posY, Wrapper.mc.player.posZ + Math.sin(Math.toRadians(Wrapper.mc.player.rotationYaw + 90.0f)) * value2, false));
            Wrapper.mc.player.setPosition(Wrapper.mc.player.posX + Math.cos(Math.toRadians(Wrapper.mc.player.rotationYaw + 90.0f)) * value2, Wrapper.mc.player.posY, Wrapper.mc.player.posZ + Math.sin(Math.toRadians(Wrapper.mc.player.rotationYaw + 90.0f)) * value2);
            Command.TuzD("Clipped " + value2 + ", blocks horizontally");
        }
    }
    
    @Override
    public String UiIp() {
        return "Teleport blocks";
    }
    
    @Override
    public String ZlRY() {
        return "clip v/h amount";
    }
}
