package com.healthsafe.app.provisioningservice;

import java.util.Arrays;
import java.util.List;

public class CodeGenerator {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("MBR_PRTL_ID",
                "PRTL_ID",
                "MBR_PRTL_FST_NM",
                "MBR_PRTL_LST_NM",
                "MBR_PRTL_DOB",
                "MBR_PRTL_GDR",
                "MBR_PRTL_SBSCR_ID",
                "MBR_PRTL_POL_NBR",
                "MBR_PRTL_ADDR_LN_1_TXT",
                "MBR_PRTL_ADDR_LN_2_TXT",
                "MBR_PRTL_CTY_NM",
                "MBR_PRTL_ST_NM",
                "MBR_PRTL_ZIP_CD",
                "MBR_PRTL_SSN",
                "MBR_PRTL_ENCRP_SSN",
                "MBR_PRTL_SPC_MBR_ID",
                "PRVSN_MBR_ID",
                "MBR_STS_ID",
                "MBR_PRTL_ELIG_FAIL_DT",
                "MBR_PRTL_EFF_DT",
                "MBR_PRTL_EXPIR_DT",
                "CREAT_BY",
                "CREAT_TS",
                "UPDT_BY",
                "UPDT_TS",
                "MBR_PRTL_ELIGIBILITY_RESPONSE",
                "EXPIRE_TS");

        list.stream().forEach(ele->{
            System.out.println("@Column(name=\"" + ele + "\")");
            System.out.println("private String " + ele + ";");
            System.out.println();
        });;

    }
}
