package com.spc.d2p.springd2p

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestSpringD2pApplication

fun main(args: Array<String>) {
	fromApplication<SpringD2pApplication>().with(TestSpringD2pApplication::class).run(*args)
}
