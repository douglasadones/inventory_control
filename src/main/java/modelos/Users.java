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
import javax.persistence.Table;

/**
 *
 * @author dougl
 */

@Entity
@Table(name = "Users")
public class Users extends GenericEntity {
    
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

    public Users() {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idUser);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.login);
        hash = 89 * hash + Objects.hashCode(this.password);
        hash = 89 * hash + Objects.hashCode(this.companyList);
        hash = 89 * hash + Objects.hashCode(this.contactList);
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
        final Users other = (Users) obj;
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
        return Objects.equals(this.contactList, other.contactList);
    }
    
}
