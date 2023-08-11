plugins {
    id("mache")
}

mache {
    minecraftVersion.set("1.20.1")
    minecraftJarType.set("client")
}

dependencies {
    codebook("1.0.6")
    remapper(art("1.0.5"))
    decompiler(vineflower("1.9.2"))
    parchment("1.20.1", "2023.07.30")
}

dependencies {
    compileOnly("org.jetbrains:annotations:24.0.1")
}
