package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("First Coding Event");
        events.add("Second Coding Event");
        events.add("3rd Coding Event");
        return "events/index";
    }

    @GetMapping("create") //lives at /events/create
    public String renderCreateEventForm() {
        return "create";
    }

}
