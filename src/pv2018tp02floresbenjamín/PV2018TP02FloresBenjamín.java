/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018tp02floresbenjamín;
import java.util.Scanner;
public class PV2018TP02FloresBenjamín {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso=new Scanner (System.in);
        CADENA nuevaCADENA= new CADENA();
        String C;
        System.out.println("Ingrese la cadena; ");
        C= ingreso.nextLine();
        nuevaCADENA.RecibirCad(C);
        System.out.println("La cantidad de vocales es; "+nuevaCADENA.Contar());
        String c;
        c=ingreso.nextLine();
        System.out.println(nuevaCADENA.InvertirC());
        char z;
        System.out.println("Ingrese caracter: ");
        z=ingreso.nextLine().charAt(0);
        nuevaCADENA.Recibir(C, z);
        System.out.println("La letra "+z+" se repite: "+nuevaCADENA.contarCarac() );
    }

}
 