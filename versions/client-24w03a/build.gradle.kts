import io.papermc.mache.util.MinecraftSide

plugins {
    id("mache")
}

mache {
    minecraftVersion = "24w03a"
    minecraftJarType = MinecraftSide.CLIENT
    repositories.register("sonatype snapshots") {
        url.set("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        includeGroups.set(listOf("org.vineflower"))
    }
}

dependencies {
    codebook("1.0.7")
    remapper(art("1.0.7"))
    decompiler(vineflower("1.10.0-SNAPSHOT"))
    parchment("1.20.3", "2023.12.31")
}

dependencies {
    compileOnly("org.jetbrains:annotations:24.0.1")
}
