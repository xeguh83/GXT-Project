package com.sencha.gxt.project.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface projectServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
