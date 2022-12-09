package Salud;
import java.util.*;


public class Empleado extends Persona
{
    Scanner sc=new Scanner(System.in);
    String cargo, departamento;
    int horastrabajadas;
    double valorhora,total;
    
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    public double getValorhora() {
        return valorhora;
    }
    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
    public double gettotal() {
        return total;
    }




    public void settotal(double valortotal) {
        this.total = total;
    }



public Empleado(){}
    public Empleado(String tipodoc,int documento,String nombre,String appelido,double peso, double estatura,int edad,String sexo,String cargo, String departamento, int horastrabajadas, double valorhora) {
       
        this.cargo = cargo;
        this.departamento = departamento;
        this.horastrabajadas = horastrabajadas;
        this.valorhora = valorhora;
        this.total=total;
    }



   
    public void pedirDatos()
    {
        System.out.println("Ingrese cargo");
        setCargo(sc.nextLine());
        System.out.println("Ingrese departamento");
        setDepartamento(sc.nextLine());
        System.out.println("Ingrese el valor por hora");
        setValorhora(sc.nextInt()); 
        System.out.println("Ingrese la cantidad de hora");
        setHorastrabajadas(sc.nextInt());
    }

    public void calcularHonorarios(double a, int b)
    {
        total = (a*b) -((a*b)* 0.966)/100 ;
    }
    public void mostrarDatos()
    {
        System.out.println( "\nnNúmero de documento: " +getDocumento()+ 
        "\nNombre: "+getNombre() +
        "\nApellido: "+getAppelido()+
        "\nCargo:"+ getCargo() +
        "\nHoras trabajadas:" + getHorastrabajadas()  +
        "\nValor por hora:"+getValorhora()+
        "\nTotal: " + getTotal());
    }
}
