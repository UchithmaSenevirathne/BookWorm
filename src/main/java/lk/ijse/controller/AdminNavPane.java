package lk.ijse.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import lk.ijse.navigation.Navigation;

import java.io.IOException;

public class AdminNavPane {
    @FXML
    private AnchorPane admPane;

    @FXML
    private AnchorPane navPane;

    @FXML
    private Pane overDueDot;

    public void initialize(){
        loadDashboard();
        setVisibleOverDue();
    }

    private void setVisibleOverDue() {

    }

    private void loadDashboard() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AdmDash.fxml"));
        AnchorPane dashboard = null;
        try {
            dashboard = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        admPane.getChildren().setAll(dashboard);
    }

    @FXML
    void adminOnAction(MouseEvent event) {
        try {
            Navigation.navigate(Routes.ADMIN, admPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void bookOnAction(MouseEvent event) {
        try {
            Navigation.navigate(Routes.BOOK, admPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void borrowingOnAction(MouseEvent event) {
        try {
            Navigation.navigate(Routes.BORROWING, admPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void dashBoardOnAction(MouseEvent event) {
        try {
            Navigation.navigate(Routes.ADMDASHBOARD, admPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void logoutOnAction(MouseEvent event) {
        try {
            Navigation.navigate(Routes.LOGIN, navPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void OverDueOnAction(MouseEvent event) {
        try {
            Navigation.navigate(Routes.OVERDUE, admPane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
