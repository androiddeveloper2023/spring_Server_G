package com.example.springServers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class SpringServersApplication

fun main(args: Array<String>) {
	runApplication<SpringServersApplication>(*args)
}
