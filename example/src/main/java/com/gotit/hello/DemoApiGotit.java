package com.gotit.hello;

import com.gotit.hello.config.AppConfig;
import java.io.IOException;

/**
 * Demo API for GotIt API integration
 * This class serves as the main entry point for the API server
 */
public class DemoApiGotit {
    public static void main(String[] args) {
        try {
            // Create and start the server
            RouteHandler routeHandler = new RouteHandler(AppConfig.API_BASE_PATH, AppConfig.X_GI_AUTHORIZATION);
            routeHandler.start();

            // Keep the server running
            System.out.println("Server is running. Press Ctrl+C to stop.");
            while (true) {
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            System.exit(1);
        }
    }
} 