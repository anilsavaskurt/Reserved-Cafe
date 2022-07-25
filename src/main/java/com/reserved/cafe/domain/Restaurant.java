package com.reserved.cafe.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="restaurant", schema = "public")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","table"})
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private int restaurantId;

    @Column(name = "name")
    private String restaurantName;

    @Column(name = "adress")
    private String adress;

    @Column(name = "openingTime")
    private String openingTime;

    @Column(name = "closingTime")
    private String closingTime;

    @Column(name = "totalTableCapacity")
    private int totalTableCapacity;

    @OneToMany(mappedBy="restaurant")
    @JsonManagedReference
    private List<DiningTable> diningTableSet;

}
