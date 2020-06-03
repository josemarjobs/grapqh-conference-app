package com.example.graphqlconferenceapp.service

import com.example.graphqlconferenceapp.Attendee
import com.example.graphqlconferenceapp.AttendeeRepository
import com.example.graphqlconferenceapp.Talk
import org.springframework.stereotype.Service

@Service
class AttendeeService(private val attendeeRepository: AttendeeRepository) {
    fun findAll(): List<Attendee> = attendeeRepository.findAll()

    fun findAttendeesForTalk(talk: Talk): List<Attendee> = talk.attendees
}