package iesteis.javafxjacksonrickmorty.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import iesteis.javafxjacksonrickmorty.model.Character;
import iesteis.javafxjacksonrickmorty.model.Response;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CharacterController implements Initializable {

    private String finalURL = "https://rickandmortyapi.com/api/character/?name=";
    @FXML
    private Button search;

    @FXML
    private TextField name;

    @FXML
    private Label statusResult;

    @FXML
    private ImageView characterImage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name.setText("nombre del personaje");
    }

    public void setName(ActionEvent actionEvent) {
        try {
            URL jsonURL = new URL(finalURL + name.getText());

            ObjectMapper objectMapper = new ObjectMapper();

            Response response = objectMapper.readValue(jsonURL, Response.class);
            response.getResults().stream().forEach(System.out::println);
            Character firstCharacter = response.getResults().get(0);
            statusResult.setText(String.valueOf(firstCharacter.getStatus()));
            Image image = new Image(firstCharacter.getImage(),true);
            characterImage.setImage(image);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
