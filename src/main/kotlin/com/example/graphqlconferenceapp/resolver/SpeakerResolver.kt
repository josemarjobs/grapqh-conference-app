package com.example.graphqlconferenceapp.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import com.example.graphqlconferenceapp.Speaker
import com.example.graphqlconferenceapp.Talk
import org.springframework.stereotype.Component

@Component
class SpeakerResolver : GraphQLResolver<Speaker> {
    fun getTalks(speaker: Speaker): List<Talk> = speaker.talks
}