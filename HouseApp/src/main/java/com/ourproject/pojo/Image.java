/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ourproject.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ahjhj
 */
@Entity
@Table(name = "image")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Image.findAll", query = "SELECT i FROM Image i"),
    @NamedQuery(name = "Image.findByImageID", query = "SELECT i FROM Image i WHERE i.imageID = :imageID"),
    @NamedQuery(name = "Image.findByImageLinking", query = "SELECT i FROM Image i WHERE i.imageLinking = :imageLinking")})
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImageID")
    private Integer imageID;
    @Size(max = 1000)
    @Column(name = "ImageLinking")
    private String imageLinking;
    @JoinColumn(name = "PostingID", referencedColumnName = "PostingID")
    @ManyToOne(optional = false)
    private Posting postingID;

    public Image() {
    }

    public Image(Integer imageID) {
        this.imageID = imageID;
    }

    public Integer getImageID() {
        return imageID;
    }

    public void setImageID(Integer imageID) {
        this.imageID = imageID;
    }

    public String getImageLinking() {
        return imageLinking;
    }

    public void setImageLinking(String imageLinking) {
        this.imageLinking = imageLinking;
    }

    public Posting getPostingID() {
        return postingID;
    }

    public void setPostingID(Posting postingID) {
        this.postingID = postingID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imageID != null ? imageID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Image)) {
            return false;
        }
        Image other = (Image) object;
        if ((this.imageID == null && other.imageID != null) || (this.imageID != null && !this.imageID.equals(other.imageID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ourproject.pojo.Image[ imageID=" + imageID + " ]";
    }
    
}
