package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField widthTextField;
    public TextField heightTextField;
    public TextField numOfPanel;
    double priceOfOneMetreJalousies;
    double priceOfOnePanel;
    double frstNum;
    double scndNum;
    double thirdNum;
    @FXML
    private Label lbOrder;
    @FXML
    private Label lbPrice;
    @FXML
    private Label lbCountOfJalousies;
    @FXML
    private Label lbPriceJalousies;
    @FXML
    private Label lbCountOfPanel;
    @FXML
    private Label lbPriceOfPanel;
    @FXML
    private Label lbResultText;
    @FXML
    private Label lbResult;


    private void initNumber() {
        priceOfOneMetreJalousies = 480;
        priceOfOnePanel = 200;
        frstNum = Integer.parseInt(widthTextField.getText());
        scndNum = Integer.parseInt(heightTextField.getText());
        thirdNum = Integer.parseInt(numOfPanel.getText());
    }

    public void getStart(ActionEvent actionEvent) throws Exception {
        initNumber();
        double areaOfJalousies = (frstNum * scndNum) / 1000;
        double totalPriceOfJalousies = priceOfOneMetreJalousies * areaOfJalousies;
        double totalPriceOfPanels = priceOfOnePanel * thirdNum;
        double totalPrice = totalPriceOfJalousies + totalPriceOfPanels;
        lbOrder.setText("Ваше замовлення:");
        lbPrice.setText("Ціна:");
        lbCountOfJalousies.setText(areaOfJalousies + " м.кв. жалюзі");
        lbPriceJalousies.setText(totalPriceOfJalousies + " $");
        if (numOfPanel.equals("")) {
            lbCountOfPanel.setText("");
            lbPriceOfPanel.setText("");
        } else {
            lbCountOfPanel.setText(thirdNum + " шт. панелей");
            lbPriceOfPanel.setText(totalPriceOfPanels + " $");
        }
        lbResultText.setText("Загальна вартість ");
        lbResult.setText(totalPrice + " $");
    }
}
