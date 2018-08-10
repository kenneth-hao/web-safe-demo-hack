package org.dxy.websafedemohack.controller;

import org.dxy.websafedemohack.domain.Comment;
import org.dxy.websafedemohack.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/csrf")
public class CsrfController {

    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping("/hack_site")
    public String hackSite() {
        return "csrf/hack_site";
    }

    @RequestMapping("/camouflage")
    public String camouflage() {
        return "csrf/camouflage";
    }

    @RequestMapping("/xx_blog")
    public String xxBlog(Model model) {
        model.addAttribute("comments", commentRepository.findAll());
        return "csrf/xx_blog";
    }

    @RequestMapping("/camouflage_1")
    public String camouflage1() {
        return "csrf/camouflage_1";
    }

    @RequestMapping("/xx_blog/comment")
    public String xxBlogComment(String comment) {
        commentRepository.save(Comment.of("游客", comment));
        return "redirect:/csrf/xx_blog";
    }
}
