package com.example.fish;

/** For the context of this login portion, the following are the usernames and passwords to properly login:
 * Username   ||   Password
 * ========================
 * UserAdmin  ||   pass1234
 * GuestUser  ||   Passw0rd
 * UserKey    ||   qwerty321
 * **/

import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.io.IOException;


public class LoginController {
    @FXML
    private Label prompt;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    private final String[][] users = {
            {"UserAdmin", "pass1234"},
            {"GuestUser", "Passw0rd"},
            {"UserKey", "qwerty321"}
    };

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        FishApp app = new FishApp();
        String user = username.getText().toString();
        String pass = password.getText().toString();

        boolean loggedIn = false;

        for (String[] userPass : users) {
            if (userPass[0].equals(user) && userPass[1].equals(pass)) {
                loggedIn = true;
                break;
            }
        }

        if (loggedIn) {
            prompt.setText("Login SUCCESS! Access Granted ...");
            prompt.setTextFill(Color.rgb(82, 255, 195));
            PauseTransition pause = new PauseTransition(Duration.seconds(1));
            pause.setOnFinished(e -> {
                try {
                    app.changeScene("Main.fxml");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            pause.play();
        } else if (user.isEmpty() || pass.isEmpty()) {
            prompt.setText("Enter your username & password!");
            prompt.setTextFill(Color.rgb(255, 101, 93));
        } else {
            prompt.setText("Wrong Username or Password!");
            prompt.setTextFill(Color.rgb(255, 101, 93));
        }
    }

    @FXML
    private void onExit(ActionEvent e) {
        Platform.exit();
    }
}
