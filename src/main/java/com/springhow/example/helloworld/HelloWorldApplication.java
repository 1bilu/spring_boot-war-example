package com.springhow.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloWorldApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class);
    }


    @RequestMapping("/")
    String helloWorld() {
        return "Hi, I'm Bilal khan
A DevOps Engineer with expertise in building and maintaining scalable and efficient infrastructures.

About Me
I am a DevOps Engineer with a passion for building, testing, and maintaining efficient and scalable infrastructures. With experience in various DevOps tools, I am committed to delivering the best service and support for my clients.

Skills
Cloud Providers: AWS, Azure, GCP
Automation Tools: Terraform, CloudFormation, Ansible, Packer
CI/CD Tools: Jenkins, CircleCI, TravisCI, GitHub Actions
Databases: MySQL, MongoDB, PostgreSQL, DynamoDB
Containerization: Docker, Kubernetes, Docker Swarm
Scripting: Bash, Python, Ruby, PowerShell
Monitoring and Logging: Grafana, Prometheus, ELK, CloudWatch ";
    }

}
