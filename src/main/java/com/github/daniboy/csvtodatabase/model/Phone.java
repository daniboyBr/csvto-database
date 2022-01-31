package com.github.daniboy.csvtodatabase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "phones")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String coluna_0;
    private String coluna_1;
    private String coluna_2;
    private String coluna_3;
    private String coluna_4;
    private String coluna_5;
    private String coluna_6;
    private String coluna_7;
    private String coluna_8;
    private String coluna_9;
    private String coluna_10;
    private String coluna_11;
    private String coluna_12;
    private String coluna_13;
    private String coluna_14;
    private String coluna_15;
    private String coluna_16;
    private String coluna_17;
    private String coluna_18;
    private String coluna_19;
    private String coluna_20;
    private String coluna_21;
    private String coluna_22;
    private String coluna_23;
    private String coluna_24;
    private String coluna_25;
    private String coluna_26;
    private String coluna_27;
    private String coluna_28;
    private String coluna_29;
    private String coluna_30;
    private String coluna_31;
    private String coluna_32;
    private String coluna_33;
    private String coluna_34;
    private String coluna_35;
    private String coluna_36;
    private String coluna_37;
    private String coluna_38;
    private String coluna_39;
    private String coluna_40;

    public final static String[] fields() {
        String[] cols = { "coluna_0", "coluna_1", "coluna_2", "coluna_3", "coluna_4", "coluna_5", "coluna_6",
                "coluna_7", "coluna_8", "coluna_9", "coluna_10", "coluna_11", "coluna_12", "coluna_13", "coluna_14",
                "coluna_15", "coluna_16", "coluna_17", "coluna_18", "coluna_19", "coluna_20", "coluna_21", "coluna_22",
                "coluna_23", "coluna_24", "coluna_25", "coluna_26", "coluna_27", "coluna_28", "coluna_29", "coluna_30",
                "coluna_31", "coluna_32", "coluna_33", "coluna_34", "coluna_35", "coluna_36", "coluna_37", "coluna_38",
                "coluna_39", "coluna_40" };

        return cols;
    }

    public String getColuna_0() {
        return coluna_0;
    }

    public void setColuna_0(String coluna_0) {
        this.coluna_0 = coluna_0;
    }

    public String getColuna_1() {
        return coluna_1;
    }

    public void setColuna_1(String coluna_1) {
        this.coluna_1 = coluna_1;
    }

    public String getColuna_2() {
        return coluna_2;
    }

    public void setColuna_2(String coluna_2) {
        this.coluna_2 = coluna_2;
    }

    public String getColuna_3() {
        return coluna_3;
    }

    public void setColuna_3(String coluna_3) {
        this.coluna_3 = coluna_3;
    }

    public String getColuna_4() {
        return coluna_4;
    }

    public void setColuna_4(String coluna_4) {
        this.coluna_4 = coluna_4;
    }

    public String getColuna_5() {
        return coluna_5;
    }

    public void setColuna_5(String coluna_5) {
        this.coluna_5 = coluna_5;
    }

    public String getColuna_6() {
        return coluna_6;
    }

    public void setColuna_6(String coluna_6) {
        this.coluna_6 = coluna_6;
    }

    public String getColuna_7() {
        return coluna_7;
    }

    public void setColuna_7(String coluna_7) {
        this.coluna_7 = coluna_7;
    }

    public String getColuna_8() {
        return coluna_8;
    }

    public void setColuna_8(String coluna_8) {
        this.coluna_8 = coluna_8;
    }

    public String getColuna_9() {
        return coluna_9;
    }

    public void setColuna_9(String coluna_9) {
        this.coluna_9 = coluna_9;
    }

    public String getColuna_10() {
        return coluna_10;
    }

    public void setColuna_10(String coluna_10) {
        this.coluna_10 = coluna_10;
    }

    public String getColuna_11() {
        return coluna_11;
    }

    public void setColuna_11(String coluna_11) {
        this.coluna_11 = coluna_11;
    }

    public String getColuna_12() {
        return coluna_12;
    }

    public void setColuna_12(String coluna_12) {
        this.coluna_12 = coluna_12;
    }

    public String getColuna_13() {
        return coluna_13;
    }

    public void setColuna_13(String coluna_13) {
        this.coluna_13 = coluna_13;
    }

    public String getColuna_14() {
        return coluna_14;
    }

    public void setColuna_14(String coluna_14) {
        this.coluna_14 = coluna_14;
    }

    public String getColuna_15() {
        return coluna_15;
    }

    public void setColuna_15(String coluna_15) {
        this.coluna_15 = coluna_15;
    }

    public String getColuna_16() {
        return coluna_16;
    }

    public void setColuna_16(String coluna_16) {
        this.coluna_16 = coluna_16;
    }

    public String getColuna_17() {
        return coluna_17;
    }

    public void setColuna_17(String coluna_17) {
        this.coluna_17 = coluna_17;
    }

    public String getColuna_18() {
        return coluna_18;
    }

    public void setColuna_18(String coluna_18) {
        this.coluna_18 = coluna_18;
    }

    public String getColuna_19() {
        return coluna_19;
    }

    public void setColuna_19(String coluna_19) {
        this.coluna_19 = coluna_19;
    }

    public String getColuna_20() {
        return coluna_20;
    }

    public void setColuna_20(String coluna_20) {
        this.coluna_20 = coluna_20;
    }

    public String getColuna_21() {
        return coluna_21;
    }

    public void setColuna_21(String coluna_21) {
        this.coluna_21 = coluna_21;
    }

    public String getColuna_22() {
        return coluna_22;
    }

    public void setColuna_22(String coluna_22) {
        this.coluna_22 = coluna_22;
    }

    public String getColuna_23() {
        return coluna_23;
    }

    public void setColuna_23(String coluna_23) {
        this.coluna_23 = coluna_23;
    }

    public String getColuna_24() {
        return coluna_24;
    }

    public void setColuna_24(String coluna_24) {
        this.coluna_24 = coluna_24;
    }

    public String getColuna_25() {
        return coluna_25;
    }

    public void setColuna_25(String coluna_25) {
        this.coluna_25 = coluna_25;
    }

    public String getColuna_26() {
        return coluna_26;
    }

    public void setColuna_26(String coluna_26) {
        this.coluna_26 = coluna_26;
    }

    public String getColuna_27() {
        return coluna_27;
    }

    public void setColuna_27(String coluna_27) {
        this.coluna_27 = coluna_27;
    }

    public String getColuna_28() {
        return coluna_28;
    }

    public void setColuna_28(String coluna_28) {
        this.coluna_28 = coluna_28;
    }

    public String getColuna_29() {
        return coluna_29;
    }

    public void setColuna_29(String coluna_29) {
        this.coluna_29 = coluna_29;
    }

    public String getColuna_30() {
        return coluna_30;
    }

    public void setColuna_30(String coluna_30) {
        this.coluna_30 = coluna_30;
    }

    public String getColuna_31() {
        return coluna_31;
    }

    public void setColuna_31(String coluna_31) {
        this.coluna_31 = coluna_31;
    }

    public String getColuna_32() {
        return coluna_32;
    }

    public void setColuna_32(String coluna_32) {
        this.coluna_32 = coluna_32;
    }

    public String getColuna_33() {
        return coluna_33;
    }

    public void setColuna_33(String coluna_33) {
        this.coluna_33 = coluna_33;
    }

    public String getColuna_34() {
        return coluna_34;
    }

    public void setColuna_34(String coluna_34) {
        this.coluna_34 = coluna_34;
    }

    public String getColuna_35() {
        return coluna_35;
    }

    public void setColuna_35(String coluna_35) {
        this.coluna_35 = coluna_35;
    }

    public String getColuna_36() {
        return coluna_36;
    }

    public void setColuna_36(String coluna_36) {
        this.coluna_36 = coluna_36;
    }

    public String getColuna_37() {
        return coluna_37;
    }

    public void setColuna_37(String coluna_37) {
        this.coluna_37 = coluna_37;
    }

    public String getColuna_38() {
        return coluna_38;
    }

    public void setColuna_38(String coluna_38) {
        this.coluna_38 = coluna_38;
    }

    public String getColuna_39() {
        return coluna_39;
    }

    public void setColuna_39(String coluna_39) {
        this.coluna_39 = coluna_39;
    }

    public String getColuna_40() {
        return coluna_40;
    }

    public void setColuna_40(String coluna_40) {
        this.coluna_40 = coluna_40;
    }

}
