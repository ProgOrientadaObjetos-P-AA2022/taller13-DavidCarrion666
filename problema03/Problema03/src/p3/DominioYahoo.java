/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 *
 * @author Usuario iTC
 */
public class DominioYahoo implements Dominio{
    private String dominio;
    
    public void establecerDominio(){
        dominio = "@Yahoo.com";
    }
    
    public String obtenerDominio(){
        return dominio;
    }
}