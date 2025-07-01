package com.example.be_quan_tri.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "group_partner")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GroupPartnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nameGroup;

    @OneToMany(mappedBy = "groupPartnerEntity")
    private Set<Partner_to_group> partner_to_groups;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public GroupPartnerEntity(Long item) {
        this.id = item;
    }
}
