package me.THEREALWWEFAN231.wwefan.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.world.chunk.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import wwe.modules.render.*;
import wwe.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(value = { Chunk.class }, priority = 9999)
public class MixinChunk
{
    public MixinChunk() {
        super();
    }
    
    @Inject(method = { "relightBlock" }, at = { @At("HEAD") }, cancellable = true)
    private void relightBlock(final int n, final int n2, final int n3, final CallbackInfo callbackInfo) {
        if (Client.hNxW.qHPF((Class<NoRender>)myLi.class).IuiN() && Client.hNxW.qHPF((Class<NoRender>)myLi.class).lightLag.OnGi()) {
            callbackInfo.cancel();
        }
    }
}
