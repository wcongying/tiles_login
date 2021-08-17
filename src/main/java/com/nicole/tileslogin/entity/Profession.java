package com.nicole.tileslogin.entity;

import java.io.Serializable;

/**
 * (Profession)实体类
 *
 * @author makejava
 * @since 2021-08-15 15:40:58
 */
public class Profession implements Serializable {
    private static final long serialVersionUID = -27779699993569918L;
    
    private Long id;
    /**
    * 开发方向
    */
    private String developmentDirection;
    /**
    * 配图url
    */
    private String image;
    /**
    * 职业名称
    */
    private String occupation;
    
    private String description;
    /**
    * 门槛星星数
    */
    private Integer threshold;
    /**
    * 难度星星数
    */
    private Integer difficulty;
    
    private String growthCycle;
    
    private Integer scarcity;
    /**
    * 低薪资k
    */
    private double salaryStart;
    /**
    * 高薪资k
    */
    private double salaryEnd;
    /**
    * 在学人数
    */
    private Integer currentStudentNumber;
    
    private String prompt;
    
    private String flipTitle;
    
    private String flipText;
    
    private Long createdAt;
    
    private Long updatedAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDevelopmentDirection() {
        return developmentDirection;
    }

    public void setDevelopmentDirection(String developmentDirection) {
        this.developmentDirection = developmentDirection;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public String getGrowthCycle() {
        return growthCycle;
    }

    public void setGrowthCycle(String growthCycle) {
        this.growthCycle = growthCycle;
    }

    public Integer getScarcity() {
        return scarcity;
    }

    public void setScarcity(Integer scarcity) {
        this.scarcity = scarcity;
    }

    public double getSalaryStart() {
        return salaryStart;
    }

    public void setSalaryStart(double salaryStart) {
        this.salaryStart = salaryStart;
    }

    public double getSalaryEnd() {
        return salaryEnd;
    }

    public void setSalaryEnd(double salaryEnd) {
        this.salaryEnd = salaryEnd;
    }

    public Integer getCurrentStudentNumber() {
        return currentStudentNumber;
    }

    public void setCurrentStudentNumber(Integer currentStudentNumber) {
        this.currentStudentNumber = currentStudentNumber;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getFlipTitle() {
        return flipTitle;
    }

    public void setFlipTitle(String flipTitle) {
        this.flipTitle = flipTitle;
    }

    public String getFlipText() {
        return flipText;
    }

    public void setFlipText(String flipText) {
        this.flipText = flipText;
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