package com.myproject.core.core.servlets;


import jdk.nashorn.internal.objects.annotations.Property;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Path;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;

import java.io.IOException;
import java.io.PrintWriter;

@Component(service = CustomServlet.class,
        property = {
                Constants.SERVICE_DESCRIPTION + "=Simple Demo Servlet",
                "sling.servlet.methods=" + HttpConstants.METHOD_GET,
                "sling.servlet.paths="+ "/bin/mydata"
        })
public class CustomServlet extends SlingAllMethodsServlet {
//
//    @Override
//    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
//        // Make your external API call here
//        String apiResponse = makeApiCall();
//        // Set response content type to JSON
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//
//        // Write the API response to the output stream
//        PrintWriter out = response.getWriter();
//        out.print(apiResponse);
//        out.flush();
//    }
//
//    private String makeApiCall() {
//        HttpClient httpClient = HttpClients.createDefault();
//        HttpGet getRequest = new HttpGet("http://api.example.com/data");
//        return getRequest.toString();
//    }
}
