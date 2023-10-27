package com.example.RandR.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author csc340-f23
 */
@Controller
@RequestMapping("")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @GetMapping("/review")
    public String getAllReviews(Model model) {
        model.addAttribute("reviewList",
                reviewService.getAllReviews());
        return "review";
    }

    @GetMapping("review/id={id}")
    public String getReview(@PathVariable long id, Model model) {
        model.addAttribute("review",
                reviewService.getReview(id));
        return "update-review";
    }

    @PostMapping("/delete/id={id}")
    public String deleteProduct(@PathVariable long id) {
        reviewService.deleteReview(id);
        return "redirect:/review";
    }

    @PostMapping("/create")
    public String createReview(Review review) {

        reviewService.saveReview(review);
        return "redirect:/review";
    }

    @PostMapping("/update")
    public String updateReview(Review review) {
        reviewService.saveReview(review);
        return "redirect:/review";
    }

}
