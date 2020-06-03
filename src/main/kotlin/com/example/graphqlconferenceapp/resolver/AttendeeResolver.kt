package com.example.graphqlconferenceapp.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import com.example.graphqlconferenceapp.Attendee
import com.example.graphqlconferenceapp.Talk
import org.springframework.stereotype.Component

@Component
class AttendeeResolver : GraphQLResolver<Attendee> {
    fun getTalks(attendee: Attendee): List<Talk> = attendee.talks
}