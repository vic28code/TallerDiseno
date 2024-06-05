/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.diseño;

import java.util.List;

/**
 *
 * @author CltControl
 */
public class Compra {
    private Pago pago;
    private PagoPayPal pagoPaypal;
    private List articulos;
    
    //EN ESTA PARTE DE AQUÍ, DE ACORDE CON EL PRINCIPIO DE INVERSION DE DEPENDENCIAS NO PODÍA EXISTIR UN
    //METODO COMPRA QUE LLAME AL METODO DE UNA CLASE DERIVADA ASÍ QUE EXCLUIMOS EL INDIVIDUAL Y DEJAMOS EL
    //GENERAL
    public Compra(Pago pago){
        
    }
    
    public void agregarArticulo(Articulo articulo){
        
    }
    public void removerArticulo(Articulo articulo){
        
    }
}
