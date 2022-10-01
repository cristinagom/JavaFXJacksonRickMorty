module iesteis.javafxjacksonrickmorty {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;

    opens iesteis.javafxjacksonrickmorty to javafx.fxml;
    exports iesteis.javafxjacksonrickmorty;

    exports iesteis.javafxjacksonrickmorty.model;
    opens iesteis.javafxjacksonrickmorty.model;

    exports iesteis.javafxjacksonrickmorty.controller;
    opens iesteis.javafxjacksonrickmorty.controller to javafx.fxml;
}