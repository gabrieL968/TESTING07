package invoicemocked;

import java.util.List;

public interface InvoiceDao {
    List<Invoice> all();  // Obtener todas las facturas
    void save(Invoice invoice);
    void close();
}