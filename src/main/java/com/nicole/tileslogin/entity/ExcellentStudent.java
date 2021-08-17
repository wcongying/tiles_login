package com.nicole.tileslogin.entity;

import java.io.Serializable;

/**
 * (ExcellentStudent)实体类
 *
 * @author makejava
 * @since 2021-08-15 15:39:26
 */
public class ExcellentStudent implements Serializable {
    private static final long serialVersionUID = 340236582224034453L;
    
    private Long id;
    /**
    * 头像图片地址
    */
    private String profilePic;
    /**
    * 头衔
    */
    private String title;
    /**
    * 姓名
    */
    private String name;
    /**
    * 个人简要描述
    */
    private String description;
    /**
    * 薪资
    */
    private double salary;
    
    private Long createdAt;
    
    private Long updatedAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

}