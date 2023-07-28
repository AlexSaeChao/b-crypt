package com.operator.bcrypt.controllers;

import com.operator.bcrypt.repos.PostRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/post")
    public String getPosts(HttpServletRequest request, Model model) {

        HttpSession session = request.getSession();

        Object userNameAttribute = session.getAttribute("userName");

        if(userNameAttribute == null) {
            return "redirect:/";
        }

        String userName = userNameAttribute.toString();

        model.addAttribute("userName", userName);

        return "posts";
    }
}
