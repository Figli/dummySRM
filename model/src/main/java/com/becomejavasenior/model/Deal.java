package com.becomejavasenior.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "deal")
public class Deal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deal_id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "company")
    private Company company;

    @Column(name = "budget")
    private int budget;

    @Column(name = "stage")
    private Stage stage;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    @ManyToMany(mappedBy = "deals")
    private List<User> responsibleUsers = new ArrayList<>();

//    private List<Task> tasks;
//
//    private List<Tag> tags;
//
//    private List<Contact> contacts;
//
//    private List<Note> notes;

    @Column(name = "create_date")
    private Date createDate;

//    @Column(name = "primary_contact")
//    private Contact primaryContact;


    public Deal(){

    }

//    public List<Task> getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(List<Task> tasks) {
//        this.tasks = tasks;
//    }
//
//    public List<Tag> getTags() {
//        return tags;
//    }
//
//    public void setTags(List<Tag> tags) {
//        this.tags = tags;
//    }
//
//    public List<Contact> getContacts() {
//        return contacts;
//    }
//
//    public void setContacts(List<Contact> contacts) {
//        this.contacts = contacts;
//    }
//
//    public List<Note> getNotes() {
//        return notes;
//    }
//
//    public void setNotes(List<Note> notes) {
//        this.notes = notes;
//    }

//    public Contact getPrimaryContact() {
//        return primaryContact;
//    }
//
//    public void setPrimaryContact(Contact primaryContact) {
//        this.primaryContact = primaryContact;
//    }

//    public List<Contact> getDealContact() {
//        return contacts;
//    }
//
//    public void setDealContacts(List<Contact> dealContact) {
//        this.contacts = dealContact;
//    }
//
//    public void setDealNotes(List<Note> dealNotes){
//        this.notes = dealNotes;
//    }
//
//    public List<Note> getDealNotes() {
//        return notes;
//    }
//
//    public void setDealNote(List<Note> dealNote) {
//        this.notes = dealNote;
//    }
//
//    public List<Tag> getDealTags() {
//        return tags;
//    }
//
//    public void setDealTags(List<Tag> dealTag) {
//        this.tags = dealTag;
//    }
//
//    public List<Task> getDealTasks() {
//        return tasks;
//    }
//
//    public void setDealTasks(List<Task> dealTask) {
//        this.tasks = dealTask;
//    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public List<User> getResponsibleUsers() {
        return responsibleUsers;
    }

    public void setResponsibleUsers(List<User> responsibleUsers) {
        this.responsibleUsers = responsibleUsers;
    }
}