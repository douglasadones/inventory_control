package modelos;

import generics.GenericEntity;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author dougl
 */

@Entity
public class Purchase extends GenericEntity {
    @Id
    @SequenceGenerator(sequenceName = "seq_purchase", name = "seq_purchase")
    @GeneratedValue(generator = "seq_purchase", strategy = GenerationType.SEQUENCE)
    private Long Idpurchase;
   
    
    @Column(nullable = false)
    private BigDecimal totalPrice;
    
    @Column(nullable = false)
    @OneToOne
    private PurchaseItems products; // OneToOne nesse caso?

    public Purchase() {
    }

    public Long getIdpurchase() {
        return Idpurchase;
    }

    public void setIdpurchase(Long Idpurchase) {
        this.Idpurchase = Idpurchase;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PurchaseItems getProducts() {
        return products;
    }

    public void setProducts(PurchaseItems products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.Idpurchase);
        hash = 89 * hash + Objects.hashCode(this.totalPrice);
        hash = 89 * hash + Objects.hashCode(this.products);
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
        if (!Objects.equals(this.Idpurchase, other.Idpurchase)) {
            return false;
        }
        if (!Objects.equals(this.totalPrice, other.totalPrice)) {
            return false;
        }
        return Objects.equals(this.products, other.products);
    }



}
