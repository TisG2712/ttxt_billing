package com.example.be_quan_tri.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "group_to_partner")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Partner_to_group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="partner_id", nullable=false)
    private Partner partner;

    @ManyToOne
    @JoinColumn(name="group_id", nullable=false)
    private GroupPartnerEntity groupPartnerEntity;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
