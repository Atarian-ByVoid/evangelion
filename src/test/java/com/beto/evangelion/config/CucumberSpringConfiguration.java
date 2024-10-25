package com.beto.evangelion.config;

import org.springframework.boot.test.context.SpringBootTest;

import com.beto.evangelion.EvangelionApplication;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = EvangelionApplication.class) 
public class CucumberSpringConfiguration {
}

