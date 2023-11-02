package logic_package;

public class Main_Class {

    public static void main(String args[]) {

        Clase_Padre mensajeroSuma = new Suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Operaciones();
        mensajeroSuma.Mostrar_Resultado();

        Clase_Padre mensajeroResta = new Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Operaciones();
        mensajeroResta.Mostrar_Resultado();

    }
}
