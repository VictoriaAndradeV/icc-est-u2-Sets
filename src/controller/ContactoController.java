package controller;

import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorNumero;

public class ContactoController {

    public ContactoController(){
        runTreeContacto();
        runTreeContactoConNumero();
    }

    private void runTreeContacto(){

        Set<Contacto> contactos = new TreeSet<>(new ContactoComparator());
        
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        System.out.println("\nVICTORIA ANDRADE");
        System.out.println("Ordenado por nombre - apellido");

        for(Contacto contacto : contactos){
            System.out.println(contacto);
        }
    }

    private void runTreeContactoConNumero(){

        Set<Contacto> contactos = new TreeSet<>(new ContactoComparatorNumero());

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        System.out.println("\n");

         System.out.println("Ordenado por nombre - apellido - telefono");

        for(Contacto contacto : contactos){
            System.out.println(contacto);
        }
    }
}
