package com.example.be_quan_tri.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Table(name = "partner_to_status")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Partner_to_Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="partner_id", nullable=false)
    private Partner partner;

    @ManyToOne
    @JoinColumn(name="status_id", nullable=false)
    private StatusEntity status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
