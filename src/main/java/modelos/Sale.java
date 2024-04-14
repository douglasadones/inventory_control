package modelos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author dougl
 */
public class Sale {
    private Long idSale;
    private Date saleDate;
    private BigDecimal totalPrice;
    private SaleItems products;

    public Sale() {
    }

    public Long getIdSale() {
        return idSale;
    }

    public void setIdSale(Long idSale) {
        this.idSale = idSale;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public SaleItems getProducts() {
        return products;
    }

    public void setProducts(SaleItems products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.idSale);
        hash = 41 * hash + Objects.hashCode(this.saleDate);
        hash = 41 * hash + Objects.hashCode(this.totalPrice);
        hash = 41 * hash + Objects.hashCode(this.products);
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
        final Sale other = (Sale) obj;
        if (!Objects.equals(this.idSale, other.idSale)) {
            return false;
        }
        if (!Objects.equals(this.saleDate, other.saleDate)) {
            return false;
        }
        if (!Objects.equals(this.totalPrice, other.totalPrice)) {
            return false;
        }
        return Objects.equals(this.products, other.products);
    }
    
    
    
}
