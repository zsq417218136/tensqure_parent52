package com.tensquare.recruit.pojo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tb_recruit")
public class Recruit {

    @Id
    private String id;

    private String jobname;
    private String salary;
    private String condition;
    private String education;
    private String type;
    private String address;
    private String eid;
    private Date createtime;
    private String state;
    private String url;
    private String label;
    private String content1;
    private String content2;


    @Override
    public String toString() {
        return "Recruit{" +
                "id='" + id + '\'' +
                ", jobname='" + jobname + '\'' +
                ", salary='" + salary + '\'' +
                ", condition='" + condition + '\'' +
                ", education='" + education + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", eid='" + eid + '\'' +
                ", createtime='" + createtime + '\'' +
                ", state='" + state + '\'' +
                ", url='" + url + '\'' +
                ", label='" + label + '\'' +
                ", content1='" + content1 + '\'' +
                ", coutent2='" + content2 + '\'' +
                '}';
    }

    public Recruit() {
    }

    public Recruit(String id, String jobname, String salary, String condition, String education, String type, String address, String eid, Date createtime, String state, String url, String label, String content1, String coutent2) {
        this.id = id;
        this.jobname = jobname;
        this.salary = salary;
        this.condition = condition;
        this.education = education;
        this.type = type;
        this.address = address;
        this.eid = eid;
        this.createtime = createtime;
        this.state = state;
        this.url = url;
        this.label = label;
        this.content1 = content1;
        this.content2 = content2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String coutent2) {
        this.content2 = coutent2;
    }
}
