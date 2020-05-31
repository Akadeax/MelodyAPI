# MelodyAPI - API to interact with Bukkit Melody 
[![](https://jitpack.io/v/Akadeax/MelodyAPI.svg)](https://jitpack.io/#Akadeax/MelodyAPI)

How to include with Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.Akadeax</groupId>
        <artifactId>MelodyAPI</artifactId>
        <version>VERSION (get latest commit hash from jitpack)</version>
    </dependency>
</dependencies>
```
 
# About Melody
See https://github.com/Akadeax/Melody
 
# Building
MelodyAPI comes with all libraries needed to build from master.

# Implementation
Implementing Melody is quite simple. It requires getting the Melody service from the Bukkit service manager.

Example:

```java
...
import me.akadeax.melody.Melody;
...

public final class MelodyTest extends JavaPlugin {

    Melody melody = null;

    @Override
    public void onEnable() {
        if(!setupMelody()) {
            System.out.println("Disabled plugin, no Melody dependency found!");
            getServer().getPluginManager().disablePlugin(this);
        }
        
        // Melody is set up! you can now call functions on the instance ("melody").
    }


    private boolean setupMelody() {
        if(getServer().getPluginManager().getPlugin("Melody") == null) {
            return false;
        }

        RegisteredServiceProvider<Melody> rsp = getServer().getServicesManager().getRegistration(Melody.class);
        if(rsp == null) {
            return false;
        }
        melody = rsp.getProvider();
        return true;
    }

}

```
