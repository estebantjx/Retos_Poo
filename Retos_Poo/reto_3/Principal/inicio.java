package Principal;
import java.util.Scanner;
import Salud.Persona;
import Salud.Empleado;

public class inicio 
{
    
    public static void main(String[]args)
    {
      
        Scanner sc= new Scanner(System.in);
        Persona per=  new Persona();
      


       System.out.println("Ingrese el número de documento de la persona: ");
        per.setDocumento(sc.nextInt());
        per.pedirDatos(per.getDocumento());
        System.out.println("Ingrese el nombre de la persona: ");
        per.setNombre(sc.nextLine());
        per.pedirDatos(per.getNombre()); 
        System.out.println("Ingrese el apellido  de la persona: ");
        per.setAppelido(sc.nextLine());
        per.pedirDatos(per.getAppelido()); 
        System.out.println("Ingrese el peso de la persona: ");
        per.setPeso(sc.nextDouble());
        per.pedirDatos(per.getPeso()); 
        System.out.println("Ingrese la estatura de la persona: ");
        per.setEstatura(sc.nextDouble());
        per.pedirDatos(per.getEstatura()); 
        System.out.println("Ingrese el genero de la persona: ");
        per.setGenero(sc.nextLine());
        per.pedirDatos(per.getGenero()); 
        per.mostrarDatos();
         
         
         
         
          
        
        
        
        
        
        
        per.setTotal(0);
         per.calcularPeso(per.getTotal());

         System.out.println("Ingrese el peso de la persona para saber si se encuentra en el peso adecuado: ");
         per.setTotal(sc.nextDouble());
         per.calcularPeso(per.getTotal());    
    
       

    }
    
    
}
