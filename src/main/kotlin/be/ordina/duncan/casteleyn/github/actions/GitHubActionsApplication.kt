package be.ordina.duncan.casteleyn.github.actions

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitHubActionsApplication

fun main(args: Array<String>) {
    runApplication<GitHubActionsApplication>(*args)
}
