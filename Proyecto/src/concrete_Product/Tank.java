package concrete_Product;

import abstract_Product.Unit;

public class Tank implements Unit {
    private int unitCode;
    private static final String unitType = "Tanque";
    private int unitAttack;
    private int unitDefense;
    private int unitMovement;

    /********************** Seccion para hacer SET del codigo ******************************/

    public void setUnitCode(int code) {
        this.unitCode = 200000 + code;
    }

    public void setUnitAttack(int attack) {
        this.unitAttack = attack;
    }

    public void setUnitDefense(int defense) {
        this.unitDefense = defense;
    }

    public void setUnitMovement(int movement) {
        this.unitMovement = movement;
    }

    /********************** Seccion para hacer GET del codigo ******************************/

    public int getCode() {
        return unitCode;
    }

    public static String getUnitType() {
        return unitType;
    }

    public int getAttack() {
        return unitAttack;
    }

    public int getDefense() {
        return unitDefense;
    }

    public int getMovement() {
        return unitMovement;
    }


    /*Sección para implementer las funcionalidades de la Interfaz*/
    @Override
    public String unitCode() {
        return "El código es: " + getCode();
    }

    @Override
    public int generateUnitCode() {
        return (int) (Math.random() * 9999);
    }

    @Override
    public String unitAttack() {
        return "El ataque es: " + getAttack();
    }

    @Override
    public int generateUnitAttack() {
        return 4;
    }


    @Override
    public String unitDefense() {
        return "La defensa es: " + getDefense();
    }

    @Override
    public int generateUnitDefense() {
        return 6;
    }

    @Override
    public String unitMovement() {
        return "El movimiento es: " + getMovement();
    }

    @Override
    public int generateUnitMovement() {
        return 2;
    }

    @Override
    public String getUnitInformation() {
        return "La únidad de tipo: " + getUnitType() + ", se le asigno el código: " + getCode()+
                ", tiene un valor de ataque de: " + getAttack()+ ", un valor de defensa de: " + getDefense()+
                ", y un movimiento total de: " + getMovement();
    }
}
