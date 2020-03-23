package sample;


import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.util.Duration;
import java.text.DateFormat;
import java.text.SimpleDateFormat;



public class Controller{

    public String scenarioID;


   @FXML public Button submit;
   @FXML public MenuItem Gates;
   @FXML private Label TotalTime;

    public void StartHandler(){
        long endTime = System.currentTimeMillis();
        DateFormat timeFormat = new SimpleDateFormat( "HH:mm" );
        final Timeline timeline = new Timeline(
                new KeyFrame(
                        Duration.seconds(1),
                        event -> {
                            final long diff =  System.currentTimeMillis() - endTime ;
                            if ( diff < 0 ) {
                                //  timeLabel.setText( "00:00:00" );
                                TotalTime.setText( timeFormat.format( 0 ) );
                            } else {
                                TotalTime.setText( timeFormat.format( diff ) );
                            }
                        }
                )
        );
        timeline.setRate(12);
        timeline.setCycleCount( Animation.INDEFINITE );
        timeline.play();

    }
    public void LoadHandler() {
        //Popup Code
        final Stage primaryStage = null;
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(primaryStage);
        VBox dialogVbox = new VBox(20);
        dialogVbox.setSpacing(10);
        dialogVbox.setAlignment(Pos.CENTER);
        Button submit = new Button("Submit");
        Label label = new Label("Insert Scenario ID");
        TextField loadtext = new TextField();
        loadtext.setMaxWidth(100);
        submit.setAlignment(Pos.CENTER);
        submit.setMaxSize(100, 100);
        submit.setOnAction(arg0 -> { scenarioID = loadtext.getText();
            System.out.println(scenarioID);
            dialog.close();});
        dialogVbox.getChildren().addAll(label, loadtext, submit);
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialog.setScene(dialogScene);
        dialog.show();


    }
    public void ExitHandler() {
        System.exit(0);
    }

    //Details Menu Items
    public void GatesHandler() {
        //Popup Code
        final Stage primaryStage = null;
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(primaryStage);
        VBox dialogVbox = new VBox(20);
        dialogVbox.getChildren();
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialog.setScene(dialogScene);
        dialog.show();


    }
    public void FlightHandler() {
        final Stage primaryStage = null;
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(primaryStage);
        VBox dialogVbox = new VBox(20);
        dialogVbox.getChildren();
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialog.setScene(dialogScene);
        dialog.show();
    }
    public void HoldingHandler() {
        final Stage primaryStage = null;
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(primaryStage);
        VBox dialogVbox = new VBox(20);
        dialogVbox.getChildren();
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialog.setScene(dialogScene);
        dialog.show();
    }
    public void DelayedHandler() {
        final Stage primaryStage = null;
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(primaryStage);
        VBox dialogVbox = new VBox(20);
        dialogVbox.getChildren();
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialog.setScene(dialogScene);
        dialog.show();
    }
    public void NextDepartureHandler() {
        final Stage primaryStage = null;
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initOwner(primaryStage);
        VBox dialogVbox = new VBox(20);
        dialogVbox.getChildren();
        Scene dialogScene = new Scene(dialogVbox, 300, 200);
        dialog.setScene(dialogScene);
        dialog.show();
    }

    //Top Box Stuff

    //Flight Information I/O
    public void SubmitHandler() {
        //System.exit(0);
    }
}
