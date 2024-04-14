package modelos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author dougl
 */
public class Purchase {

    private Long Idpurchase;
    private Date purchaseDate;
    private BigDecimal totalPrice;
    private PurchaseItens products;

    public Purchase() {
    }

    public Long getIdpurchase() {
        return Idpurchase;
    }

    public void setIdpurchase(Long Idpurchase) {
        this.Idpurchase = Idpurchase;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PurchaseItens getProducts() {
        return products;
    }

    public void setProducts(PurchaseItens products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.Idpurchase);
        hash = 83 * hash + Objects.hashCode(this.purchaseDate);
        hash = 83 * hash + Objects.hashCode(this.totalPrice);
        hash = 83 * hash + Objects.hashCode(this.products);
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
        if (!Objects.equals(this.purchaseDate, other.purchaseDate)) {
            return false;
        }
        if (!Objects.equals(this.totalPrice, other.totalPrice)) {
            return false;
        }
        return Objects.equals(this.products, other.products);
    }

}
