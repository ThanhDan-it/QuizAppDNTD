module com.dntd.quizv1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dntd.quizv1 to javafx.fxml;
    exports com.dntd.quizv1;
}
