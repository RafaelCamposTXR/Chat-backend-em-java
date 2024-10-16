package org.projeto.mvc_java.Controller;


import org.projeto.mvc_java.Model.Chat;
import org.projeto.mvc_java.Service.ChatService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/chats")
public class ChatController {

    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping("/criarchat")
    public Chat criarChat(@RequestBody String nome) {
        return chatService.criarChat(nome);
    }

    @PostMapping("/criarchatalt")
    public Chat criarChat(@RequestBody Chat chat) {
        return chatService.criarChat(chat.getNome());
    }

    @GetMapping( "/listar")
    public Iterable<Chat> listarChats() {
        return chatService.listarChats();
    }


}
