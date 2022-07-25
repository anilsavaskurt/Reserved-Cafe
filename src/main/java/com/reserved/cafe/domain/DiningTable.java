package com.reserved.cafe.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.xml.transform.Result;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table", schema = "public")
@Entity
public class DiningTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "busy")
    private boolean busy;

    @Column(name = "table_no")
    private int tableNo;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name="restaurant_id", nullable=false)
    private Restaurant restaurant;
}
