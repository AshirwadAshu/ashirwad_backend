package com.excel.hibernate.entity.reportsTable;
import java.util.Date;

import com.excel.hibernate.entity.serviceTasksTable.ServiceTask;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Long reportId;

    @Column(name = "report_type")
    private String reportType;

//    @ManyToOne
//    @JoinColumn(name = "generated_by_id")
//    private Users generatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "generation_date")
    private Date generationDate;

    @Column(name = "report_data", columnDefinition = "TEXT")
    private String reportData; // Stored as JSON

}
