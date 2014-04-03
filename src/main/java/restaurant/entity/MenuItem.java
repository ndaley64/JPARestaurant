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
import javax.persistence.Version;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ndaley
 */
@Entity
@Table(name = "menuitem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MenuItem.findAll", query = "SELECT m FROM MenuItem m"),
    @NamedQuery(name = "MenuItem.findByMenuItemID", query = "SELECT m FROM MenuItem m WHERE m.menuItemID = :menuItemID"),
    @NamedQuery(name = "MenuItem.findByName", query = "SELECT m FROM MenuItem m WHERE m.name = :name"),
    @NamedQuery(name = "MenuItem.findByPrice", query = "SELECT m FROM MenuItem m WHERE m.price = :price"),
    @NamedQuery(name = "MenuItem.findByVersion", query = "SELECT m FROM MenuItem m WHERE m.version = :version")})
public class MenuItem implements Serializable {
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
    @Version
    private int version;

    public MenuItem() {
    }

    public MenuItem(Integer menuItemID) {
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
        if (!(object instanceof MenuItem)) {
            return false;
        }
        MenuItem other = (MenuItem) object;
        if ((this.menuItemID == null && other.menuItemID != null) || (this.menuItemID != null && !this.menuItemID.equals(other.menuItemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "restaurant.entity.MenuItem[ menuItemID=" + menuItemID + " ]";
    }
    
}
