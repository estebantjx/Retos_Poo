package Principal;

import Salud.persona;

public class Inicio 
{
    public static void main(String[] args) 
    {
      
        persona pers = new persona();

        pers.pedirDatos();
        pers.imprimirDatos();
        pers.mayorEdad();
        double resultado = pers.calcularImc();
        if(resultado < 20)
        {
        System.out.println("Su  peso está por debajo de lo ideal");
        }
        else if(resultado >= 20 && resultado <=25 )
        {
        System.out.println("Su  peso está ideal");
        }
            else if(resultado >25 ){System.out.println("Tiene sobrepeso");

        }  
}
    
}
