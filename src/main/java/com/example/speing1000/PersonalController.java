package com.example.speing1000;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonalController {
    private final List<Book> books = new ArrayList<>();

    @GetMapping("/")
    public String bookForm(Model model) {
        model.addAttribute("books", books);
        return "personal";
    }

    @PostMapping("/")
    public String bookSubmit(@RequestParam String title, @RequestParam String author) {
        books.add(new Book(title, author));
        return "redirect:/";
    }
}
