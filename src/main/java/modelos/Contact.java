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
public class Contact extends GenericEntity {
    @Id
    @SequenceGenerator(sequenceName = "seq_contact", name = "seq_contact")
    @GeneratedValue(generator = "seq_contact", strategy = GenerationType.SEQUENCE)
    private Long IdContact;
    
    @OneToMany(cascade = CascadeType.ALL)
    @Column(nullable = false)
    private ArrayList<Integer> number;
    
    @Column(nullable = false)
    private String email;

    public Contact() {
    }

    public Long getIdContact() {
        return IdContact;
    }

    public void setIdContact(Long IdContact) {
        this.IdContact = IdContact;
    }

    public ArrayList<Integer> getNumber() {
        return number;
    }

    public void setNumber(ArrayList<Integer> number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.IdContact);
        hash = 31 * hash + Objects.hashCode(this.number);
        hash = 31 * hash + Objects.hashCode(this.email);
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
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.IdContact, other.IdContact)) {
            return false;
        }
        return Objects.equals(this.number, other.number);
    }
    
}
