package com.mursaat.zelda;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mursaat.zelda.animations.Animations;
import com.mursaat.zelda.entities.Entities;
import com.mursaat.zelda.items.Items;
import com.mursaat.zelda.save.Save;
import com.mursaat.zelda.screens.GameScreen;
import com.mursaat.zelda.sound.Musics;
import com.mursaat.zelda.sound.Sounds;
import com.mursaat.zelda.structures.Structures;
import com.mursaat.zelda.tiles.Tiles;
import com.mursaat.zelda.world.World;

/**
 * @author Mursaat
 * La classe principale du jeu
 */
public class Zelda extends Game
{
    @Override
    public void create()
    {
        // Phase d'initialisation des assets
        Animations.registerAnimations();
        Entities.registerEntities();
        Tiles.registerTiles();
        Musics.registerMusics();
        Sounds.registerSounds();
        Items.registerItems();
        Structures.registerStructures();

        // Charger la sauvegarde si elle existe
        Save.loadOrCreateSave();

        // Initialisation du jeu
        GameScreen gameScreen = new GameScreen(this);

        // Set first screen
        this.setScreen(gameScreen);

        // Faire du héros (instance) la classe qui gère les inputs
        Gdx.input.setInputProcessor(World.getHero());
    }

    @Override
    public void render()
    {
        super.render();
    }

    @Override
    public void resize(int width, int height)
    {

    }

    @Override
    public void dispose()
    {

    }


}
