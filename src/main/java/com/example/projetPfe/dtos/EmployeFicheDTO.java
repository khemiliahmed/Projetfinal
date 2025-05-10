package com.example.projetPfe.dtos;



import lombok.Data;
import java.util.Date;

@Data
public class EmployeFicheDTO {
    private String empyCod;
    private String empyNom;
    private String empyPrn;
    private Date empyDatnai;
    private String empyNumcin;
    private Date empyDatcin;
    private String empyAdr;
    private String empyTel;
    private String empyEmail;
    private String groupe;
    private String position;
    private String regimeTravail;
    private String structure;
    private String site;
}