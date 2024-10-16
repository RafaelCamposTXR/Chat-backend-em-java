package org.projeto.mvc_java.Service;

import org.projeto.mvc_java.Model.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.projeto.mvc_java.repository.ChatRepository;

import java.util.List;

@Service
public class ChatService {

    private final ChatRepository chatRepository;

    @Autowired
    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public Chat criarChat(String nome) {
        return chatRepository.save(new Chat(nome));
    }

    public Iterable<Chat> listarChats() {
        return chatRepository.findAll();
    }

    public List<Chat> findAllChats() {
        return chatRepository.findAll();
    }
}
