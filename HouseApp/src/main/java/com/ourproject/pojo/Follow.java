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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ahjhj
 */
@Entity
@Table(name = "follow")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Follow.findAll", query = "SELECT f FROM Follow f"),
    @NamedQuery(name = "Follow.findByFollowID", query = "SELECT f FROM Follow f WHERE f.followID = :followID")})
public class Follow implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FollowID")
    private Integer followID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "followID")
    private Set<Notification> notificationSet;
    @JoinColumn(name = "FollowerUserID", referencedColumnName = "UserID")
    @ManyToOne
    private User followerUserID;
    @JoinColumn(name = "FollowedUserID", referencedColumnName = "UserID")
    @ManyToOne
    private User followedUserID;

    public Follow() {
    }

    public Follow(Integer followID) {
        this.followID = followID;
    }

    public Integer getFollowID() {
        return followID;
    }

    public void setFollowID(Integer followID) {
        this.followID = followID;
    }

    @XmlTransient
    public Set<Notification> getNotificationSet() {
        return notificationSet;
    }

    public void setNotificationSet(Set<Notification> notificationSet) {
        this.notificationSet = notificationSet;
    }

    public User getFollowerUserID() {
        return followerUserID;
    }

    public void setFollowerUserID(User followerUserID) {
        this.followerUserID = followerUserID;
    }

    public User getFollowedUserID() {
        return followedUserID;
    }

    public void setFollowedUserID(User followedUserID) {
        this.followedUserID = followedUserID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (followID != null ? followID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Follow)) {
            return false;
        }
        Follow other = (Follow) object;
        if ((this.followID == null && other.followID != null) || (this.followID != null && !this.followID.equals(other.followID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ourproject.pojo.Follow[ followID=" + followID + " ]";
    }
    
}
