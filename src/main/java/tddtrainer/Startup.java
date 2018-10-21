package tddtrainer;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.stage.Stage;
import tddtrainer.guice.GuiceConfiguration;

public class Startup extends Application {

    private Injector injector;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        injector = Guice.createInjector(new GuiceConfiguration());
        Main main = injector.getInstance(Main.class);
        main.start(primaryStage);
    }
}
