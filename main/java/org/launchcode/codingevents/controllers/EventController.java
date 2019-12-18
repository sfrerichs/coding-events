package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<String > events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        //code for static list:
//        List<String> events = new ArrayList<>();
//        events.add("First Coding Event");
//        events.add("Second Coding Event");
//        events.add("3rd Coding Event");
        model.addAttribute("events", events);
        return "index";
    }

    @GetMapping("create") //lives at /events/create
    public String renderCreateEventForm() {
        return "create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:";
    }

}
