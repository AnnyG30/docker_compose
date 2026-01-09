package com.docker.DockerCompose;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
