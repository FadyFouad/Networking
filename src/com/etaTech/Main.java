package com.etaTech;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------HIgh Level API---------------------\n");
        try {
            URI uri = new URI("http://username:password@myserver.com:5000/catalogue/phones?os=android#Huawei");
            System.out.println("Scheme = " + uri.getScheme());
            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
            System.out.println("Authority = " + uri.getAuthority());
            System.out.println("User info = " + uri.getUserInfo());
            System.out.println("Host = " + uri.getHost());
            System.out.println("Port = " + uri.getPort());
            System.out.println("Path = " + uri.getPath());
            System.out.println("Query = " + uri.getQuery());
            System.out.println("Fragment = " + uri.getFragment());

        } catch(URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        }
    }
}
