package com.sencha.gxt.project.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.sencha.gxt.project.client.projectService;

public class projectServiceImpl extends RemoteServiceServlet implements projectService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}