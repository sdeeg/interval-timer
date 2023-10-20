package us.planet10.intervaltrainerservice

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestIntervalTrainerServiceApplication

fun main(args: Array<String>) {
	fromApplication<IntervalTrainerServiceApplication>().with(TestIntervalTrainerServiceApplication::class).run(*args)
}
