package io.github.zekerzhayard.offlinetweaker.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.server.ServerStartCallback;
import net.minecraft.server.MinecraftServer;

public class OfflineTweaker implements ClientModInitializer, ServerStartCallback {
    @Override
    public void onInitializeClient() {
        ServerStartCallback.EVENT.register(this);
    }

    @Override
    public void onStartServer(MinecraftServer server) {
        server.method_3864(false);
    }
}
