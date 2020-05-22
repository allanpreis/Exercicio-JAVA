package java_class.PetShop;

import javax.swing.*;
import java.io.Serializable;

public class PetShop extends Animal implements Serializable {

    private double examinar = 70;
    private double banho;
    private double vacinar;
    private double total;
    private Animal animal;

    public void detalhesAnimal(){
        JOptionPane.showMessageDialog(null,"Nome: "+getNome()+
                "\nPorte: "+getPorte()+
                "\nTipo: "+getTipo()+
                "\nTotal a pagar: R$"+this.total, "Ficha do animal", 1);
    }

    public double totalCliente(){
       setTotal(examinar + vacinar + banho);
       return this.total;
    }


    public void darBanho(){
        if (getPorte().toUpperCase().equals("PEQUENO")){
             setBanho(40);
        } else if (getPorte().toUpperCase().equals("MEDIO")){
            setBanho(50);
        } else if (getPorte().toUpperCase().equals("GRANDE")){
            setBanho(60);
        }
    }

    public void vacinarAnimal(){
        if (getTipo().toUpperCase().equals("CACHORRO") || getTipo().toUpperCase().equals("GATO")){
            setVacinar(100);
        } else {
            setVacinar(150);
        }
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public double getExaminar() {
        darBanho();
        vacinarAnimal();
        totalCliente();
        return examinar;
    }

    public void setExaminar(double examinar) {
        this.examinar = examinar;
    }

    public double getBanho() {
        return banho;
    }

    public void setBanho(double banho) {
        this.banho = banho;
    }

    public double getVacinar() {
        return vacinar;
    }

    public void setVacinar(double vacinar) {
        this.vacinar = vacinar;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
