/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.pojo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ahjhj
 */
@Entity
@Table(name = "posting")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Posting.findAll", query = "SELECT p FROM Posting p"),
    @NamedQuery(name = "Posting.findByPostingID", query = "SELECT p FROM Posting p WHERE p.postingID = :postingID"),
    @NamedQuery(name = "Posting.findByTitle", query = "SELECT p FROM Posting p WHERE p.title = :title"),
    @NamedQuery(name = "Posting.findByDescription", query = "SELECT p FROM Posting p WHERE p.description = :description"),
    @NamedQuery(name = "Posting.findByCreatedDate", query = "SELECT p FROM Posting p WHERE p.createdDate = :createdDate")})
public class Posting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PostingID")
    private Integer postingID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Title")
    private String title;
    @Size(max = 1000)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postingID")
    private Set<Image> imageSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postingID")
    private Set<Notification> notificationSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postingID")
    private Set<Comment> commentSet;
    @JoinColumn(name = "UserID", referencedColumnName = "UserID")
    @ManyToOne(optional = false)
    private User userID;

    public Posting() {
    }

    public Posting(Integer postingID) {
        this.postingID = postingID;
    }

    public Posting(Integer postingID, String title, Date createdDate) {
        this.postingID = postingID;
        this.title = title;
        this.createdDate = createdDate;
    }

    public Integer getPostingID() {
        return postingID;
    }

    public void setPostingID(Integer postingID) {
        this.postingID = postingID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @XmlTransient
    public Set<Image> getImageSet() {
        return imageSet;
    }

    public void setImageSet(Set<Image> imageSet) {
        this.imageSet = imageSet;
    }

    @XmlTransient
    public Set<Notification> getNotificationSet() {
        return notificationSet;
    }

    public void setNotificationSet(Set<Notification> notificationSet) {
        this.notificationSet = notificationSet;
    }

    @XmlTransient
    public Set<Comment> getCommentSet() {
        return commentSet;
    }

    public void setCommentSet(Set<Comment> commentSet) {
        this.commentSet = commentSet;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postingID != null ? postingID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Posting)) {
            return false;
        }
        Posting other = (Posting) object;
        if ((this.postingID == null && other.postingID != null) || (this.postingID != null && !this.postingID.equals(other.postingID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ourproject.pojo.Posting[ postingID=" + postingID + " ]";
    }
    
}
