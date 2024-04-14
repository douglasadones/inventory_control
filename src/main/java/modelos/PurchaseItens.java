package modelos;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dougl
 */
public class PurchaseItens {
    private Long idPurchaseItens;
    private ArrayList<Product> products;

    public PurchaseItens() {
    }

    public Long getIdPurchaseItens() {
        return idPurchaseItens;
    }

    public void setIdPurchaseItens(Long idPurchaseItens) {
        this.idPurchaseItens = idPurchaseItens;
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
        hash = 73 * hash + Objects.hashCode(this.idPurchaseItens);
        hash = 73 * hash + Objects.hashCode(this.products);
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
        final PurchaseItens other = (PurchaseItens) obj;
        if (!Objects.equals(this.idPurchaseItens, other.idPurchaseItens)) {
            return false;
        }
        return Objects.equals(this.products, other.products);
    }

    
}
