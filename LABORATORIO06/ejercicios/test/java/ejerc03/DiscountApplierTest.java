package ejerc03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void applyDiscountsToHomeAndBusiness() {
        ProductDao daoMock = mock(ProductDao.class);

        Product homeProduct = new Product("TV", "HOME", 100.0);
        Product businessProduct = new Product("Laptop", "BUSINESS", 200.0);
        when(daoMock.getAll()).thenReturn(Arrays.asList(homeProduct, businessProduct));

        // metodo de prueba
        DiscountApplier applier = new DiscountApplier(daoMock);
        applier.applyDiscounts();

        // precios actualizados
        assertEquals(90.0, homeProduct.getPrice()); // 10% descuento
        assertEquals(220.0, businessProduct.getPrice()); // 10% aumento

        // interaccion con el mock
        verify(daoMock).getAll();
    }
}