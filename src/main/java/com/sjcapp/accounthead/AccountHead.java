
package com.sjcapp.accounthead;

import javax.persistence.*;

@Entity
@Table(name = "account_head")
public class AccountHead {

    @Id
    @GeneratedValue
    @Column(name = "account_id")
    int acHeadId;

    @Column(name = "account_type")
    String acType;


    @Column(name = "account_desc")
    String acName;

    @Column(name = "remarks")
    String remarks;

    public int getAcHeadId() {
        return acHeadId;
    }

    public void setAcHeadId(int acHeadId) {
        this.acHeadId = acHeadId;
    }

    public String getAcType() {
        return acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "AccountHead{" +
                "acHeadId=" + acHeadId +
                ", acType='" + acType + '\'' +
                ", acName='" + acName + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
