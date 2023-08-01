package com.example.fish;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class QuizController {
    FishApp app = new FishApp();

    @FXML
    Label question;
    @FXML
    Button A;
    @FXML
    Button B;
    @FXML
    Button C;
    @FXML
    Button D;

    private String[][] questionsAndOptions = {
            // Question 1
            {
                    "What is the biggest fish in the world?",
                    "A. Blue Whale",
                    "B. Whale Shark",
                    "C. Goliath Grouper",
                    "D. Lionfish",
                    "B"
            },
            // Question 2
            {
                    "Which shark is the fastest shark in the world?",
                    "A. Great White Shark",
                    "B. Mako Shark",
                    "C. Tiger Shark",
                    "D. Bull Shark",
                    "B"
            },
            // Question 3
            {
                    "What is the biggest shark in the world?",
                    "A. Whale Shark",
                    "B. Great White Shark",
                    "C. Nurse Shark",
                    "D. Hammer Head Shark",
                    "B"
            },

            // Question 4
            {
                    "What kind of animal are Calimares made out of?",
                    "A. Octopus",
                    "B. Cuttlefish",
                    "C. Squid",
                    "D. Fish",
                    "C"
            },

            // Question 5
            {
                    "What percent of the World is covered in water?",
                    "A. 10",
                    "B. 30",
                    "C. 50",
                    "D. 70",
                    "D"
            },
            // Question 6
            {
                    "What marine animal kills the most people per year?",
                    "A. Rock Fish",
                    "B. Great White Shark",
                    "C. Box Jellyfish",
                    "D. Stingray",
                    "C"
            },
            // Question 7
            {
                    "What percent of the World is covered in water?",
                    "A. 10",
                    "B. 30",
                    "C. 50",
                    "D. 70",
                    "B"
            },
            // Question 8
            {
                    "What is the leading cause of Ocean Pollution Globally?",
                    "A. Industrial Waste",
                    "B. Radioactive Leakages",
                    "C. Oil Spills",
                    "D. Boat Fuel",
                    "A"
            },
            // Question 9
            {
                    "Which species of Octopus is the most poisonus?",
                    "A. Common Octopus",
                    "B. Mimic Octopus",
                    "C. Blue Ringed Octopus",
                    "D. Giant Pacific Octopus",
                    "C"
            },
            // Question 10
            {
                    "What is the most consumed fish in the world?",
                    "A. Salmon",
                    "B. Tuna",
                    "C. Lapu Lapu",
                    "D. Mackerel",
                    "B"
            },
    };

    private int currentQuestionIndex = 0;
    private int correctAnswers = 0;

    @FXML
    public void initialize() {
        // Display the first question on initialization
        displayQuestion(currentQuestionIndex);

        // Set event handlers for buttons
        A.setOnAction(event -> handleAnswer("A"));
        B.setOnAction(event -> handleAnswer("B"));
        C.setOnAction(event -> handleAnswer("C"));
        D.setOnAction(event -> handleAnswer("D"));
    }

    private void displayQuestion(int questionIndex) {
        String[] currentQuestion = questionsAndOptions[questionIndex];
        question.setText(currentQuestion[0]);
        A.setText(currentQuestion[1]);
        B.setText(currentQuestion[2]);
        C.setText(currentQuestion[3]);
        D.setText(currentQuestion[4]);
    }

    private void handleAnswer(String selectedOption) {
        String correctOption = questionsAndOptions[currentQuestionIndex][5];

        if (selectedOption.equals(correctOption)) {
            correctAnswers++;
        }

        // Move to the next question or show the result if all questions have been answered
        if (currentQuestionIndex < questionsAndOptions.length - 1) {
            currentQuestionIndex++;
            displayQuestion(currentQuestionIndex);
        } else {
            showResult();
        }
    }

    private void showResult() {
        try {
            // Load the quizfinish.fxml file and change the scene
            FXMLLoader fxmlLoader = app.changeScene("quizfinish.fxml");
            QuizFinishController quizFinishController = fxmlLoader.getController();

            // Pass the quiz result data to the quiz finish controller
            int totalQuestions = questionsAndOptions.length;
            quizFinishController.setCorrect(correctAnswers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void onBackButtonClick(ActionEvent e) throws IOException {
        app.changeScene("Main.fxml");
    }


}