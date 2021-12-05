fun main() {
	val data = readFile("day1.txt")
	val pairs = data.trimEnd().split("\n").zipWithNext().toMap()
	val result = pairs.count { a ->
		return@count a.key == a.value
	}
	
	pairs.forEach { println("key=${it.key}, value=${it.value}") }
	
	println(result)
}
