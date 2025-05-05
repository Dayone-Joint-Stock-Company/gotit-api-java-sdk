package com.gotit.hello;

import com.sun.net.httpserver.HttpServer;
import com.gotit.hello.handlers.*;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class RouteHandler {
    private final HttpServer server;
    private final String apiBasePath;
    private final String xGiAuthorization;
    private static final int PORT = 5001;

    public RouteHandler(String apiBasePath, String xGiAuthorization) throws IOException {
        this.apiBasePath = apiBasePath;
        this.xGiAuthorization = xGiAuthorization;
        this.server = HttpServer.create(new InetSocketAddress(PORT), 0);
        this.server.setExecutor(Executors.newFixedThreadPool(10));
        setupRoutes();
    }

    private void setupRoutes() {
        // Brand routes
        server.createContext("/brands", new BrandsHandler(apiBasePath, xGiAuthorization));
        server.createContext("/brands/brand_product", new BrandProductHandler(apiBasePath, xGiAuthorization));
        
        // Category routes
        server.createContext("/categories", new CategoriesHandler(apiBasePath, xGiAuthorization));
        server.createContext("/categories/category_product", new CategoryProductHandler(apiBasePath, xGiAuthorization));
        
        // Product routes
        server.createContext("/products", new ProductsHandler(apiBasePath, xGiAuthorization));
        
        // Voucher routes
        server.createContext("/vouchers/e", new VoucherEHandler(apiBasePath, xGiAuthorization));
        server.createContext("/vouchers/v", new VoucherVHandler(apiBasePath, xGiAuthorization));
        server.createContext("/vouchers/g", new VoucherGHandler(apiBasePath, xGiAuthorization));
        server.createContext("/vouchers/send_sms", new VoucherSendSmsHandler(apiBasePath, xGiAuthorization));
        server.createContext("/vouchers/send_email", new VoucherSendEmailHandler(apiBasePath, xGiAuthorization));
        server.createContext("/vouchers/send_zns", new VoucherSendZnsHandler(apiBasePath, xGiAuthorization));
        server.createContext("/vouchers/check_zns", new VoucherCheckZnsHandler(apiBasePath, xGiAuthorization));
        server.createContext("/vouchers/check_status_voucher", new VoucherStatusHandler(apiBasePath, xGiAuthorization));
    }

    public void start() {
        server.start();
        System.out.println("Server started on port " + PORT);
    }

    public void stop() {
        server.stop(0);
        System.out.println("Server stopped");
    }

    // Helper method to extract ID from path
    private int extractIdFromPath(String path) {
        String[] parts = path.split("/");
        return Integer.parseInt(parts[parts.length - 1]);
    }

    // Method to handle dynamic routes with IDs
    public void handleDynamicRoutes(String path, HttpServer server) {
        if (path.startsWith("/brands/")) {
            int brandId = extractIdFromPath(path);
            server.createContext(path, new BrandDetailHandler(apiBasePath, xGiAuthorization, brandId));
        } else if (path.startsWith("/products/")) {
            int productId = extractIdFromPath(path);
            if (path.endsWith("/stores")) {
                server.createContext(path, new ProductStoreHandler(apiBasePath, xGiAuthorization, productId));
            } else {
                server.createContext(path, new ProductDetailHandler(apiBasePath, xGiAuthorization, productId));
            }
        }
    }
} 