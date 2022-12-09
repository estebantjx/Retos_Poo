package Salud;
import java.util.*;
public class Persona 
{
    Scanner sc= new Scanner(System.in);
   
    int documento;
    String nombre;
    String appelido;
    double peso;
    double estatura;
    int edad;
    String genero;
    double total;

 

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelido() {
        return appelido;
    }

    public void setAppelido(String appelido) {
        this.appelido = appelido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Persona(){}

    public Persona(int documento,String nombre,String appelido,double peso, double estatura,int edad,String sexo)
    {
       
        this.documento= documento;
        this.nombre=nombre;
        this.appelido=appelido;
        this.peso=peso;
        this.estatura=estatura;
        this.edad=edad;
        this.genero=genero;
    }

    public void mostrarDatos()
    {
       
        System.out.println("El documento de la persona es: " + getDocumento());
        System.out.println("El nombre de la persona es: " + getNombre());
        System.out.println("El apellido de la persona es: " + getAppelido());
        System.out.println("El peso de la persona es: " + getPeso());
        System.out.println("La estatura de la de la persona es: " + getEstatura());
        System.out.println("El genero de la persona es: " + getGenero());
        
    }
   
    public void calcularPeso(double total)
    {
        total=peso/(estatura*2);
    
    if(total<20)
    {
    System.out.println("El peso está por debajo de lo ideal ");
    }
    else if((total>=20) && (total<=25))
    {
    System.out.println("Se encuenra en el peso ideal ");
    }
    else if(total>25)
    {
    System.out.println("Tiene sobrepeso ");
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

    public void pedirDatos(String string) {
    }

    public void pedirDatos(double peso2) {
    }

    public void mostrarDatos(int documento2) {
    }
    
}
