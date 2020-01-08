package com.offcn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person")
public class User {

    @Id//主键
    @GeneratedValue
    private  long id;

    @Column(name="name",nullable = false,length = 20)
    private String name;

    @Column(nullable = false,length = 20)
    private String password;

    @Column(nullable = false,length = 10)
    private Integer age;


}
