package fjaviermelero.springframework.spring5jokesappv2.controllers;

import fjaviermelero.springframework.spring5jokesappv2.services.GetRandomQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final GetRandomQuoteService quoteService;

    public JokesController(GetRandomQuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/")
    public String getJokes(Model model){

        model.addAttribute("joke",quoteService.getRandomQuote());

        return "index";

    }

}
