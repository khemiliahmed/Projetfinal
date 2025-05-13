package com.example.projetPfe.services;



import com.example.projetPfe.dtos.EmployeFicheDTO;
import com.example.projetPfe.entities.GrhEmploye;
import com.example.projetPfe.repositories.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GrhEmployeService {
    
    @Autowired
    private EmployeRepository employeRepository;
    
    public List<GrhEmploye> getAllEmployes() {
        return employeRepository.findAll();
    }
    
    public GrhEmploye getEmployeById(Long empyUid) {
        return employeRepository.findById(empyUid).orElse(null);
    }
    
    public GrhEmploye getEmployeByCode(String empyCod) {
        return employeRepository.findByEmpyCod(empyCod);
    }
    
    public GrhEmploye saveEmploye(GrhEmploye employe) {
        return employeRepository.save(employe);
    }
    
    public void deleteEmploye(Long empyUid) {
        employeRepository.deleteById(empyUid);
    }
    /* 
    public EmployeFicheDTO updateEmploye(Long id, EmployeFicheDTO dto) {
    GrhEmploye existingEmploye = employeRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Employé non trouvé avec l'id : " + id));

   
    existingEmploye.setEmpyCod(dto.getEmpyCod());
    existingEmploye.setEmpyCodpco(dto.getEmpyCodpco());
    existingEmploye.setEmpyNom(dto.getEmpyNom());
    existingEmploye.setEmpyPrn(dto.getEmpyPrn());
    existingEmploye.setEmpyNomjnf(dto.getEmpyNomjnf());
    existingEmploye.setEmpyNomcmp(dto.getEmpyNomcmp());
    existingEmploye.setEmpyGnr(dto.getEmpyGnr());
    existingEmploye.setEmpyDatnai(dto.getEmpyDatnai());
    existingEmploye.setEmpyNumcin(dto.getEmpyNumcin());
    existingEmploye.setEmpyDatcin(dto.getEmpyDatcin());
    existingEmploye.setEmpyAtf(dto.getEmpyAtf());
    existingEmploye.setEmpyAdr(dto.getEmpyAdr());
    existingEmploye.setEmpyTel(dto.getEmpyTel());
    existingEmploye.setEmpyEmail(dto.getEmpyEmail());
    existingEmploye.setEmpyPhoto(dto.getEmpyPhoto());
    existingEmploye.setEmpyDatent(dto.getEmpyDatent());
    existingEmploye.setEmpyDatrec(dto.getEmpyDatrec());
    existingEmploye.setEmpyDattit(dto.getEmpyDattit());
    existingEmploye.setEmpyDatsit(dto.getEmpyDatsit());
    existingEmploye.setEmpyDatstr(dto.getEmpyDatstr());
    existingEmploye.setEmpyDatdebpos(dto.getEmpyDatdebpos());
    existingEmploye.setEmpyDatfinpos(dto.getEmpyDatfinpos());
    existingEmploye.setEmpyDatdebspo(dto.getEmpyDatdebspo());
    existingEmploye.setEmpyFindebspo(dto.getEmpyFindebspo());
    existingEmploye.setEmpyCodpcd(dto.getEmpyCodpcd());
    existingEmploye.setEmpyTypdtc(dto.getEmpyTypdtc());
    existingEmploye.setEmpyDatdebrgt(dto.getEmpyDatdebrgt());
    existingEmploye.setEmpyDatfinrgt(dto.getEmpyDatfinrgt());
    existingEmploye.setEmpyTypctr(dto.getEmpyTypctr());
    existingEmploye.setEmpyBadge(dto.getEmpyBadge());
    existingEmploye.setEmpyDatsfm(dto.getEmpyDatsfm());
    existingEmploye.setEmpyNbrenf(dto.getEmpyNbrenf());
    existingEmploye.setEmpyNbrenfses(dto.getEmpyNbrenfses());
    existingEmploye.setEmpyNbrenfimp(dto.getEmpyNbrenfimp());
    existingEmploye.setEmpyNbrenfasg(dto.getEmpyNbrenfasg());
    existingEmploye.setEmpyChffam(dto.getEmpyChffam());
    existingEmploye.setEmpySlrunq(dto.getEmpySlrunq());
    existingEmploye.setEmpyAlcfam(dto.getEmpyAlcfam());
    existingEmploye.setEmpyNumses(dto.getEmpyNumses());
    existingEmploye.setEmpyDatses(dto.getEmpyDatses());
    existingEmploye.setEmpyNumrss(dto.getEmpyNumrss());
    existingEmploye.setEmpyDatdebrss(dto.getEmpyDatdebrss());
    existingEmploye.setEmpyDatfinrss(dto.getEmpyDatfinrss());
    existingEmploye.setEmpyDatdebhd(dto.getEmpyDatdebhd());
    existingEmploye.setEmpyDatasgrp(dto.getEmpyDatasgrp());
    existingEmploye.setEmpyAffasgcnj(dto.getEmpyAffasgcnj());
    existingEmploye.setEmpyNumasg(dto.getEmpyNumasg());
    existingEmploye.setEmpyMntassgrprtr(dto.getEmpyMntassgrprtr());
    existingEmploye.setEmpyDatgrs(dto.getEmpyDatgrs());
    existingEmploye.setEmpyDatcat(dto.getEmpyDatcat());
    existingEmploye.setEmpyDatecl(dto.getEmpyDatecl());
    existingEmploye.setEmpyDatecn(dto.getEmpyDatecn());
    existingEmploye.setEmpyDatcrp(dto.getEmpyDatcrp());
    existingEmploye.setEmpyDatgrd(dto.getEmpyDatgrd());
    existingEmploye.setEmpyDatfiness(dto.getEmpyDatfiness());
    existingEmploye.setEmpyDatgrdtit(dto.getEmpyDatgrdtit());
    existingEmploye.setEmpyDatpst(dto.getEmpyDatpst());
    existingEmploye.setEmpyDatpsttit(dto.getEmpyDatpsttit());
    existingEmploye.setEmpyDatfct(dto.getEmpyDatfct());
    existingEmploye.setEmpyMntrdsimp(dto.getEmpyMntrdsimp());
    existingEmploye.setEmpyMntinv(dto.getEmpyMntinv());
    existingEmploye.setEmpyDatdebinv(dto.getEmpyDatdebinv());
    existingEmploye.setEmpyDatfininv(dto.getEmpyDatfininv());
    existingEmploye.setPretMntasv(dto.getPretMntasv());
    existingEmploye.setEmpyDatdebasv(dto.getEmpyDatdebasv());
    existingEmploye.setEmpyDatfinasv(dto.getEmpyDatfinasv());
    existingEmploye.setEmpyDatdebexoimp(dto.getEmpyDatdebexoimp());
    existingEmploye.setEmpyDatfinexoimp(dto.getEmpyDatfinexoimp());
    existingEmploye.setEmpyNbrepaircu(dto.getEmpyNbrepaircu());
    existingEmploye.setEmpyMnttpc(dto.getEmpyMnttpc());
    existingEmploye.setEmpyMntard(dto.getEmpyMntard());
    existingEmploye.setEmpyNbjddctit(dto.getEmpyNbjddctit());
    existingEmploye.setEmpyNbjddcgrs(dto.getEmpyNbjddcgrs());
    existingEmploye.setEmpyNbjddccat(dto.getEmpyNbjddccat());
    existingEmploye.setEmpyNbjddcecl(dto.getEmpyNbjddcecl());
    existingEmploye.setEmpyNbjddcecn(dto.getEmpyNbjddcecn());
    existingEmploye.setEmpyNbjddccrp(dto.getEmpyNbjddccrp());
    existingEmploye.setEmpyNbjddcgrd(dto.getEmpyNbjddcgrd());
    existingEmploye.setEmpyNbjddcfct(dto.getEmpyNbjddcfct());
    existingEmploye.setEmpyHorgrs(dto.getEmpyHorgrs());
    existingEmploye.setEmpyChmlib01(dto.getEmpyChmlib01());
    existingEmploye.setEmpyChmlib02(dto.getEmpyChmlib02());
    existingEmploye.setEmpyChmlib03(dto.getEmpyChmlib03());
    existingEmploye.setEmpyChmlib04(dto.getEmpyChmlib04());
    existingEmploye.setEmpyChmlib05(dto.getEmpyChmlib05());
    existingEmploye.setEmpyChmlib06(dto.getEmpyChmlib06());
    existingEmploye.setEmpyChmlib07(dto.getEmpyChmlib07());
    existingEmploye.setEmpyChmlib08(dto.getEmpyChmlib08());
    existingEmploye.setEmpyChmlib09(dto.getEmpyChmlib09());
    existingEmploye.setEmpyChmlib10(dto.getEmpyChmlib10());
    existingEmploye.setEmpyObs(dto.getEmpyObs());
    existingEmploye.setEmpyStatut(dto.getEmpyStatut());
    existingEmploye.setEmpyDatfinasgrp(dto.getEmpyDatfinasgrp());

   
    GrhEmploye updated =employeRepository.save(existingEmploye);
    return EmployeMapper.map(updated, EmployeFicheDTO.class);
}
*/
    }
        
       
    
