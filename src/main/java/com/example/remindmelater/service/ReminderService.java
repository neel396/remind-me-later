package com.example.remindmelater.service;

import com.example.remindmelater.dto.ReminderRequest;
import com.example.remindmelater.entity.Reminder;
import com.example.remindmelater.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class ReminderService {

    @Autowired
    private ReminderRepository reminderRepository;

    public Reminder saveReminder(ReminderRequest request) {
        Reminder reminder = new Reminder();
        reminder.setDate(LocalDate.parse(request.getDate()));
        reminder.setTime(LocalTime.parse(request.getTime()));
        reminder.setMessage(request.getMessage());
        reminder.setReminderType(request.getReminderType());
        return reminderRepository.save(reminder);
    }
}
