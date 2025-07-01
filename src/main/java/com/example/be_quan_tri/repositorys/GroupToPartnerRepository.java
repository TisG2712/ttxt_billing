package com.example.be_quan_tri.repositorys;

import com.example.be_quan_tri.dtos.partners.CustomPartnerDtos;
import com.example.be_quan_tri.entitys.CategoryServices;
import com.example.be_quan_tri.entitys.GroupPartnerEntity;
import com.example.be_quan_tri.entitys.Partner;
import com.example.be_quan_tri.entitys.Partner_to_group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface GroupToPartnerRepository extends JpaRepository<Partner_to_group, Long> {

    @Query("select count(ptg.id) from Partner_to_group ptg where ptg.groupPartnerEntity.id = :id")
    int findByCreatedAt(Long id);

    @Query("select new com.example.be_quan_tri.dtos.partners.CustomPartnerDtos(ptg.partner.id, ptg.partner.partnerName, ptg.partner.userName, ptg.partner.createdAt, ptg.partner.goLiveDate, ptg.partner.dateEndLive, " +
            " ptg.partner.role, ptg.partner.status, ptg.partner.partnerCode, ptg.partner.partnerDetail, ptg.partner.partnerAddress," +
            " ptg.partner.partnerTax, ptg.partner.partnerEmail, ptg.partner.partnerUser, ptg.partner.partnerPhone, count(ptg.partner.id))" +
            " from Partner_to_group ptg group by ptg.partner.id, ptg.partner.partnerName, ptg.partner.userName, ptg.partner.createdAt, ptg.partner.goLiveDate, ptg.partner.dateEndLive, ptg.partner.role" +
            " , ptg.partner.status, ptg.partner.partnerCode, ptg.partner.partnerDetail, ptg.partner.partnerAddress, ptg.partner.partnerTax, ptg.partner.partnerEmail, ptg.partner.partnerUser, ptg.partner.partnerPhone")
    List<CustomPartnerDtos> customGetAllPartner();

    List<Partner_to_group> findByPartnerAndGroupPartnerEntity(Partner partner, GroupPartnerEntity groupPartnerEntity);

    @Modifying
    @Transactional
    @Query("delete from Partner_to_group ps where ps.partner.id = :idPart and ps.groupPartnerEntity.id = :groupId")
    void customDeletePartOfGroup(Long idPart, Long groupId);
}
