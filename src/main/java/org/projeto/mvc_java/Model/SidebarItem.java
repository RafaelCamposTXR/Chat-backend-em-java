package org.projeto.mvc_java.Model;

public class SidebarItem {
    private Long id;
    private String name;
    private String link;
    private String user;

    // Construtor
    public SidebarItem(Long id, String name, String link, String user) {
        this.id = id;
        this.name = name;
        this.link = link;
        this.user = user;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
