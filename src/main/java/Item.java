public class Item {
  private Prenda prenda;
  private int cantidad;

  public Item(Prenda _prenda, int _cantidad){
    prenda=_prenda;
    cantidad=_cantidad;
  }
  public int subTotal(){
    return cantidad* prenda.getPrecio();
  }
}
