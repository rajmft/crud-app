package com.example.RandR.Review;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author csc340-f23
 */
@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repo;

    /**
     * Get all products.
     *
     * @return the list of products.
     */
    public List<Review> getAllReviews() {
        return repo.findAll();
    }

    /**
     * Get all products that match the keyword.
     *
     * @param rating term.
     * @return the list of products.
     */
    public List<Review> getAllReviews(String rating) {
        if (rating != null){
            return repo.search(rating);
        }
        return repo.findAll();
    }

    /**
     * Get a single product by ID
     *
     * @param id
     * @return the product
     */
    public Review getReview(long id) {
        return repo.getReferenceById(id);
    }

    /**
     * Delete a single product by ID
     *
     * @param id
     */
    public void deleteReview(long id) {
        repo.deleteById(id);
    }

    /**
     * Save a product entry.
     *
     * @param review
     */
    void saveReview(Review review) {
        repo.save(review);
    }

}
