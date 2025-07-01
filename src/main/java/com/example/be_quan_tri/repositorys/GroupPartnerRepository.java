package com.example.be_quan_tri.repositorys;

import com.example.be_quan_tri.entitys.GroupPartnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupPartnerRepository extends JpaRepository<GroupPartnerEntity, Long> {
}
