package com.spring.rest.entity;

import javax.persistence.*;

@Table(name = "orders")
@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "author")
    private EmployeeEntity author;

    @Column(name = "deadline")
    private String deadline;

    @ManyToOne
    @JoinColumn(name = "executor")
    private EmployeeEntity executor;

    @Column(name = "sign_of_control")
    private String signOfControl;

    @Column(name = "sign_of_execution")
    private String signOfExecution;

    @Column(name = "subject_of_order")
    private String subjectOfOrder;

    @Column(name = "text_of_order")
    private String textOfOrder;

    public OrderEntity() {}

    public OrderEntity(EmployeeEntity author, String deadline, EmployeeEntity executor, String signOfControl,
                       String signOfExecution, String subjectOfOrder, String textOfOrder) {
        this.author = author;
        this.deadline = deadline;
        this.executor = executor;
        this.signOfControl = signOfControl;
        this.signOfExecution = signOfExecution;
        this.subjectOfOrder = subjectOfOrder;
        this.textOfOrder = textOfOrder;
    }

    public String getTextOfOrder() {
        return textOfOrder;
    }

    public void setTextOfOrder(String textOfOrder) {
        this.textOfOrder = textOfOrder;
    }

    public String getSubjectOfOrder() {
        return subjectOfOrder;
    }

    public void setSubjectOfOrder(String subjectOfOrder) {
        this.subjectOfOrder = subjectOfOrder;
    }

    public String getSignOfExecution() {
        return signOfExecution;
    }

    public void setSignOfExecution(String signOfExecution) {
        this.signOfExecution = signOfExecution;
    }

    public String getSignOfControl() {
        return signOfControl;
    }

    public void setSignOfControl(String signOfControl) {
        this.signOfControl = signOfControl;
    }

    public EmployeeEntity getExecutor() {
        return executor;
    }

    public void setExecutor(EmployeeEntity executor) {
        this.executor = executor;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public EmployeeEntity getAuthor() {
        return author;
    }

    public void setAuthor(EmployeeEntity author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}