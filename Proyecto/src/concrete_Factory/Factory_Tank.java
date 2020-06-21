package concrete_Factory;

import abstract_Factory.Army_Unit;
import abstract_Product.Unit;
import concrete_Product.Tank;

public class Factory_Tank implements Army_Unit {

    @Override
    public Unit createUnit() {
        Tank newUnit =  new Tank();
        newUnit.setUnitCode(newUnit.generateUnitCode());
        newUnit.setUnitAttack(newUnit.generateUnitAttack());
        newUnit.setUnitDefense(newUnit.generateUnitDefense());
        newUnit.setUnitMovement(newUnit.generateUnitMovement());

        return newUnit;
    }
}
