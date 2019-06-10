package com.dongmyo.test.jpa

import com.dongmyo.test.jpa.service.UserService
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.repository.query.QueryLookupStrategy
import java.util.*

@EnableJpaRepositories(queryLookupStrategy = QueryLookupStrategy.Key.USE_DECLARED_QUERY)
@SpringBootApplication
class KotlinJpaApplication {
    @Bean
    fun init(userService: UserService) = CommandLineRunner {
        userService.setUp()
        userService.getName()
    }

}

fun main(args: Array<String>) {
    runApplication<KotlinJpaApplication>(*args).use {
        // nothing
    }
}

