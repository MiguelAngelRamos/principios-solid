package com.kibernumacademy.noaplica;

public class Main {
  public static void main(String[] args) {
    AbstractSale abstractSale = new Sale(100, "Sofia", 0.14d);
    abstractSale.generate();
    abstractSale.calculateTaxes();

    // * Vamos a probar con la clase que esta libre de impuestos
    abstractSale = new ForeignSale(200, "Catalina");
    abstractSale.generate();
    abstractSale.calculateTaxes();
  }
}

abstract class AbstractSale {
  // Las propieades
  protected double amount; 
  protected String customer;
  protected double taxes;

  public abstract void generate(); // Para generar la venta

  public abstract void calculateTaxes(); // Para calcular los impuestos.
}

class Sale extends AbstractSale {

  public Sale(double amount, String customer, double taxes) {
    this.amount = amount;
    this.customer = customer;
    this.taxes = taxes;
  }
  @Override
  public void generate() {
    System.out.println("Se genera la venta..");
  }

  @Override
  public void calculateTaxes() {
    System.out.println("Se calculan los impuestos");
  }
  
}

// ForeignSale esta libre de impuestos
class ForeignSale extends AbstractSale {

  public ForeignSale(double amount, String customer) {
    this.amount = amount;
    this.customer = customer;
    this.taxes = 0;
  }
  @Override
  public void generate() {
    System.out.println("Generar la venta");
  }

  @Override
  public void calculateTaxes() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calculateTaxes'");
  }

}