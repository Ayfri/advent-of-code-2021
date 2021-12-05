fun getTxtFile(fileName: String) = (object : Any() {})::class.java.getResource(fileName).readText()
