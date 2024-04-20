package generics;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dougl
 */

@MappedSuperclass
public abstract class GenericEntity implements Serializable {
    
    public Boolean active;
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date registrationDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    public Date updateDate;

    public GenericEntity() {
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    
}
