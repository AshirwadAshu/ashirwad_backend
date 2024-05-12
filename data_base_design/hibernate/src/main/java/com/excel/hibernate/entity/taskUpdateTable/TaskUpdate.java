package com.excel.hibernate.entity.taskUpdateTable;

import java.util.Date;

import com.excel.hibernate.entity.TechniciansTable.Technicians;
import com.excel.hibernate.entity.serviceRequestsTable.ServiceRequest;
import com.excel.hibernate.entity.serviceTasksTable.ServiceTask;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "task_updates")
public class TaskUpdate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "update_id")
    private Long updateId;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private ServiceTask serviceTask;

    @Column(name = "update_message")
    private String updateMessage;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time")
    private Date updateTime;

   
}
