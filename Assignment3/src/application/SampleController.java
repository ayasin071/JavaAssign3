package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SampleController {
	

    @FXML
    private Button btnClear;

    @FXML
    private Button btnSearch;

    @FXML
    private RadioButton rbName;

    @FXML
    private RadioButton rbSerNum;

    @FXML
    private RadioButton rbType;

    @FXML
    private Tab tabAddToy;

    @FXML
    private Tab tabHome;

    @FXML
    private Tab tabRemToy;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfSerNum;

    @FXML
    private TextField tfType;

    @FXML
    private Text txtName;

    @FXML
    private Text txtSearch;

    @FXML
    private Text txtSerNun;

    @FXML
    private Text txtType;
    @FXML
    ComboBox<String> cbCategory = new ComboBox<>();
   
    @FXML
    void initialize() {
        cbCategory.getItems().addAll("Figure", "Animals", "Puzzle", "Board Game");
    }

    @FXML
    void rbNameHandler(ActionEvent event) {

    }

    @FXML
    void rbSerHandler(ActionEvent event) {

    }

    @FXML
    void rbTypeHandler(ActionEvent event) {

    }


}
