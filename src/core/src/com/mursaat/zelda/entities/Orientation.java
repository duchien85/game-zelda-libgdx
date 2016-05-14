package com.mursaat.zelda.entities;

import java.util.Random;

/**
 * @author Mursaat
 * Les direction possibles dans le jeu
 * Par exemple une entité peut se déplacer à droite, en bas, à gauche et en haut
 */
public enum Orientation
{
    TOP,
    RIGHT,
    BOTTOM,
    LEFT;

    private static Random random = new Random();
    public static Orientation randomOrientation()
    {
        int id = random.nextInt(Orientation.class.getEnumConstants().length);
        return Orientation.class.getEnumConstants()[id];
    }
}
