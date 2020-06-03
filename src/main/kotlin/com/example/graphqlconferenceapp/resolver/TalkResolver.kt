package com.example.graphqlconferenceapp.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import com.example.graphqlconferenceapp.Attendee
import com.example.graphqlconferenceapp.Speaker
import com.example.graphqlconferenceapp.Talk
import org.springframework.stereotype.Component

@Component
class TalkResolver : GraphQLResolver<Talk> {
    fun getSpeakers(talk: Talk): List<Speaker> = talk.speakers
    fun getAttendees(talk: Talk): List<Attendee> = talk.attendees
}