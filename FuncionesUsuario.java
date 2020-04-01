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
public class FuncionesUsuario {
    int CalculoDeImpuestos(Usuario u){
       int desc= (int)(u.CantidadDeHijos*0.03);
       int ret=0;
       if(u.Edad<18){ 
           return ret;
       }
       if(18<=u.Edad && u.Edad<30){
           ret=2000-desc;
           return ret<1000? 1000:ret;
       }
       if(30<=u.Edad && u.Edad<65){
           ret=7000-desc;
           return ret<3500? 3500:ret;
       }
       ret=2000-desc;
       return ret<1000? 1000:ret;
    }
    void CobroDeSueldo(int sueldo, Usuario u){
        u.Saldo+=sueldo;
    }

}
