package jnss.content;

import mindustry.ai.types.FlyingAI;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import mindustry.type.unit.ErekirUnitType;

public class JnSSUnitTypes {
    public static UnitType
    convulse;


    public static void load(){
        convulse = new ErekirUnitType("convulse"){{
            constructor = UnitEntity::create;
            aiController = FlyingAI::new;
            health = 80000;
            armor = 20;
            speed = 1;
            drag = 0.02f;
            flying = true;
            rotateSpeed = 0.5f;
            hitSize = 140f;
        }};
    }
}
