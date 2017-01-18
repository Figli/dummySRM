package com.becomejavasenior.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "note")
public class Note implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private int id;

    @Column(name = "note_text")
    private String noteText;

//    @Column(name = "created_user")
//    private User createdUser;

    @ManyToMany(mappedBy = "notes")
    private List<User> createdUsers = new ArrayList<>();

    @Column(name = "date_create")
    private Date dateCreate;

//    @Column(name = "deal")
//    private Deal deal;

//    @Column(name = "contact")
//    private Contact contact;

//    @Column(name = "company")
//    private Company company;

    @Column(name = "is_deleted")
    private boolean isDeleted;

//    private List<File> files;

    public Note() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

//    public User getCreatedUser() {
//        return createdUser;
//    }
//
//    public void setCreatedUser(User createdUser) {
//        this.createdUser = createdUser;
//    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

//    public Deal getDeal() {
//        return deal;
//    }
//
//    public void setDeal(Deal deal) {
//        this.deal = deal;
//    }
//
//    public Contact getContact() {
//        return contact;
//    }
//
//    public void setContact(Contact contact) {
//        this.contact = contact;
//    }
//
//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

//    public List<File> getFiles() {
//        return files;
//    }
//
//    public void setFiles(List<File> files) {
//        this.files = files;
//    }

    public List<User> getCreatedUsers() {
        return createdUsers;
    }

    public void setCreatedUsers(List<User> createdUsers) {
        this.createdUsers = createdUsers;
    }
}