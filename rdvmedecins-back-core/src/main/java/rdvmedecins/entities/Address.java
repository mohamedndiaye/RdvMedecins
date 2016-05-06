package rdvmedecins.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "ADDRESS")
public class Address extends AbstractEntity {
	
    private static final long serialVersionUID = 1L;
   
    @Column(name = "STREET_NAME", nullable = false,length = 50)
    @Size(max = 50)
    @NotEmpty
    private String streetName;

    @Column(name = "CITY", nullable = false, length = 25)
    @Size(max = 25)
    @NotEmpty
    private String city;
    

}
