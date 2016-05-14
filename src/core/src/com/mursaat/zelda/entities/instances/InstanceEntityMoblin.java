package com.mursaat.zelda.entities.instances;

import com.mursaat.zelda.entities.Entities;
import com.mursaat.zelda.entities.EntityMoblin;

/**
 * Created by Aurelien on 16/01/2016.
 */
public class InstanceEntityMoblin extends InstanceEntityHostileMonster
{
    public InstanceEntityMoblin(float x, float y, EntityMoblin.MoblinType color)
    {
        super(x,y);
        switch (color)
        {
            case RED:
                entity = Entities.redMoblin;
                break;
            case BLUE:
                entity = Entities.blueMoblin;
                break;
            default:
                entity = Entities.blueMoblin;
                break;
        }
    }
}
