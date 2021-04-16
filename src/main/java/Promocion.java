public class Promocion implements Estado{
  public int montoDescuento;
  public Promocion(int _montoDescuento){montoDescuento=_montoDescuento;}
  public int getPrecioPorEstado(int _PrecioLista) {
    return _PrecioLista-montoDescuento;
  }
}
