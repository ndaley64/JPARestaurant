/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaurant.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ndaley
 */
@Entity
@Table(name = "menuitems")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menuitems.findAll", query = "SELECT m FROM Menuitems m"),
    @NamedQuery(name = "Menuitems.findByMenuItemID", query = "SELECT m FROM Menuitems m WHERE m.menuItemID = :menuItemID"),
    @NamedQuery(name = "Menuitems.findByName", query = "SELECT m FROM Menuitems m WHERE m.name = :name"),
    @NamedQuery(name = "Menuitems.findByPrice", query = "SELECT m FROM Menuitems m WHERE m.price = :price"),
    @NamedQuery(name = "Menuitems.findByVersion", query = "SELECT m FROM Menuitems m WHERE m.version = :version")})
public class Menuitems implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "menuItemID")
    private Integer menuItemID;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "version")
    private Integer version;

    public Menuitems() {
    }

    public Menuitems(Integer menuItemID) {
        this.menuItemID = menuItemID;
    }

    public Integer getMenuItemID() {
        return menuItemID;
    }

    public void setMenuItemID(Integer menuItemID) {
        this.menuItemID = menuItemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuItemID != null ? menuItemID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menuitems)) {
            return false;
        }
        Menuitems other = (Menuitems) object;
        if ((this.menuItemID == null && other.menuItemID != null) || (this.menuItemID != null && !this.menuItemID.equals(other.menuItemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restaurant.entity.Menuitems[ menuItemID=" + menuItemID + " ]";
    }
    
}
