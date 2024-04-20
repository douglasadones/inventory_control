package modelos;

import generics.GenericEntity;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author dougl
 */
@Entity
public class Product extends GenericEntity{
    
    @Id
    @SequenceGenerator(name = "seq_product", sequenceName = "seq_product")
    @GeneratedValue(generator = "seq_product", strategy = GenerationType.SEQUENCE)
    private Long idProduct;
    
    @Column(nullable = false)
    private int code;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = true)
    private String description;
    
    @Column(nullable = false)
    private int amount;
    
    @Column(nullable = false)
    private BigDecimal purchasePrice;
    
    @Column(nullable = false)
    private BigDecimal salePrice;

    public Product() {
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idProduct);
        hash = 53 * hash + this.code;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + this.amount;
        hash = 53 * hash + Objects.hashCode(this.purchasePrice);
        hash = 53 * hash + Objects.hashCode(this.salePrice);
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
        final Product other = (Product) obj;
        if (this.code != other.code) {
            return false;
        }
        if (this.amount != other.amount) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.idProduct, other.idProduct)) {
            return false;
        }
        if (!Objects.equals(this.purchasePrice, other.purchasePrice)) {
            return false;
        }
        return Objects.equals(this.salePrice, other.salePrice);
    }
    
    
}
