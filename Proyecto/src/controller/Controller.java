package controller;

import abstract_Factory.Army_Unit;
import abstract_Product.Unit;
import concrete_Factory.Factory_Artillery;
import concrete_Factory.Factory_Infantry;
import concrete_Factory.Factory_Tank;

import java.util.ArrayList;

public class Controller {

    /****************************************************************************
     * Function:
     * 			 Procesar Funcion
     * Descripción:
     * 			 Según la opción seleccionada por el usuario, decide si crea una
     * 			fabrica u obtiene los valores de los objetos creados. En caso de
     * 			que la opción no este en el rango valido, envia un mensaje de error.
     * @param
     * 			// int option			// La opcion escogida por el usuario.
     * @return
     * 			 String sMensaje 	// El resultado de la función escogida.
     ****************************************************************************/

    public static String processFunction(int option ) {
        String sMessage ="";
        Army_Unit moUnit;

        switch (option) {

            case 1:
                int diceResult = Helper.throwDice();
                if(diceResult == 1 || diceResult == 2){
                    moUnit  = new Factory_Infantry();
                    sMessage = "El resultado del dado fue: " + diceResult + "\n" +CreateUnitFactory(moUnit);
                } else if (diceResult == 3 || diceResult == 4){
                    moUnit  = new Factory_Artillery();
                    sMessage = "El resultado del dado fue: " + diceResult + "\n" +CreateUnitFactory(moUnit);
                } else {
                    moUnit  = new Factory_Tank();
                    sMessage = "El resultado del dado fue: " + diceResult + "\n" +CreateUnitFactory(moUnit);
                }
                break;

            case 2:
                sMessage = obtener_informacion_tranportes();
                break;

            case 3:
                sMessage = "Se ha cerrado el sistema de manera exitosa";
                break;

            default:
                sMessage = "Opcion invalida";
                break;
        }

        return sMessage ;

    }

    private static ArrayList<Unit> armyArray = new ArrayList<Unit>();

    public static String CreateUnitFactory(Army_Unit pFactory) {
        Unit objUnit = pFactory.createUnit();
        addToArray(objUnit);
        return objUnit.getUnitInformation();
    }

    private static void addToArray(Unit pObjUnit) {
        armyArray.add(pObjUnit);
    }

    public static String obtener_informacion_tranportes() {
        String msData="";

        for (int i=0 ; i < armyArray.size() ; i++)
            msData = msData + armyArray.get(i).getUnitInformation() + "\n";

        return msData;
    }
}
