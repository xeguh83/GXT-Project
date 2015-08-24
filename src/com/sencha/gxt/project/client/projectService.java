package com.sencha.gxt.project.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("projectService")
public interface projectService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use projectService.App.getInstance() to access static instance of projectServiceAsync
     */
    public static class App {
        private static projectServiceAsync ourInstance = GWT.create(projectService.class);

        public static synchronized projectServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
