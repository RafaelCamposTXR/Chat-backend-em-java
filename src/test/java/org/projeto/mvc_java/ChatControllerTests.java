package org.projeto.mvc_java;

import org.projeto.mvc_java.Controller.ChatController;
import org.projeto.mvc_java.Model.Chat;
import org.projeto.mvc_java.Service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

@SpringBootTest
@AutoConfigureMockMvc
public class ChatControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ChatService chatService;

    @InjectMocks
    private ChatController chatController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCriarChatComNome() throws Exception {
        String nomeChat = "Novo Chat";
        Chat chat = new Chat();
        chat.setNome(nomeChat);

        when(chatService.criarChat(nomeChat)).thenReturn(chat);

        mockMvc.perform(post("/chats/criarchat")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("\"" + nomeChat + "\""))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("\"Novo Chat\""));
    }


    @Test
    public void testListarChats() throws Exception {

        mockMvc.perform(get("/chats/listar"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nome").value("\"Novo Chat\""));
    }

    // dando início aos testes das classes


}
