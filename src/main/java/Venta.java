import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
  private List<Item> items = new ArrayList<>();
  private FormaPago formaPago;
  private Date fecha;

  public Venta(List<Item> _items,FormaPago _formaPago,Date _fecha){
    items.addAll(_items);
    formaPago=_formaPago;
    fecha=_fecha;
  }
  public boolean esVentaDelDia(Date _dia){
    return fecha==_dia;
  }

  public double total(){
    return items.stream().mapToDouble(item-> item.subTotal()).sum();
  }
}
