package net.hkp.jhipster.cucumber.stepdefs;

import net.hkp.jhipster.JhipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
