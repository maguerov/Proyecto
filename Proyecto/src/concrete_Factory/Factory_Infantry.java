package concrete_Factory;

import abstract_Factory.Army_Unit;
import abstract_Product.Unit;
import concrete_Product.Infantry;

public class Factory_Infantry implements Army_Unit {
    @Override
    public Unit createUnit() {
        Infantry newUnit =  new Infantry();
        newUnit.setUnitCode(newUnit.generateUnitCode());
        newUnit.setUnitAttack(newUnit.generateUnitAttack());
        newUnit.setUnitDefense(newUnit.generateUnitDefense());
        newUnit.setUnitMovement(newUnit.generateUnitMovement());

        return newUnit;
    }
}
