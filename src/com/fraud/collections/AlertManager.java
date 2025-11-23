package fraud.alerts;

import java.util.ArrayList;

public class AlertManager {

    private ArrayList<String> alerts;

    public AlertManager() {
        alerts = new ArrayList<>();
    }

    // Add a new alert message
    public void addAlert(String msg) {
        alerts.add(msg);
    }

    // Get all alerts
    public ArrayList<String> getAlerts() {
        return alerts;
    }

    // Print alerts
    public void printAlerts() {
        for (String a : alerts) {
            System.out.println("ALERT: " + a);
        }
    }
}
