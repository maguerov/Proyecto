package concrete_Factory;

import abstract_Factory.Army_Unit;
import abstract_Product.Unit;
import concrete_Product.Artillery;

public class Factory_Artillery implements Army_Unit {

    @Override
    public Unit createUnit() {
        Artillery newUnit =  new Artillery();
        newUnit.setUnitCode(newUnit.generateUnitCode());
        newUnit.setUnitAttack(newUnit.generateUnitAttack());
        newUnit.setUnitDefense(newUnit.generateUnitDefense());
        newUnit.setUnitMovement(newUnit.generateUnitMovement());

        return newUnit;
    }
}
