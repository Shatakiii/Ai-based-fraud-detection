package com.fraud.oop;

public class SimpleDetector implements Detector {

    @Override
    public boolean detectFraud(Transaction t) {
        // Very simple rule for Review 1 (just to show OOP structure)
        return t.getAmount() > 50000;
    }
}
