package de.manuelbuchloh.pokebase

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.core.env.Environment
import spock.lang.Specification

@SpringBootTest
class PokebaseApplicationTest extends Specification{

    @Autowired
    Environment environment

    def "application context can load"() {
        given: 'the conext'
        when: 'application is being run'
        then: 'application context exists'
        environment != null
    }
}
