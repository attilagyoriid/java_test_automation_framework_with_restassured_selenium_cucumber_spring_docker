package com.coding.challenge.selenium.framework.context;

import com.coding.challenge.selenium.framework.annotation.LazyConfiguration;
import com.coding.challenge.selenium.framework.annotation.ThreadScopeBean;
import io.restassured.response.Response;

//ToDo create more comprehensive context

@LazyConfiguration
public class CucumberContext {

    @ThreadScopeBean
    public ContextContainer<Response> getContextContainerResponse() {
        return new ContextContainer<>();
    }

    @ThreadScopeBean
    public ContextContainer<String> getContextContainerString() {
        return new ContextContainer<>();
    }

    @ThreadScopeBean
    public ContextContainer<Integer> getContextContainerInt() {
        return new ContextContainer<>();
    }
}
