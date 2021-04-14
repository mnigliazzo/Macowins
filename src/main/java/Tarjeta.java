public class Tarjeta implements FormaPago{
  private int cantidadCuotas;
  private int coeficienteFijo;
  private double coeficientePrenda=0.01;
  public Tarjeta(int _cantidadCuotas,int _coeficienteFijo)
  {
    cantidadCuotas=_cantidadCuotas;
    coeficienteFijo=_coeficienteFijo;
  }
  public double precioFinal(int precio){
    double recargo;
    recargo=(cantidadCuotas*coeficienteFijo)+coeficientePrenda*precio;
    return precio+recargo;
  }
}
