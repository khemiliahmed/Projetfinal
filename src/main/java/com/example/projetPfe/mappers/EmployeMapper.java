package com.example.projetPfe.mappers;



import com.example.projetPfe.dtos.EmployeFicheDTO;
import com.example.projetPfe.entities.GrhEmploye;
import org.springframework.stereotype.Component;

@Component
public class EmployeMapper {
    
    public EmployeFicheDTO toFicheDTO(GrhEmploye employe) {
        EmployeFicheDTO dto = new EmployeFicheDTO();
      /*   dto.setEmpyCod(employe.getEmpyCod());
        dto.setEmpyNom(employe.getEmpyNom());
        dto.setEmpyPrn(employe.getEmpyPrn());
        dto.setEmpyDatnai(employe.getEmpyDatnai());
        dto.setEmpyNumcin(employe.getEmpyNumcin());
        dto.setEmpyDatcin(employe.getEmpyDatcin());
        dto.setEmpyAdr(employe.getEmpyAdr());
        dto.setEmpyTel(employe.getEmpyTel());
        dto.setEmpyEmail(employe.getEmpyEmail());
        
        if (employe.getGrpeUid() != null) {
            dto.setGroupe(employe.getGrpeUid().getGrpeDes());
        }
        
        if (employe.getPstnUid() != null) {
            dto.setPosition(employe.getPstnUid().getPstnDes());
        }
        
        if (employe.getRtrvUid() != null) {
            dto.setRegimeTravail(employe.getRtrvUid().getRtrvDes());
        }
        
        if (employe.getStrcUid() != null) {
            dto.setStructure(employe.getStrcUid().getStrcDes());
        }
        
        if (employe.getSiteUid() != null) {
            dto.setSite(employe.getSiteUid().getSiteDes());
        }
        */
        return dto;
    }
}
