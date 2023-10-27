package com.example.RandR.Review;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReviewRepository extends JpaRepository<Review, Long> {


    @Query("SELECT p FROM Review p WHERE CONCAT(p.name, p.rating, p.info) LIKE %?1%")
    public List<Review> search(String rating);
}
