package modelos;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dougl
 */
public class SaleItems {
    
    private Long idSaleItems;
    private ArrayList<Product> products;

    public SaleItems() {
    }

    public Long getIdSaleItems() {
        return idSaleItems;
    }

    public void setIdSaleItems(Long idSaleItems) {
        this.idSaleItems = idSaleItems;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idSaleItems);
        hash = 97 * hash + Objects.hashCode(this.products);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SaleItems other = (SaleItems) obj;
        if (!Objects.equals(this.idSaleItems, other.idSaleItems)) {
            return false;
        }
        return Objects.equals(this.products, other.products);
    }
    
    
    
}
