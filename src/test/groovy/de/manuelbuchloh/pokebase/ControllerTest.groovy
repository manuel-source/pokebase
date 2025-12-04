package de.manuelbuchloh.pokebase

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.bean.override.mockito.MockitoBean
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.mockito.Mockito.when
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@WebMvcTest(Controller)
class ControllerTest extends Specification {

    @Autowired
    MockMvc mockMvc

    @MockitoBean
    PokeApiFeign pokeApiFeign

    def "should return pokemon name"() {
        given:
        when(pokeApiFeign.getPokemon("charizard")).thenReturn("Charizard")

        expect:
        mockMvc.perform(get("/api/v1/pokemon/charizard"))
                .andExpect(status().isOk())
                .andExpect(content().string("Charizard"))
    }
}

