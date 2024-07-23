package jnss;

import jnss.content.JnSSUnitTypes;
import mindustry.mod.*;

public class JnSSMod extends Mod{

    public JnSSMod(){}

    @Override
    public void loadContent(){
        JnSSUnitTypes.load();
    }
}
