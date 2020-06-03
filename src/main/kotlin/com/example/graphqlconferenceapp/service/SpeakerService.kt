package com.example.graphqlconferenceapp.service

import com.example.graphqlconferenceapp.Speaker
import com.example.graphqlconferenceapp.SpeakerRepository
import com.example.graphqlconferenceapp.Talk
import org.springframework.stereotype.Service

@Service
class SpeakerService(private val speakerRepository: SpeakerRepository) {
    fun findAll(): List<Speaker> = speakerRepository.findAll()

    fun findAllSpeakersByTalk(talk: Talk): List<Speaker> = talk.speakers
}