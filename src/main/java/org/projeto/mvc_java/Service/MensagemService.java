package org.projeto.mvc_java.Service;



import org.projeto.mvc_java.Model.Mensagem;
import org.springframework.stereotype.Service;
import org.projeto.mvc_java.repository.MensagemRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MensagemService {

    private final MensagemRepository mensagemRepository;

    @Autowired
    public MensagemService(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }

    public Iterable<Mensagem> listarMensagensPorChat(Long chatId) {
        return mensagemRepository.findByChatId(chatId);
    }

    public Mensagem salvarMensagem(Mensagem mensagem) {
        return mensagemRepository.save(mensagem);
    }
}
