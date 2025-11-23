package com.fraud;

import com.fraud.detector.*;
import com.fraud.collections.*;
import com.fraud.db.*;
import com.fraud.threads.*;

public class Main {
    public static void main(String[] args) {

        // --- OOP Demonstration ---
        FraudDetector detector = new BasicFraudDetector();

        TransactionManager txManager = new TransactionManager();
        AlertManager alertManager = new AlertManager();

       
        txManager.addTransaction(new Transaction(101, 5000.00));

       
        GenericResponse response = detector.detectFraud(
                new Transaction(101, 5000.00)
        );

        if (response.isFlagged()) {
            alertManager.createAlert(
                    new Alert("Suspicious activity detected!")
            );
        }

        // --- Multithreading + Sync Demo ---
        DetectionThread dt = new DetectionThread(detector);
        dt.start();

        // --- Database Layer Access ---
        UserDAO userDAO = new UserDAO();
        userDAO.getUserById(1);

        System.out.println("Fraud Detection System Structure Ready!");
    }
}
