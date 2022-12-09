package Principal;

import Salud.persona;

public class Inicio 
{
    public static void main(String[] args) 
    {
        persona pers = new persona();

        pers.pedirDatos();
        pers.imprimirDatos();
        pers.calcular();
        pers.mayorEdad();

    }
    
}
