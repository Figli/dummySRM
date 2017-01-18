package com.becomejavasenior.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "task")
public class Task implements Serializable {

    private static final long serialVersionUID = 6293431459384559680L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "task_type")
    private TaskType taskType;

    @Column(name = "description")
    private String description;

    @Column(name = "deadline_date")
    private Date deadlineDate;

    @Column(name = "deadline_time")
    private Time deadlineTime;

//    @Column(name = "period_days")
    private PeriodInDaysType periodInDaysType;

    @Column(name = "period_minute")
    private int periodInMinutes;

//    @Column(name = "responsible_user")
//    private User responsibleUser;
    @ManyToMany(mappedBy = "tasks")
    private List<User> responsibleUsers = new ArrayList<>();

    @Column(name = "is_finished")
    private boolean isFinished;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    public Task() {
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

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public void setDeadlineTime(Time deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public Time getDeadlineTime() {
        return deadlineTime;
    }

    public PeriodInDaysType getPeriodInDaysType() {
        return periodInDaysType;
    }

    public void setPeriodInDaysType(PeriodInDaysType periodInDaysType) {
        this.periodInDaysType = periodInDaysType;
    }

    public int getPeriodInMinutes() {
        return periodInMinutes;
    }

    public void setPeriodInMinutes(int periodInMinutes) {
        this.periodInMinutes = periodInMinutes;
    }

//    public User getResponsibleUser() {
//        return responsibleUser;
//    }
//
//    public void setResponsibleUser(User responsibleUser) {
//        this.responsibleUser = responsibleUser;
//    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
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
