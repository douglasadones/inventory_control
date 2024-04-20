package modelos;

import generics.GenericEntity;
import java.util.List;
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
public class User extends GenericEntity { // Sobre o warning na palavra "user": "The entity table name is a reserved SQL-99 keyword." isso pode me gerar dor de cabeça futuramente?
    
    @Id
    @SequenceGenerator(sequenceName = "seq_user", name = "seq_user")
    @GeneratedValue(generator = "seq_user", strategy = GenerationType.SEQUENCE)
    private Long idUser;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String login;
    
    @Column(nullable = false)
    private String password;
    
    @Column(nullable = false)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Company> companyList;
    
    @Column(nullable = false)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Contact> contactList;
    
    @Column(nullable = false)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Stock> stockList;

    public User() {
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.idUser);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.login);
        hash = 29 * hash + Objects.hashCode(this.password);
        hash = 29 * hash + Objects.hashCode(this.companyList);
        hash = 29 * hash + Objects.hashCode(this.contactList);
        hash = 29 * hash + Objects.hashCode(this.stockList);
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
        final User other = (User) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.idUser, other.idUser)) {
            return false;
        }
        if (!Objects.equals(this.companyList, other.companyList)) {
            return false;
        }
        if (!Objects.equals(this.contactList, other.contactList)) {
            return false;
        }
        return Objects.equals(this.stockList, other.stockList);
    }

    

    
}
