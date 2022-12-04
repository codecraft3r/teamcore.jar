package net.codecraft.teamcore.world;

import net.minecraft.util.Identifier;
import xyz.nucleoid.fantasy.RuntimeWorldConfig;

public class WorldData {
    public Identifier identifier;
    public String name;
    public RuntimeWorldConfig config;
    public WorldData(Identifier identifier, String name, RuntimeWorldConfig config) {
        this.identifier = identifier;
        this.name = name;
        this.config = config;
    }
    public void toJson() {
        //TODO: make work
    }
    public WorldData fromJson() {
        //TODO: make work
        return new WorldData(new Identifier("teamcore", "test"), "Test", new RuntimeWorldConfig());
    }
}
