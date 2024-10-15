package org.projeto.mvc_java.Service;

import org.projeto.mvc_java.Model.SidebarItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SidebarService {
        public List<SidebarItem> getSidebarItems() {
            List<SidebarItem> items = new ArrayList<>();
            items.add(new SidebarItem("Home", "/"));
            items.add(new SidebarItem("About", "/about"));
            items.add(new SidebarItem("Services", "/services"));
            items.add(new SidebarItem("Contact", "/contact"));
            return items;
        }

}
