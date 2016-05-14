package com.mursaat.zelda.world;

import com.mursaat.zelda.entities.instances.InstanceEntityHero;
import com.mursaat.zelda.map.Map;

import java.util.Random;

/**
 * @author Mursaat
 * Le monde, contenant des champs statiques map et héros
 */
public class World
{
    // La map à laquelle se trouve le héros
    private static Map currentMap;
    // Le Heros à afficher
    private static InstanceEntityHero hero;
    // Le variable servant à la génération d'évenements Randoms
    public static Random random = new Random();

    public static Map getCurrentMap()
    {
        return currentMap;
    }

    public static void setCurrentMap(Map currentMap)
    {
        World.currentMap = currentMap;
    }

    public static void initHero()
    {
        World.hero = new InstanceEntityHero();
    }

    public static InstanceEntityHero getHero()
    {
        return hero;
    }
}
