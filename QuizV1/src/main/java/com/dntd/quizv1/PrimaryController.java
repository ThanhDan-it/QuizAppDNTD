package com.dntd.quizv1;

import com.dntd.uti.MyAlertSingleton;
import com.dntd.uti.themes.ThemeType;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;



public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeType> cbThemes;
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeType.values()));
    }
    
    public void manageQuestion(ActionEvent e){
        MyAlertSingleton.getInstance().showMeg("coming soon....");
    }
    
    public void practice(ActionEvent e){
        MyAlertSingleton.getInstance().showMeg("coming soon....");
    }
    
    public void exam(ActionEvent e){
        MyAlertSingleton.getInstance().showMeg("coming soon....");
    }

   
}
