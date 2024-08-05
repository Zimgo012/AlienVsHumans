module org.zimgo.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.zimgo.aliensvshumans to javafx.fxml;
    exports org.zimgo.aliensvshumans;
}