package com.example.graphqlconferenceapp

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class GraphqlConferenceAppApplication {
    @Bean
    fun run(
            attendeeRepo: AttendeeRepository,
            talkRepository: TalkRepository,
            speakerRepository: SpeakerRepository
    ) = CommandLineRunner {
        var p = Attendee(name = "Peter Griffin")
        var g = Attendee(name = "Glen Quagmire")
        var c = Attendee(name = "Cleveland Brown")
        var j = Attendee(name = "Joe Swanson")

        var l = Speaker(name = "Lois Griffin", twitter = "loisg")
        var s = Speaker(name = "Stewie Griffin", twitter = "stewieg")
        var gg = Speaker(name = "Glen Quagmire", twitter = "glenq")

        var t1 = Talk(
                title = "Fundamentals of Time Travel",
                speakers = mutableListOf(s),
                attendees = mutableListOf(p, g)
        )
        var t2 = Talk(
                title = "Fundamentals of Boxing",
                speakers = mutableListOf(l),
                attendees = mutableListOf(g, c, j)
        )
        var t3 = Talk(
                title = "Piloting 101",
                speakers = mutableListOf(gg),
                attendees = mutableListOf(p, j, c)
        )

        talkRepository.saveAll(mutableListOf(t1, t2, t3))
    }
}

fun main(args: Array<String>) {
    runApplication<GraphqlConferenceAppApplication>(*args)
}
