package modelos;

import generics.GenericEntity;
import java.util.ArrayList;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author dougl
 */

@Entity
public class Stock extends GenericEntity {
    
    @Id
    @SequenceGenerator(sequenceName = "seq_stock", name = "seq_stock")
    @GeneratedValue(generator = "seq_stock", strategy = GenerationType.SEQUENCE)
    private Long idStock;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = true)
    private String description;
    
    @Column(nullable = false)
    @OneToMany(cascade = CascadeType.ALL) // OneToOne mesmo?
    private ArrayList<Product> products;

    public Stock() {
    }

    public Long getIdStock() {
        return idStock;
    }

    public void setIdStock(Long idStock) {
        this.idStock = idStock;
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

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idStock);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.products);
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
        final Stock other = (Stock) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.idStock, other.idStock)) {
            return false;
        }
        return Objects.equals(this.products, other.products);
    }
    
    
    
}
