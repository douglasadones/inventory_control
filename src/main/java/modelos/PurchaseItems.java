package modelos;

import generics.GenericEntity;
import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author dougl
 */

@Entity
public class PurchaseItems extends GenericEntity {
    @Id
    @SequenceGenerator(sequenceName = "seq_purchaseItems", name = "seq_purchaseItems")
    private Long idPurchaseItems;
    
    @OneToMany(cascade = CascadeType.ALL) //OneToMany? ou ManyToMany?
    private ArrayList<Product> products;

    public PurchaseItems() {
    }

    public Long getIdPurchaseItems() {
        return idPurchaseItems;
    }

    public void setIdPurchaseItems(Long idPurchaseItems) {
        this.idPurchaseItems = idPurchaseItems;
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
        hash = 73 * hash + Objects.hashCode(this.idPurchaseItems);
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
        final PurchaseItems other = (PurchaseItems) obj;
        if (!Objects.equals(this.idPurchaseItems, other.idPurchaseItems)) {
            return false;
        }
        return Objects.equals(this.products, other.products);
    }

    
}
