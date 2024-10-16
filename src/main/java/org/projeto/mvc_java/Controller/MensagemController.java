package org.projeto.mvc_java.Controller;

import org.projeto.mvc_java.Model.Mensagem;
import org.projeto.mvc_java.Service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    private final MensagemService mensagemService;

    @Autowired
    public MensagemController(MensagemService mensagemService) {
        this.mensagemService = mensagemService;
    }

    @GetMapping("/chat/{chatId}")
    public Iterable<Mensagem> obterMensagensPorChat(@PathVariable Long chatId) {
        return mensagemService.listarMensagensPorChat(chatId);
    }

    @PostMapping("/enviarmensagem")
    public Mensagem enviarMensagem(@RequestBody Mensagem mensagem) {
        return mensagemService.salvarMensagem(mensagem);
    }
}
