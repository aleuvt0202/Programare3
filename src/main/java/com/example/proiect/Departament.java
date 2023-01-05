package com.example.proiect;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.util.Callback;

import javax.swing.table.TableColumn;
import java.sql.*;

public class Departament {
    String dept, locatie;
    int deptNr;
    private ObservableList<ObservableList> data;

    public Departament(){};

    public Departament(String dept, String locatie, int deptNr) {
        this.dept = dept;
        this.locatie = locatie;
        this.deptNr = deptNr;
    }


    @Override
    public String toString() {
        return "Departament[" +
                "dept='" + dept + '\'' +
                ", locatie='" + locatie + '\'' +
                ", deptNr=" + deptNr +
                ']';
    }
}
