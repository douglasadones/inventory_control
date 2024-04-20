package modelos;

import generics.GenericEntity;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
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
@Table(name = "purchase")
public class Purchase extends GenericEntity {
    @Id
    @SequenceGenerator(sequenceName = "seq_purchase", name = "seq_purchase")
    @GeneratedValue(generator = "seq_purchase", strategy = GenerationType.SEQUENCE)
    private Long Idpurchase;
   
    @Column(nullable = true)
    private String description;
            
    @Column(nullable = false)
    private BigDecimal totalPrice;
    
    @Column(nullable = false)
    @OneToMany
    private List<PurchaseItems> products;

    public Purchase() {
    }

    public Long getIdpurchase() {
        return Idpurchase;
    }

    public void setIdpurchase(Long Idpurchase) {
        this.Idpurchase = Idpurchase;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<PurchaseItems> getProducts() {
        return products;
    }

    public void setProducts(List<PurchaseItems> products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.Idpurchase);
        hash = 61 * hash + Objects.hashCode(this.description);
        hash = 61 * hash + Objects.hashCode(this.totalPrice);
        hash = 61 * hash + Objects.hashCode(this.products);
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
        final Purchase other = (Purchase) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.Idpurchase, other.Idpurchase)) {
            return false;
        }
        if (!Objects.equals(this.totalPrice, other.totalPrice)) {
            return false;
        }
        return Objects.equals(this.products, other.products);
    }
    
    
   
}
