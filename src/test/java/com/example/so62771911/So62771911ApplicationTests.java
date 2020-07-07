package com.example.so62771911;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class So62771911ApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void test() throws Exception {

        mockMvc
                .perform(
                        post(ResourceConstants.ROOM_RESERVATION_V1)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content("{\n" +
                                        "    \"id\" : 12345,\n" +
                                        "    \"checkin\" : \"2017-03-01\",\n" +
                                        "    \"checkout\" : \"2017-03-05\"\n" +
                                        "}"))
                .andExpect(status().isCreated())
                .andDo(print());
    }

}
