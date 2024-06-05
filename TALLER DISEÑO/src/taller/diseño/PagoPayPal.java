/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.diseño;

/**
 *
 * @author CltControl
 */
public class PagoPayPal extends Pago {
    private boolean loggedIn;
    @Override
    public void realizarCobro(double monto){
        if(!loggedIn){
            return;
        }
    }
}
