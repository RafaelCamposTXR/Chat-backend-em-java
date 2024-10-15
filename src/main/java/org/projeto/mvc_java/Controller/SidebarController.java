package org.projeto.mvc_java.Controller;

import org.projeto.mvc_java.Model.SidebarItem;
import org.projeto.mvc_java.Service.SidebarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SidebarController {

        private final SidebarService sidebarService;

        @Autowired
        public SidebarController(SidebarService sidebarService) {
            this.sidebarService = sidebarService;
        }

        @GetMapping("/sidebar")
        public List<SidebarItem> getSidebarItems() {
            return sidebarService.getSidebarItems();
        }

}
