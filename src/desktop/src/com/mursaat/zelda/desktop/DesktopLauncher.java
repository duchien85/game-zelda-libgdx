package com.mursaat.zelda.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mursaat.zelda.Zelda;

public class DesktopLauncher 
{
	public static void main (String[] arg)
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Zelda";
        config.width = 864;
        config.height = 480;
        new LwjglApplication(new Zelda(), config);
	}
}
