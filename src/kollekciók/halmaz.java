/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kollekciók;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class halmaz {
    static Random rnd=new Random();
    public static void main(String[] args) {
        Set<String>nevek= new HashSet<>();
        nevek.add("Péter");
        nevek.add("Pál");
        nevek.add("Petra");
        nevek.add("Péter");
        for (String nev: nevek){
            System.out.println(nev);
        }
        Set<Integer>szamok= new TreeSet<>();
        while (szamok.size()<5){
            int i=rnd.nextInt(1,91);
            szamok.add(i);
        }
        for (Integer szam: szamok){
            System.out.println(szam);
        }
        
    }
}
