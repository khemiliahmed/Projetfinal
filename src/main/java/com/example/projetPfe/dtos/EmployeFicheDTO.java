package com.example.projetPfe.dtos;



import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EmployeFicheDTO {
     private Integer id;
    private String empyCod;
    private String empyCodpco;
    private String empyNom;
    private String empyPrn;
    private String empyNomjnf;
    private String empyNomcmp;
    private Integer empyGnr;
    private LocalDate empyDatnai;
    private String empyNumcin;
    private LocalDate empyDatcin;
    private Integer empyAtf;
    private String empyAdr;
    private String empyTel;
    private String empyEmail;
    private byte[] empyPhoto;
    private LocalDate empyDatent;
    private LocalDate empyDatrec;
    private LocalDate empyDattit;
    private LocalDate empyDatsit;
    private LocalDate empyDatstr;
    private LocalDate empyDatdebpos;
    private LocalDate empyDatfinpos;
    private LocalDate empyDatdebspo;
    private LocalDate empyFindebspo;
    private String empyCodpcd;
    private Integer empyTypdtc;
    private LocalDate empyDatdebrgt;
    private LocalDate empyDatfinrgt;
    private Integer empyTypctr;
    private String empyBadge;
    private LocalDate empyDatsfm;
    private Integer empyNbrenf;
    private Integer empyNbrenfses;
    private Integer empyNbrenfimp;
    private Integer empyNbrenfasg;
    private Integer empyChffam;
    private Integer empySlrunq;
    private Integer empyAlcfam;
    private Integer empyNumses;
    private LocalDate empyDatses;
    private Integer empyNumrss;
    private LocalDate empyDatdebrss;
    private LocalDate empyDatfinrss;
    private LocalDate empyDatdebhd;
    private LocalDate empyDatasgrp;
    private Integer empyAffasgcnj;
    private String empyNumasg;
    private Integer empyMntassgrprtr;
    private LocalDate empyDatgrs;
    private LocalDate empyDatcat;
    private LocalDate empyDatecl;
    private LocalDate empyDatecn;
    private LocalDate empyDatcrp;
    private LocalDate empyDatgrd;
    private LocalDate empyDatfiness;
    private LocalDate empyDatgrdtit;
    private LocalDate empyDatpst;
    private LocalDate empyDatpsttit;
    private LocalDate empyDatfct;
    private Integer empyMntrdsimp;
    private Integer empyMntinv;
    private LocalDate empyDatdebinv;
    private LocalDate empyDatfininv;
    private Integer pretMntasv;
    private LocalDate empyDatdebasv;
    private LocalDate empyDatfinasv;
    private LocalDate empyDatdebexoimp;
    private LocalDate empyDatfinexoimp;
    private Integer empyNbrepaircu;
    private Integer empyMnttpc;
    private Integer empyMntard;
    private Integer empyNbjddctit;
    private Integer empyNbjddcgrs;
    private Integer empyNbjddccat;
    private Integer empyNbjddcecl;
    private Integer empyNbjddcecn;
    private Integer empyNbjddccrp;
    private Integer empyNbjddcgrd;
    private Integer empyNbjddcfct;
    private Integer empyHorgrs;
    private String empyChmlib01;
    private String empyChmlib02;
    private String empyChmlib03;
    private String empyChmlib04;
    private String empyChmlib05;
    private String empyChmlib06;
    private String empyChmlib07;
    private String empyChmlib08;
    private String empyChmlib09;
    private String empyChmlib10;
    private String empyObs;
    private String empyStatut;
    private LocalDate empyDatfinasgrp;
}