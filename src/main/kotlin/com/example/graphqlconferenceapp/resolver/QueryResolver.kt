package com.example.graphqlconferenceapp.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.example.graphqlconferenceapp.Attendee
import com.example.graphqlconferenceapp.Speaker
import com.example.graphqlconferenceapp.Talk
import com.example.graphqlconferenceapp.service.AttendeeService
import com.example.graphqlconferenceapp.service.SpeakerService
import com.example.graphqlconferenceapp.service.TalkService
import org.springframework.stereotype.Component

@Component
class QueryResolver(
        private val attendeeService: AttendeeService,
        private val speakerService: SpeakerService,
        private val talkService: TalkService
) : GraphQLQueryResolver {
    fun attendees(): List<Attendee> = attendeeService.findAll()

    fun talks(): List<Talk> = talkService.findAll()

    fun speakers(): List<Speaker> = speakerService.findAll()
}
