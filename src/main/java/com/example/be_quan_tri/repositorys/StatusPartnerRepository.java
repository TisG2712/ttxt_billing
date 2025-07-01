package com.example.be_quan_tri.repositorys;

import com.example.be_quan_tri.dtos.status.CustomStatusDtos;
import com.example.be_quan_tri.entitys.Partner;
import com.example.be_quan_tri.entitys.Partner_to_Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusPartnerRepository extends JpaRepository<Partner_to_Status, Long> {
    @Query("select new com.example.be_quan_tri.dtos.status.CustomStatusDtos(pts.status.id as id, pts.status.statusDetail as statusDetail) from Partner_to_Status pts where pts.partner.id = :partner")
    CustomStatusDtos findByPartner(Long partner);

    @Query("select count(pts.id) from Partner_to_Status pts where pts.status.id = :idStatus")
    int findByCreatedAt(Long idStatus);

    Boolean existsByPartner(Partner idPartner);

    @Query("select pts from Partner_to_Status pts where pts.partner.id = :idPartner")
    Partner_to_Status findByUpdatedAt(Long idPartner);
}
