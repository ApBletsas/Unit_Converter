package com.ab5121.bletsas5121;

import com.ab5121.bletsas5121.converters.BaseUnitConverter;
import com.ab5121.bletsas5121.converters.UnitTypeConverter;
import com.ab5121.bletsas5121.converters.Weight.WeightConverter;
import com.ab5121.bletsas5121.converters.lenght.LengthConverter;
import com.ab5121.bletsas5121.converters.volume.VolumeConverter;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.util.StringConverter;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class HelloController {
    @FXML
    private ComboBox<UnitTypeConverter> unitTypeMenu;
    @FXML
    private TextField leftTextField;
    @FXML
    private TextField rightTextField;
    @FXML
    private ComboBox<BaseUnitConverter> leftUnitMenu;
    @FXML
    private ComboBox<BaseUnitConverter> rightUnitMenu;

    private List<UnitTypeConverter> allUnitTypeConverters = Arrays.asList(
            new LengthConverter(),
            new VolumeConverter(),
            new WeightConverter()
    );

    @FXML
   public void initialize() {
    unitTypeMenu.getItems().addAll(allUnitTypeConverters);
    unitTypeMenu.getSelectionModel().selectFirst();
    unitTypeMenu.setConverter(new StringConverter<UnitTypeConverter>() {

        @Override
        public String toString(UnitTypeConverter unitTypeConverter) {
            return unitTypeConverter.getUnitType();
        }

        @Override
        public UnitTypeConverter fromString(String arg0) {
            return null;
        }
    });

    List<BaseUnitConverter> baseUnitConverters = unitTypeMenu.getValue().getBaseUnitConvertersList();
    leftUnitMenu.getItems().addAll(baseUnitConverters);
    rightUnitMenu.getItems().addAll(baseUnitConverters);

    leftUnitMenu.getSelectionModel().select(0);
    rightUnitMenu.getSelectionModel().select(1);

    StringConverter<BaseUnitConverter> baseUnitConverterStringConverter = new StringConverter<BaseUnitConverter>() {
        @Override
        public String toString(BaseUnitConverter baseUnitConverter) {
            return baseUnitConverter == null ? null : baseUnitConverter.getName();
        }

        @Override
        public BaseUnitConverter fromString(String arg0) {
            return null;
        }
    };
    leftUnitMenu.setConverter(baseUnitConverterStringConverter);
    rightUnitMenu.setConverter(baseUnitConverterStringConverter);

    }


    public void onRightUnitMenuChange(ActionEvent actionEvent) {
        convertLeftToRight();
    }

    public void onUnitTypeChange(ActionEvent actionEvent) {
        ObservableList<BaseUnitConverter> newBaseConverters = FXCollections.observableArrayList(unitTypeMenu.getValue().getBaseUnitConvertersList());

        leftTextField.setText("");
        rightTextField.setText("");

        leftUnitMenu.setItems(newBaseConverters);
        rightUnitMenu.setItems(newBaseConverters);

        leftUnitMenu.getSelectionModel().select(0);
        rightUnitMenu.getSelectionModel().select(1);

    }

    public void onLeftUnitMenuChange(ActionEvent actionEvent) {
        convertRightToLeft();
    }

    public void onLeftTextFieldChange(KeyEvent keyEvent) {
        convertLeftToRight();
    }

    public void onRightTextFieldChange(KeyEvent keyEvent) {
        convertRightToLeft();
    }

    private void convertLeftToRight(){
        if (leftTextField.getText().isBlank()){
            rightTextField.setText("");
        }else{
            UnitTypeConverter unitConverter = unitTypeMenu.getValue();
            BigDecimal leftUnit = new BigDecimal(Double.parseDouble((leftTextField.getText())));
            BigDecimal rightUnit = unitConverter.convert(leftUnit, leftUnitMenu.getValue(), rightUnitMenu.getValue());
            rightTextField.setText(rightUnit.stripTrailingZeros().toPlainString());
        }
    }

    private void convertRightToLeft(){
        if (rightTextField.getText().isBlank()){
            leftTextField.setText("");
        }else{
            UnitTypeConverter unitConverter = unitTypeMenu.getValue();
            BigDecimal rightUnit = new BigDecimal(Double.parseDouble((rightTextField.getText())));
            BigDecimal leftUnit = unitConverter.convert(rightUnit, rightUnitMenu.getValue(), leftUnitMenu.getValue());
            leftTextField.setText(leftUnit.stripTrailingZeros().toPlainString());
        }
    }

}

   

  

