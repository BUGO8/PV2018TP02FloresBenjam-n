/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018tp02floresbenjamín;

/**
 *
 * @author Bug0
 */
public class CADENA {
    private String cad;
    String inverso="";
    char ca;
    public CADENA(){
    }
    public void RecibirCad (String C) {
        cad=C;
    }
    public int Contar () {
        int cont,contado =0;
        for (cont=cad.length()-1;cont>=0;cont--) {
            switch(cad.charAt(cont)) {
                case 'a': {
                    contado++;
                    break;
                }
                case 'e': {
                    contado++;
                    break;
                }
                case 'i': {
                    contado++;
                    break;
                }
                case 'o': {
                    contado++;
                    break;
                }
                case 'u': {
                    contado++;
                    break;
                }
            }
        }
        return contado;
    }
    public String getCad() {
        return cad;
    }

    public void setCad(String C) {
        this.cad = C;
    }
    public void RecibirCadena(String c) {
        cad=c;
    }
    public String InvertirC () {
        int cont;
        for(cont=cad.length()-1;cont>=0;cont--){
            inverso=inverso+cad.charAt(cont);
        }
        return inverso;
    }
    public void Recibir(String C, char z) {
        cad=C;
        ca=z;
    }
    public int contarCarac() {
        int cont,i=0;
        for(cont=cad.length()-1;cont>=0;cont--)
            if(ca==cad.charAt(cont))
                i++;
        return i;
    }
}



