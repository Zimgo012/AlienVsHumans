module org.zimgo.hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens org.zimgo.aliensvshumans to javafx.fxml;
    exports org.zimgo.aliensvshumans;
    exports org.zimgo.aliensvshumans.Controllers;
    opens org.zimgo.aliensvshumans.Controllers to javafx.fxml;
}