package common;

import models.EnvironmentData;

import java.util.HashMap;

public final class TestConfig {
    public static HashMap<String, HashMap<String, String>> credentials;
    public static HashMap<String, String> urls;

    public static void initEnvironment(){
        EnvironmentData environmentData = new EnvironmentData();
        credentials = environmentData.credentials;
        urls = environmentData.urls;
    }

}
