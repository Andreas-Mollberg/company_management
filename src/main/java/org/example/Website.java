package org.example;

public class Website {
    private boolean isWorking;
    public Website(Boolean working) {
        this.isWorking = working;
    }

    public void fix(Website website){
        website.isWorking = true;
    }

    public boolean isWorking() {
        return isWorking;
    }
    
}
