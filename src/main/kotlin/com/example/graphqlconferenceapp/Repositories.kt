package com.example.graphqlconferenceapp

import org.springframework.data.jpa.repository.JpaRepository

interface AttendeeRepository : JpaRepository<Attendee, Long>

interface TalkRepository : JpaRepository<Talk, Long>

interface SpeakerRepository : JpaRepository<Speaker, Long>