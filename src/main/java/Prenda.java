public class Prenda {
  private Estado estado;
  private int precioDeLista;
  public  String Tipo;
  public Prenda(int _PrecioLista,Estado _estado){
    estado=_estado;
    precioDeLista=_PrecioLista;
  }
  public int getPrecio(){
    return estado.getPrecioPorEstado(precioDeLista);
  }

}


