## 코딩테스트 준비 with Programmers
![image](https://github.com/chihyeonwon/programmers/assets/58906858/d58901f4-e1ad-48b3-80b2-132f5de9fdac)

## 왜 코틀린으로 코테를?
흔히들 코딩테스트를 할때 사용하는 언어는 C++, Java, python 이 세언어를 뽑곤 한다. 각각의 언어는 특장점이 있는데,     
c++ 의 경우 문제 풀이에 많이 쓰이기도 하고, 속도면에서 좋아 진심으로 알고리즘을 풀어보려는 사람들이 주로 선택하곤 했다.      
JAVA의 경우 한국 취업시장에서 Spring 프레임워크의 인기에 힘입어 평소 개발에 쓰는 언어와 동일한 언어로 문제를 풀수 있고,     
문자열 같은 문제에서 정규식과 같은 함수를 이용하여 C++ 보다 더욱 빠르게 해결할수 있다.     
python의 경우 자바의 장점에서 코드가 간략하고 짧게 나와 장황하게 길어지는 자바의 단점을 보완할수 있다.     

원래 나는 코테에서 C++로 문제를 풀고 있었는데 내가 주력으로 사용하지 않는 언어를       
알고리즘 풀때만 사용하는것은 실용적인것을 원하는 나에게 맞지 않았고, 평소에 사용하는 언어이면서 알고리즘에 편한 언어를 찾기 시작했다.       

## 코틀린의 장점
- 첫째, 자바의 장황하고 긴 코드를 신규 문법 답게 간결하게 작성할수 있다.
- 둘째, 공부할때 JAVA로 만들어진 코드를 코틀린으로 옮기는것이 간단하기 때문에 인기 없는 언어의 단점을 극복 할수 있었다
- 셋째, 개인적으로 좋아하는 함수형 프로그래밍을 자연스럽게 사용이 가능하다.
- 넷째, 평소에 사용하던 언어라 익숙함이 커서 문법이 헷갈릴 염려도 좀 적었다.

## 코틀린 코테 테크닉
#### 입력
```kotlin
fun main() = with(System.`in`.bufferedReader()) {
	// 정수 하나 읽기
	val num = readLine().toInt()
    
	// 공백 기준으로 읽기
	val nums = readLine().split(" ").map { it.toInt() }
    
	// 문자열 을 char 배열로 받기
	val char = readLine().toCharArray
}
```
자바처럼 마찬가지로 속도상의 문제로 Scanner 클래스을 이용하는 대신 bufferedReader 를 사용한다.     
with 문으로 main 함수에서 bufferedReader의 함수들을 객체 생성 없이 가능하다.     
 
#### 출력
```kotlin
fun main() = with(System.`in`.bufferedReader()) {
	// 기본
	print("hello")
    
	// bufferedWriter
	val sout = BufferedWriter(OutputStreamWriter(System.out))
	sout.appendLine()
	sout.flush()
	sout.close();
    
    // 더 짧은 bufferedWriter
    val bw = System.out.bufferedWriter()
    
	//템플릿
	val s = "abc"
	println("$s.length is ${s.length}") // prints "abc.length is 3"
}
```
출력 역시 BufferedWriter 를 사용하거나 기본 출력을 이용한다.    
장황하던 System.out.println() 대한 print() 로 간단히 표현한다.     
템플릿을 이용하여 + 로 연결된 문자열을 간략히 표현 할수도 있다.     

## 자료구조
#### 배열
```kotlin
 val arr = intArrayOf(1, 2, 3) 
확장 함수로 배열 생성

val arr = IntArray(4) { it }
// 내용물을 전체 확인하는 코드
print(arr.contentToString()) // 결과 [0, 1, 2, 3]

val arr = IntArray(4) { it * 2}
// 내용물을 전체 확인하는 코드
print(arr.contentToString()) // 결과 [0, 2, 4, 6]
다차원 배열
val booleanArray = Array(n) {
	BooleanArray(m) { false }
}
booeleanArray[1][2] = true
처음 코틀린으로 다차원 배열을 만들려고하면 당황스럽고 어색할 수 있지만.
다차원 배열의 원리적으로 생각하는것이 간단했다.

val arr = Array(h) {
	Array(n) {
		readLine().split(" ").map { it.toInt() }.toIntArray()
	}
}
```

## 정수로 이루어진 3차원 배열 생성

#### 리스트
```kotlin
val list = listOf(1, 2, 3)
var list = listOf(1, 2, 3)
list = list + 4
print(list)
```
코틀린의 리스트는 불변객체이기 때문에 변경이 필요한 경우에는 가변 리스트를 이용하거나     
변수로 지정하고 변경하는 방식으로 이용한다.     

## 스택
코틀린에서 스택을 사용할때 자바에서 사용하던 것처럼 자바의 라이브러리를 가져와서 사용 할 수도 있지만.    
내장되어있는 가변리스트를 스택으로 사용할 수 있다.     
```kotlin
val numbers = mutableListOf(1, 2, 3, 4)
val stack = MutableList<Int>(4) { it }

// stack.push(5)
numbers.add(5)

// stack.pop()
numbers.removeLast()

// stack.peek()
numbers.last()

// 비어있는지 확인
numbers.isEmpty()

// 내용물이 있는지 확인
numbers.isNotEmpty()

//크기
numbers.size
```

## 큐
큐의 경우에도 스택과 비슷하게 별도의 클래스가 존재 하는것은 아니기 때문에    
배열 기반으로 작동하는 ArrayList 를 사용하는것은 비효율적이고    
LinkedList를 기져와서 이용하면 된다.     
```kotlin
val que = LinkedList<Int>()
que.offer(3)
que.poll()
que.peek()
```
## 데크
데크의 경우 큐에서 처럼 LinkedList 를 가져와서 사용 하려고 보면 속도가 잘 나오지 않는 경우가 있다.     
ArrayDeque 를 가져와서 이용하는것이 좋다.     
```kotlin
import kotlin.collections.ArrayDeque

val deque = ArrayDeque<Int>()

// 아래 함수들은 모두 first last 모두 가지고 있지만 생략
deque.addLast(1) // exception 반환
deque.offerFirst(2) // exception 반환 X

deque.removeFirst() // exception 반환
deque.pollLast() // exception 반환 X

deque.peekFirst()
deque.peekLast()
```
## 클래스
#### 데이터 클래스
```kotlin
data class Cheese(val x:Int, val y:Int, val time:Int)
```
위의 형태로 클래스를 생성하면 getter, setter, equals(), hashCode(), toString()를 자동으로 생성해 준다.    

## 자바 유틸 함수
```kotlin
import java.util.*
```
