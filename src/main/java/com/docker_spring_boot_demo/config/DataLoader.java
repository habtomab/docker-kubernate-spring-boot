package com.docker_spring_boot_demo.config;


import com.docker_spring_boot_demo.entity.Project;
import com.docker_spring_boot_demo.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(ProjectRepository projectRepository) {
        return args -> {
            projectRepository.save(new Project("Inventory System", "Track warehouse items", "In Progress"));
            projectRepository.save(new Project("Billing App", "Handles invoices and payments", "Completed"));
            projectRepository.save(new Project("CRM Platform", "Manages customer relationships", "Pending"));
            projectRepository.save(new Project("E-Commerce Website", "Online product sales", "In Progress"));
            projectRepository.save(new Project("HR Management", "Employee records and payroll", "On Hold"));
        };
    }
}

