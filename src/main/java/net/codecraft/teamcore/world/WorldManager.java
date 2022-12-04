package net.codecraft.teamcore.world;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Identifier;
import xyz.nucleoid.fantasy.Fantasy;

import java.util.ArrayList;

public class WorldManager {
    public void loadPersistentWorlds(MinecraftServer server) {
        Fantasy fantasy = Fantasy.get(server);
        // TODO: load json file containing world identifiers and configs
        getWorldsFromJson().forEach(worldData -> {
            fantasy.getOrOpenPersistentWorld(worldData.identifier, worldData.config);
        });
    }
    public ArrayList<WorldData> getWorldsFromJson() {
        return new ArrayList<WorldData>();
    }
    public void createPersistentWorld(MinecraftServer server, WorldData worldData) {
        Fantasy fantasy = Fantasy.get(server);
        fantasy.getOrOpenPersistentWorld(worldData.identifier, worldData.config);
        //TODO: add world to json file
    }
}


