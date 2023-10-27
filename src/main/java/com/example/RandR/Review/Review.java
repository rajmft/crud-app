package com.example.RandR.Review;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author csc340-f23
 */
@Entity
@Table(name = "review")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String rating;
    private String info;

    public Review(String name, String rating, String price) {
        this.name = name;
        this.rating = rating;
        this.info = info;
    }

}
