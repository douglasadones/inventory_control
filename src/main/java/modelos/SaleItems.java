package modelos;

import generics.GenericEntity;
import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author dougl
 */

@Entity
@Table(name = "saleItems")
public class SaleItems extends GenericEntity {
    
    @Id
    @SequenceGenerator(sequenceName = "seq_saleItems", name = "seq_saleItems")
    @GeneratedValue(generator = "seq_saleItems", strategy = GenerationType.SEQUENCE)
    private Long idSaleItems;
    
    @OneToMany
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
