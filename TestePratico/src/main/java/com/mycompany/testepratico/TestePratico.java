/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testepratico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestePratico {

    public static void main(String[] args) throws ParseException, IOException {
        double []valores = new double[3];
        Petshop p1 = new Petshop("Meu Canino Feliz",2,20,40,((20/100)*20)+20,((20/100)*40)+40);
        Petshop p2 = new Petshop("Vai Rex",1.7,15,50,20,55);
        Petshop p3 = new Petshop("ChowChawgas",0.8,30,45,30,45);
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        Calendar data = Calendar.getInstance();
        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
        String[] entrada = teclado.readLine().split(" ");
        data.setTime(simpleFormat.parse(entrada[0]));
        double pequeno = Double.parseDouble(entrada[1]);
        double grande = Double.parseDouble(entrada[2]);
        System.out.println(checaFDS(data));
        
        if(checaFDS(data)){
            valores[0] = p1.precoFds(pequeno,grande);
            valores[1] = p2.precoFds(pequeno,grande);
            valores[2] = p3.precoFds(pequeno,grande);
        } else {
            valores[0] = p1.precoSemana(pequeno,grande);
            valores[1] = p2.precoSemana(pequeno,grande);
            valores[2] = p3.precoSemana(pequeno,grande);
        }
        
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }
    }
    
    public static boolean checaFDS(Calendar data){
        if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            return true;
        }
        else if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            return true;
        } else {
            return false;
        }
    }
}

