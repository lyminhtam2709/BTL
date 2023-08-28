/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.pojo;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ahjhj
 */
@Entity
@Table(name = "hostel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hostel.findAll", query = "SELECT h FROM Hostel h"),
    @NamedQuery(name = "Hostel.findByHostelID", query = "SELECT h FROM Hostel h WHERE h.hostelID = :hostelID"),
    @NamedQuery(name = "Hostel.findByName", query = "SELECT h FROM Hostel h WHERE h.name = :name"),
    @NamedQuery(name = "Hostel.findByAddress", query = "SELECT h FROM Hostel h WHERE h.address = :address"),
    @NamedQuery(name = "Hostel.findByPhone", query = "SELECT h FROM Hostel h WHERE h.phone = :phone"),
    @NamedQuery(name = "Hostel.findByApproved", query = "SELECT h FROM Hostel h WHERE h.approved = :approved")})
public class Hostel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "HostelID")
    private Integer hostelID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "Address")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Approved")
    private boolean approved;
    @JoinColumn(name = "UserID", referencedColumnName = "UserID")
    @ManyToOne(optional = false)
    private User userID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hostelID")
    private Set<Rating> ratingSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hostelID")
    private Set<Room> roomSet;

    public Hostel() {
    }

    public Hostel(Integer hostelID) {
        this.hostelID = hostelID;
    }

    public Hostel(Integer hostelID, String name, String address, String phone, boolean approved) {
        this.hostelID = hostelID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.approved = approved;
    }

    public Integer getHostelID() {
        return hostelID;
    }

    public void setHostelID(Integer hostelID) {
        this.hostelID = hostelID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    @XmlTransient
    public Set<Rating> getRatingSet() {
        return ratingSet;
    }

    public void setRatingSet(Set<Rating> ratingSet) {
        this.ratingSet = ratingSet;
    }

    @XmlTransient
    public Set<Room> getRoomSet() {
        return roomSet;
    }

    public void setRoomSet(Set<Room> roomSet) {
        this.roomSet = roomSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hostelID != null ? hostelID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hostel)) {
            return false;
        }
        Hostel other = (Hostel) object;
        if ((this.hostelID == null && other.hostelID != null) || (this.hostelID != null && !this.hostelID.equals(other.hostelID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ourproject.pojo.Hostel[ hostelID=" + hostelID + " ]";
    }
    
}
