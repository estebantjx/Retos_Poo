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
float total;

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
   System.out.println("El tipo de su documento es: " + tipoDoc 
   + "\nEl número de su documento es: " + Documento 
   + "\nSu nombre y su apellido es: " + Nombre + apellido 
   + "\nSu peso es: "+ peso +
    "\nSu estatura es: "+ estatura +
    "\nSu edad es: " + edad + 
    "\nSu género es: " +genero ); 
}

public void calcular() 
{
    total=peso/(estatura*2);
    
    if(total<20)
    {
    System.out.println("Está por debajo del peso ideal");
    }
    else if((total>=20) && (total<=25))
    {
    System.out.println("Se encuentra en el peso ideal ");
    }
    else if(total>25)
    {
    System.out.println("Tien sobrepeso ");
    }
    
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
