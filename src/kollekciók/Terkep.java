/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kollekciók;

import java.util.HashMap;
import java.util.Map;


public class Terkep {
    public static void main(String[] args) {
        Map<String, Double> eredmeny=new HashMap<>();
        eredmeny.put("matek",4.53 );
        eredmeny.put("SQL",5.00);
        eredmeny.put("Prog",5.05);
        System.out.println(eredmeny);
        System.out.println("A programozás eredménye" +eredmeny.get("Prog"));
        for (Map.Entry<String, Double> entry : eredmeny.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.printf("[%7s]=%.2f\n",key,val);

        }
    }
}
