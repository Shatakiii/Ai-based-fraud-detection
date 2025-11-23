package fraud.management;

import java.util.ArrayList;

public class TransactionManager {

    private ArrayList<Transaction> transactions;

    public TransactionManager() {
        transactions = new ArrayList<>();
    }

    // Add a new transaction
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // Returns all stored transactions
    public ArrayList<Transaction> getAllTransactions() {
        return transactions;
    }

    // Get transactions of a specific user
    public ArrayList<Transaction> getTransactionsByUser(String userId) {
        ArrayList<Transaction> result = new ArrayList<>();

        for (Transaction t : transactions) {
            if (t.getUserId().equals(userId)) {
                result.add(t);
            }
        }

        return result;
    }

    // Simple method to print all transactions
    public void printAll() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
