package controller;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import model.Animals;
import model.BoardGames;
import model.Figures;
import model.Puzzles;
import model.Toy;

public class SampleController {
    StoreManager sm;
    ArrayList<Toy> selectedToys;
    int SelectedIndex = 0;
    @FXML
    private Button btnBuy;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnRemove;
    
    @FXML
    private Button btnSearchRemove;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnSearch;

    @FXML
    private ComboBox<?> cbCategory1;

    @FXML
    private ListView<String> lvHome;
    @FXML
    private ListView<String> lvRemove;

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
    private TextField tfNameSearch;

    @FXML
    private TextField tfPrice;

    @FXML
    private TextField tfSN;

    @FXML
    private TextField tfSerNum;
    
    @FXML
    private TextField tfType;
    
    @FXML
    private TextField tfName;

    @FXML
    private TextField tfSN1;

    @FXML
    private TextField tfSerNumSearch;

    @FXML
    private TextField tfSize;

    @FXML
    private TextField tfTypeSearch;

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
    void initialize(){
        cbCategory.getItems().addAll("Figure", "Animals", "Puzzle", "Board Game");
    }
    public SampleController(){
        
        try {
            sm = new StoreManager();
            sm.loadData();
        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
    
        }
        
        
    }

    @FXML
    void btnBuyHandler(ActionEvent event) {
        Toy selecteedToy = selectedToys.get(SelectedIndex);
        sm.purchaseToy(selecteedToy);
        sm.Save();
    }

    @FXML
    void btnClearHandler(ActionEvent event) {
        lvHome.getItems().clear();
        tfNameSearch.setText("");
        tfSerNumSearch.setText("");
        tfTypeSearch.setText("");
    }

    @FXML
    void btnRemoveHandler(ActionEvent event) {
        String sn = tfSN1.getText();
        sm.removeAToy(sn);
            sm.Save();
            lvRemove.getItems().add("Item Removed");
    }

    @FXML
    void btnSaveHandler(ActionEvent event) {

        String category = cbCategory.getValue();
        if (category == "Figure"){
            String sn = tfSN.getText();
            String name = tfName.getText();
            String brand = tfBrand.getText();
            String priceStr = tfPrice.getText();
            Double price = Double.parseDouble(priceStr);
            String avalablecountStr = tfAvailCount.getText();
            Integer avalablecount = Integer.parseInt(avalablecountStr);
            String ageappropriateStr = tfAgeAppr.getText();
            Integer ageappropriate = Integer.parseInt(ageappropriateStr);
            String classification = tfClass.getText();
            Toy t = new Figures(sn, name, brand, price , avalablecount, ageappropriate, classification);
            sm.addNewToy(t);
        }
        if (category == "Animals"){
            String sn = tfSN.getText();
            String name = tfName.getText();
            String brand = tfBrand.getText();
            String priceStr = tfPrice.getText();
            Double price = Double.parseDouble(priceStr);
            String avalablecountStr = tfAvailCount.getText();
            Integer avalablecount = Integer.parseInt(avalablecountStr);
            String ageappropriateStr = tfAgeAppr.getText();
            Integer ageappropriate = Integer.parseInt(ageappropriateStr);
            String material = tfMaterial.getText();
            String size = tfSize.getText();
            Toy t = new Animals(sn, name, brand, price , avalablecount, ageappropriate, material, size);
            sm.addNewToy(t);
        }
        if (category == "Puzzle"){
            String sn = tfSN.getText();
            String name = tfName.getText();
            String brand = tfBrand.getText();
            String priceStr = tfPrice.getText();
            Double price = Double.parseDouble(priceStr);
            String avalablecountStr = tfAvailCount.getText();
            Integer avalablecount = Integer.parseInt(avalablecountStr);
            String ageappropriateStr = tfAgeAppr.getText();
            Integer ageappropriate = Integer.parseInt(ageappropriateStr);
            String ptype = tfType.getText();
            Toy t = new Puzzles(sn, name, brand, price , avalablecount, ageappropriate, ptype);
            sm.addNewToy(t);
        }
        if (category == "Board Game"){
            String sn = tfSN.getText();
            String name = tfName.getText();
            String brand = tfBrand.getText();
            String priceStr = tfPrice.getText();
            Double price = Double.parseDouble(priceStr);
            String avalablecountStr = tfAvailCount.getText();
            Integer avalablecount = Integer.parseInt(avalablecountStr);
            String ageappropriateStr = tfAgeAppr.getText();
            Integer ageappropriate = Integer.parseInt(ageappropriateStr);
            String maxStr = tfMaxPlayers.getText();
            Integer max = Integer.parseInt(maxStr);
            String minStr = tfMinPlayers.getText();
            Integer min = Integer.parseInt(minStr);
            String designer = tfDesigner.getText();
            Toy t = new BoardGames(sn, name, brand, price , avalablecount, ageappropriate, max, min, designer );
            sm.addNewToy(t);
        }
        sm.Save();
    }

    @FXML
    void btnSearchHandler(ActionEvent event) {
        if (rbName.isSelected()){
            String name = tfNameSearch.getText();
            selectedToys = sm.searchByName(name);
        }else if 
        (rbSerNum.isSelected()){
            String SN = tfSerNumSearch.getText();
            selectedToys = sm.getToyBySerialNumber(SN);
        }else{
            String type = tfTypeSearch.getText();
            selectedToys = sm.ByType(type);
        }
        // adding toys to GUI list 
        lvHome.getItems().clear();
        for(int n=0; n<selectedToys.size(); n++){
			String s = String.format("(%d) %s\n",n +1 , selectedToys.get(n).formatToScreen());
            lvHome.getItems().add(s);
		}
    }

    @FXML
    void rbNameHandler(ActionEvent event) {
        System.out.print("1234");
    }

    @FXML
    void rbSerHandler(ActionEvent event) {
        System.out.print("1234");
    }

    @FXML
    void rbTypeHandler(ActionEvent event) {
        System.out.print("1234");
    }
    @FXML
    void lvHomeClickHandler(MouseEvent event) {
        SelectedIndex = lvHome.getSelectionModel().getSelectedIndex();	

    }
    @FXML
    void btnSearchRemoveHandler(ActionEvent event) {
        String SN = tfSN1.getText();
        selectedToys = sm.getToyBySerialNumber(SN);
        lvRemove.getItems().clear();
        for(int n=0; n<selectedToys.size(); n++){
			String s = String.format("(%d) %s\n",n +1 , selectedToys.get(n).formatToScreen());
            lvRemove.getItems().add(s);
		}
    }

}

