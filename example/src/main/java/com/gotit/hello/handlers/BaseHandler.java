package com.gotit.hello.handlers;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import com.gotit.sdk.ApiClient;
import com.gotit.sdk.Configuration;
import com.gotit.sdk.ApiException;

import java.io.IOException;
import java.io.OutputStream;

public abstract class BaseHandler implements HttpHandler {
    protected final String apiBasePath;
    protected final String xGiAuthorization;

    public BaseHandler(String apiBasePath, String xGiAuthorization) {
        this.apiBasePath = apiBasePath;
        this.xGiAuthorization = xGiAuthorization;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response;
        try {
            response = processRequest(exchange);
        } catch (ApiException e) {
            System.out.println("API call failed: " + e.getMessage());
            e.printStackTrace();
            response = e.getResponseBody();
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
            e.printStackTrace();
            response = "{\"error\":\"" + e.getMessage() + "\"}";
        }

        sendResponse(exchange, response);
    }

    protected abstract String processRequest(HttpExchange exchange) throws ApiException, IOException;

    protected ApiClient createApiClient() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(apiBasePath);
        return defaultClient;
    }

    protected void sendResponse(HttpExchange exchange, String response) throws IOException {
        exchange.getResponseHeaders().set("Content-Type", "application/json");
        
        byte[] responseBytes = response.getBytes("UTF-8");
        exchange.sendResponseHeaders(200, responseBytes.length);
        
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(responseBytes);
        }
        System.out.println("Response sent");
    }
} 