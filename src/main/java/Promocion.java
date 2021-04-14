public class Promocion implements Estado
{
  public int montoDescuento;

  public int getPrecioPorEstado(int _PrecioLista) {
    return _PrecioLista-montoDescuento;
  }
}
