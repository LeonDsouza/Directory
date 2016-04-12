/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crce.interns.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Leon
 */
@Entity
@Table(name = "company",catalog="job_schema")
@SuppressWarnings("serial")
public class Company implements Serializable {
	@Id
	@Column(name = "company_id" )
	String companyId;
        @Column(name = "company_name" )
	String companyName;
        @Column(name = "company_address" )
	String companyAddress;
        @Column(name = "created_date" )
        @Temporal(javax.persistence.TemporalType.DATE)
	Date createdDate;
        @Column(name = "created_by" )
	String createdBy;
        @Column(name = "modified_date" )
        @Temporal(javax.persistence.TemporalType.DATE)
	Date modifiedDate;
        @Column(name = "modified_by" )
	String modifiedBy;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
        
        
        
        
}