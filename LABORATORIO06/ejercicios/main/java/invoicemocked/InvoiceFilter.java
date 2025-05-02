package invoicemocked;

import java.util.ArrayList;
import java.util.List;

public class InvoiceFilter {
    private InvoiceDao dao;

    // Inyección de dependencia por constructor
    public InvoiceFilter(InvoiceDao dao) {
        this.dao = dao;
    }

    public List<Invoice> filter() {
        List<Invoice> allInvoices = dao.all();
        List<Invoice> filtered = new ArrayList<>();

        for (Invoice invoice : allInvoices) {
            if (invoice.getValue() < 100.0) {
                filtered.add(invoice);
            }
        }
        return filtered;
    }
}