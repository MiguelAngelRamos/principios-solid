package com.kibernumacademy.aplica;

public class Main {
  public static void main(String[] args) {

    SaleWithTaxes saleWithTaxes = new LocalSale(100, "Sofia", 0.14d);
    saleWithTaxes.generate();
    saleWithTaxes.calculateTaxes();


    // * Vamos a probar con la clase que esta libre de impuestos
    AbstractSale abstractSale = new ForeignSale(200, "Catalina");
    abstractSale.generate();

    //* Invoice */
    saleWithTaxes = new SaleInvoice(400, "Richard", 2.4d);
    saleWithTaxes.calculateTaxes();
    saleWithTaxes.generate();
  }
}

abstract class AbstractSale {
  // Las propieades
  protected double amount; 
  protected String customer;
  // protected double taxes;

  public abstract void generate(); // Para generar la venta
  // public abstract void calculateTaxes(); // Para calcular los impuestos.
}

abstract class SaleWithTaxes extends AbstractSale {
  protected double taxes;
  public abstract void calculateTaxes();
}

class LocalSale extends SaleWithTaxes {

  public LocalSale(double amount, String customer, double taxes) {
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

class SaleInvoice extends SaleWithTaxes {

  public SaleInvoice(double amount, String customer, double taxes) {
    this.amount = amount;
    this.customer = customer;
    this.taxes = taxes;
  }
  @Override
  public void generate() {
    System.out.println("Se genera la venta..");
    this.generateInvoicePDF();
  }

  @Override
  public void calculateTaxes() {
    System.out.println("Se calculan los impuestos");
  }

  public void generateInvoicePDF() {
    System.out.println("Se genera la factura en formato PDF");
  }
  
}


// ForeignSale esta libre de impuestos
class ForeignSale extends AbstractSale {

  public ForeignSale(double amount, String customer) {
    this.amount = amount;
    this.customer = customer;
  }
  @Override
  public void generate() {
    System.out.println("Generar la venta");
  }
}