package com.example.graphqlconferenceapp.service

import com.example.graphqlconferenceapp.Attendee
import com.example.graphqlconferenceapp.Speaker
import com.example.graphqlconferenceapp.Talk
import com.example.graphqlconferenceapp.TalkRepository
import org.springframework.stereotype.Service

@Service
class TalkService(
        private val talkRepository: TalkRepository
) {
    fun findAll(): List<Talk> = talkRepository.findAll()

    fun findAllTalksBySpeaker(speaker: Speaker): List<Talk> = speaker.talks

    fun findAllTalksByAttendee(attendee: Attendee): List<Talk> = attendee.talks
}