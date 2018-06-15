package com.mpl.cucumber.stepdefs;

import com.mpl.JHipsterJxApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JHipsterJxApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
