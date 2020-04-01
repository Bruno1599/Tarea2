/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

/**
 *
 * @author elseg
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    String Nombre;
    int Cedula;
    String Contrasenia;
    int Edad;
    int CantidadDeHijos;
    int Saldo = 0;
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public Usuario(String Nombre, int Cedula, String Contrasenia, int Edad, int CantidadDeHijos) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Contrasenia = Contrasenia;
        this.Edad = Edad;
        this.CantidadDeHijos = CantidadDeHijos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getCantidadDeHijos() {
        return CantidadDeHijos;
    }

    public void setCantidadDeHijos(int CantidadDeHijos) {
        this.CantidadDeHijos = CantidadDeHijos;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
    
}

    

