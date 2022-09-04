package com.healthsafe.app.provisioningservice;

import java.util.Arrays;
import java.util.List;

public class CodeGenerator {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("PRTL_MSG_RSN_MAP_ID",
                "PRTL_ID",
                "ENBL_DSBL_MSG_ID",
                "RSN_TYP_CD",
                "CREAT_BY",
                "CREAT_TS",
                "UPDT_BY",
                "UPDT_TS");

        list.stream().forEach(ele->{
            System.out.println("@Column(name=\"" + ele + "\")");
            System.out.println("private String " + ele + ";");
            System.out.println();
        });;

    }
}
