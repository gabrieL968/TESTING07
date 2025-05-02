package invoicemocked;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;

public class InvoiceFilterTest {

    @Test
    public void filterInvoicesLessThan100() {
        // mock de InvoiceDao
        InvoiceDao daoMock = mock(InvoiceDao.class);

        // configurar mock
        Invoice i1 = new Invoice("M", 20.0); // factura valida (< 100)
        Invoice i2 = new Invoice("A", 300.0); // factura inválida
        when(daoMock.all()).thenReturn(Arrays.asList(i1, i2));

        InvoiceFilter filter = new InvoiceFilter(daoMock);
        List<Invoice> result = filter.filter();

        // verificar resultados
        assertEquals(1, result.size());
        assertEquals(i1, result.get(0));

        // verificar con el mock
        verify(daoMock).all();
    }
}