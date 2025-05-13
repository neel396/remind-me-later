package com.example.remindmelater.controller;

import com.example.remindmelater.dto.ReminderRequest;
import com.example.remindmelater.entity.Reminder;
import com.example.remindmelater.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reminders")
public class ReminderController {

    @Autowired
    private ReminderService reminderService;

    @PostMapping
    public Reminder createReminder(@RequestBody ReminderRequest request) {
        return reminderService.saveReminder(request);
    }
}
