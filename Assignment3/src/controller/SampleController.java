package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

public class SampleController {

    @FXML
    private Button btnBuy;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnRemove;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnSearch;

    @FXML
    private ComboBox<?> cbCategory1;

    @FXML
    private ListView<?> lvHome;

    @FXML
    private ToggleGroup rb1;

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
    private TextField tfAgeAppr;

    @FXML
    private TextField tfAvailCount;

    @FXML
    private TextField tfBrand;

    @FXML
    private TextField tfClass;

    @FXML
    private TextField tfDesigner;

    @FXML
    private TextField tfMaterial;

    @FXML
    private TextField tfMaxPlayers;

    @FXML
    private TextField tfMinPlayers;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfPrice;

    @FXML
    private TextField tfSN;

    @FXML
    private TextField tfSN1;

    @FXML
    private TextField tfSerNum;

    @FXML
    private TextField tfSize;

    @FXML
    private TextField tfType;

    @FXML
    private Text txtAgeAppr;

    @FXML
    private Text txtAnimal;

    @FXML
    private Text txtAvailCount;

    @FXML
    private Text txtBoardGame;

    @FXML
    private Text txtBrand;

    @FXML
    private Text txtCategory;

    @FXML
    private Text txtClass;

    @FXML
    private Text txtDesigner;

    @FXML
    private Text txtEnter;

    @FXML
    private Text txtEnterSN;

    @FXML
    private Text txtFig;

    @FXML
    private Text txtMaterial;

    @FXML
    private Text txtMaxPlayers;

    @FXML
    private Text txtMinPlayers;

    @FXML
    private Text txtName;

    @FXML
    private Text txtPrice;

    @FXML
    private Text txtPuzzle;

    @FXML
    private Text txtSN;

    @FXML
    private Text txtSN1;

    @FXML
    private Text txtSearch;

    @FXML
    private Text txtSerNun;

    @FXML
    private Text txtSize;

    @FXML
    private Text txtType;
    
    @FXML
    ComboBox<String> cbCategory = new ComboBox<>();
    @FXML
    void initialize() {
    cbCategory.getItems().addAll("Figure", "Animals", "Puzzle", "Board Game");
    }

    @FXML
    void btnBuyHandler(ActionEvent event) {

    }

    @FXML
    void btnClearHandler(ActionEvent event) {

    }

    @FXML
    void btnRemoveHandler(ActionEvent event) {

    }

    @FXML
    void btnSaveHandler(ActionEvent event) {

    }

    @FXML
    void btnSearchHandler(ActionEvent event) {

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

