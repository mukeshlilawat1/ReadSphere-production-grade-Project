package com.example.demo.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    private Boolean isActive;
    private Boolean isDeleted;
    private Integer userCreatedBy;
    private Date createOn;
    private Integer updateBy;
    private Date updateOn;
}
