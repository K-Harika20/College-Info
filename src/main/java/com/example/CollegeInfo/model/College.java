package com.example.CollegeInfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String address;
    public String email;
    public String phone;
    public String website;
    public String description;


//@OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
//private List<Department> departments;

}
