package janhomola.com.mylibrary

class UtilTest {

	companion object {

		fun printTest() = "test"
		fun printTest2() = "test2"
	}

	class SomeOtherUtil(val a: Int,
						val b: Int) {

		fun calculate() = a + b * a - b
	}
}