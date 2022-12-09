package Salud;
import java.util.*;

public class persona
{
    Scanner sc = new Scanner(System.in);
String tipoDoc;
int Documento;
String Nombre;
String apellido;
float peso;
float estatura;
int edad;
String genero;
double total;

public void pedirDatos()
 {
    System.out.println("Ingrese el tipo de su documento: ");
    tipoDoc=sc.nextLine();
    System.out.println("Ingrese el número de su documento: ");
    Documento=sc.nextInt();
    System.out.println("Ingrese su Nombre: ");
    Nombre=sc.next();
    System.out.println("Ingrese su apellido: ");
    apellido=sc.next();
    System.out.println("Ingrese su peso: ");
    peso=sc.nextFloat();
    System.out.println("Ingrese su estatura");
    estatura=sc.nextFloat();
    System.out.println("Ingrese su edad: ");
    edad=sc.nextInt();
    System.out.println("Ingrese su genero: ");
    genero=sc.nextLine();
}

public void imprimirDatos() 
{
   System.out.println("El tipo de su documento es: " + tipoDoc + 
   "\nEl número de su documento es: " + Documento + 
   "\nSu nombre y su apellido es:" + Nombre + apellido + 
   "\nSu peso es: "+ peso +
    "\nSu estatura es: "+ estatura +
    "\nSu edad es" + edad + 
    "\nSu género es:" +genero ); 
}

public double calcularImc () 
{
    total=peso/(estatura*2);
    
  
    return total;
}
public void mayorEdad()
 {
    if(edad < 18)
    {
    System.out.println("Es menor de edad");
    } 
    else
    {
        System.out.println("Es mayor de edad");
    }
}
}
