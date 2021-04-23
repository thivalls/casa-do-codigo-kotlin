package zup.com.cdc

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("zup.com.cdc")
		.start()
}

