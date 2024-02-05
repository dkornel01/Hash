/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kollekciók;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Listak {

    static Random rnd=new Random();
    public static void main(String[] args) {
        List<Integer>szamok=new ArrayList<>();
        szamok.add(12);
        szamok.add(2);
        szamok.add(56);
        System.out.println(szamok);
        szamok.remove(0);
        System.out.println(szamok);
        List<Integer>ketjegyuk=new ArrayList<>();
        int i=rnd.nextInt(20,30);
        while (i>=ketjegyuk.size()) {
            ketjegyuk.add(rnd.nextInt(10,100));
        }
        System.out.println(ketjegyuk);
        System.out.println(ketjegyuk.size());
        for (int x=ketjegyuk.size()-1;x>=0;x--){
            if (ketjegyuk.get(x)%2==0){
                ketjegyuk.remove(x);
            }
        }
        System.out.println(ketjegyuk);
        System.out.println(ketjegyuk.size());
    }
    
    
}
