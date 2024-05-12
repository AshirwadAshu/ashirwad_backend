package com.excel.hibernate.entity.serviceTasksTable;

import java.util.Date;

import com.excel.hibernate.entity.TechniciansTable.Technicians;
import com.excel.hibernate.entity.appliancesTable.Appliances;
import com.excel.hibernate.entity.customerTable.Customer;
import com.excel.hibernate.entity.serviceRequestsTable.ServiceRequest;

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
@Table(name = "service_tasks")
public class ServiceTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long taskId;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private ServiceRequest serviceRequest;

    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Technicians technician;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_time")
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_time")
    private Date endTime;

   
}
