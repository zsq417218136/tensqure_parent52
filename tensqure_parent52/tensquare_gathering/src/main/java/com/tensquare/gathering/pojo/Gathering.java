package com.tensquare.gathering.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tb_gathering")
public class Gathering {
    @Id
    private String id;

    private String name;
    private String summary;
    private String detail;
    private String sponsor;
    private String image;
    private Date starttime;
    private Date endtime;
    private String address;
    private Date enrolltime;
    private String state;
    private String city;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEnrolltime() {
        return enrolltime;
    }

    public void setEnrolltime(Date enrolltime) {
        this.enrolltime = enrolltime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Gathering() {
    }

    public Gathering(String id, String name, String summary, String detail, String sponsor, String image, Date starttime, Date endtime, String address, Date enrolltime, String state, String city) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.detail = detail;
        this.sponsor = sponsor;
        this.image = image;
        this.starttime = starttime;
        this.endtime = endtime;
        this.address = address;
        this.enrolltime = enrolltime;
        this.state = state;
        this.city = city;
    }
}
