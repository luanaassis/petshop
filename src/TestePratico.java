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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class TestePratico {

    public static boolean verificaFinalDeSemana(Calendar data) {
        if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            return true;
        } else if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            return true;
        } else {
            return false;
        }
    }

    public static void custoBeneficioPetshop(ArrayList<Petshop> petshops){
        Petshop p = petshops.get(0);
        for (Petshop petshop : petshops){
            if(petshop.getPrecoFinal() < p.getPrecoFinal()){
               p = petshop;
            }
            else if (petshop.getPrecoFinal() == p.getPrecoFinal()){
                if (petshop.getDistancia() < p.getDistancia()){
                    p = petshop;
                } 
            }
        }
        System.out.println("Petshop " + p.getNome()+", no valor de R$"+ p.getPrecoFinal());
    }

    public static void main(String[] args) throws ParseException, IOException {
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        Calendar data = Calendar.getInstance();
        SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        Petshop petshop1 = new Petshop("Meu Canino Feliz",2,20,40,24,48);
        Petshop petshop2 = new Petshop("Vai Rex",1.7,15,50,20,55);
        Petshop petshop3 = new Petshop("ChowChawgas",0.8,30,45,30,45);      
        
        ArrayList <Petshop> petshops = new ArrayList();
        petshops.add(petshop1);
        petshops.add(petshop2);
        petshops.add(petshop3);

        System.out.println("Informe os dados : ");
        String[] entrada = teclado.readLine().split(" ");
        data.setTime(simpleFormat.parse(entrada[0]));
        double pequeno = Double.parseDouble(entrada[1]);
        double grande = Double.parseDouble(entrada[2]);
        
        boolean finaldesemana = verificaFinalDeSemana(data);
        
        petshop1.setPrecoFinal(pequeno,grande,finaldesemana);
        petshop2.setPrecoFinal(pequeno,grande,finaldesemana);
        petshop3.setPrecoFinal(pequeno,grande,finaldesemana);
        
        custoBeneficioPetshop(petshops);
    }
}

