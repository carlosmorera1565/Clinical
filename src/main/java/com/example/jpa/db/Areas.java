package com.example.jpa.db;
// Generated 9/10/2017 03:30:25 PM by Hibernate Tools 4.3.1


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Areas generated by hbm2java
 */
@Entity
@Table(name="areas"
    ,catalog="clinical"
)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Areas  implements java.io.Serializable {


     private Long areasId;
     private String nombre;
     private Set<Subareas> subareases = new HashSet<Subareas>(0);

    public Areas() {
    }

	
    public Areas(String nombre) {
        this.nombre = nombre;
    }
    public Areas(String nombre, Set<Subareas> subareases) {
       this.nombre = nombre;
       this.subareases = subareases;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="areas_id", unique=true, nullable=false)
    public Long getAreasId() {
        return this.areasId;
    }
    
    public void setAreasId(Long areasId) {
        this.areasId = areasId;
    }

    
    @Column(name="nombre", nullable=false, length=250)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="areas")
    public Set<Subareas> getSubareases() {
        return this.subareases;
    }
    
    public void setSubareases(Set<Subareas> subareases) {
        this.subareases = subareases;
    }




}


