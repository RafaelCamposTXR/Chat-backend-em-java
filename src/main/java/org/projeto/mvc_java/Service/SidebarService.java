package org.projeto.mvc_java.Service;

import org.projeto.mvc_java.Model.SidebarItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SidebarService {
        public List<SidebarItem> getSidebarItems() {
            List<SidebarItem> items = new ArrayList<>();


            items.add(new SidebarItem(0L, "Rafael", "/chat/0", "Mateus"));
            items.add(new SidebarItem(0L, "Mateus", "/chat/0", "Rafael" ));

            items.add(new SidebarItem(1L, "Eduardo", "/chat/1", "Ricardo"));
            items.add(new SidebarItem(1L, "Ricardo", "/chat/1", "Eduardo" ));

            items.add(new SidebarItem(2L, "Patrícia", "/chat/2", "Pedro"));

            // Itens de Mock-up, para agilizar os testes. Na versão final, os chats serão interpretados
            // da tabela de chats

            return items;
        }


}
