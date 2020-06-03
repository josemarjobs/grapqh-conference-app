package com.example.graphqlconferenceapp

import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import javax.persistence.*

@Entity
data class Attendee(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var name: String? = null,
        @ManyToMany(mappedBy = "attendees", fetch = FetchType.EAGER)
        @Cascade(CascadeType.PERSIST)
        var talks: MutableList<Talk> = mutableListOf()
)

@Entity
data class Speaker(
        @Id
        @GeneratedValue
        var id: Long? = null,
        var name: String? = null,
        var twitter: String? = null,
        @ManyToMany(mappedBy = "speakers", fetch = FetchType.EAGER)
        @Cascade(CascadeType.PERSIST)
        var talks: MutableList<Talk> = mutableListOf()
)

@Entity
data class Talk(
        @Id
        @GeneratedValue
        var id: Long? = null,
        var title: String? = null,
        var description: String? = null,
        @ManyToMany
        @Cascade(CascadeType.PERSIST)
        var attendees: MutableList<Attendee> = mutableListOf(),
        @ManyToMany
        @Cascade(CascadeType.PERSIST)
        var speakers: MutableList<Speaker> = mutableListOf()
)
