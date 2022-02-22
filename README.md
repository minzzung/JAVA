# 📌Java
<details>

<summary> Java 기본 구조 </summary>
<div markdown="1">

## ✏Java 기본 구조


### ◽ 클래스
   - 자바 프로그램은 클래스 안에 프로그램을 작성한다.

   
### ◽ 메서드
   - 클래스의 멤버 함수
   
   
#### - main()메서드 
   - 자바 프로그램이 실행을 시작하는 곳이다
   - 한 클래스에 하나만 작성한다
   
   
### ◽ 문장
   - 컴퓨터에게 실행하도록 하는 명령문
   - 문장의 끝에는 ;(세미콜론을 붙인다.)
   
   
### ◽ 주석
   - 컴파일러가 명령으로 인지하지 않는 문장이다
   - /*여러줄 주석*/(설정 : ctrl+shift+'/' , 해제 : ctrl+shift+'\')
   - //한 줄 주석
   
   
#### System.out.println()
   - 화면에 출력 후 다음 줄로 이동한다.
   
   
#### System.out.print()
   - 화면에 출력 후 다음 줄로 이동하지 않는다.
   
   
```JAVA
   public class Printtenst{
      public static void main(String[] args){
         System.out.println("김민동");
         System.out.print("와라ㅏ");
         System.out.println("Java")
      }
   }
```


</div>
</details>


<details>

<summary>JAVA의 기본 프로그래밍(식별자/변수/상수/연산자)</summary>
<div markdown="1">

## ✏ JAVA의 기본 프로그래밍(1)


### ◽ 식별자
### ◽ 변수
   - 데이터를 저장하고 사용하기 위해 이름을 붙인 메모리 공간
```JAVA   
   자료형(type) 변수이름;   
```
  - 변수를 선언할 때 초기값을 정할 수 있다.
```JAVA   
   자료형(type) 변수이름 = 초기값;
```
#### 예시
   
### ◽ 상수
### ◽ 연산자

</div>
</details>

<details>
<summary>JAVA의 기본 프로그래밍(조건문/반복분/배열)</summary>
<div markdown="1">

## ⚪JAVA의 기본 프로그래밍(2)

### ◽ 조건문
### ◽ 반복문
### ◽ 배열

</div>
</details>

<details>
<summary>클래스와 객체</summary>
<div markdown="1">

## ⚪클래스와 객체

### ◽ 객체지향 프로그래밍
#### - 프로그램을 실제세상에 가깝게 모델링한다.
#### - 컴퓨터가 수행하는 작업을 객체들간의 상호작용으로 표현한다.
#### - 클래스 혹은 객체들의 집합으로 프로그램을 작성한다.

#### 1) 캡슐화
   - 데이터와 관련된 함수를 하나로 결합
   - 데이터를 외부로부터 숨긴다(보호 보안, 접근제어)
#### 2) 상속
   - 상속 트리는 다양한 사물을 체계적으로 분류한다.
   - 상위 클래스의 특성을 하위 클래스가 물려받는다.
#### 3) 다형성

</div>
</details>

<details>
<summary>상속의 이해</summary>
<div markdown="1">
   
## ✏ 상속
###   : 상위 클래스의 특성(멤버 변수/메소드)을 하위 클래스에 물려주는 것
   
#### 
     - 특성을 물려주는 상위클래스 (부모 클래스/수퍼클래스/기본 클래스)
     - 특성을 물려받는 하위 클래스 (자식 클래스/서브클래스/파생 클래스)
#####   
      * 자식은 부모클래스에 자신만의 특성(필드, 메소드)를 추가할 수 있다
      * 오버라이딩 : 자식은 부모클래스의 특성을 수정할 수 있다. 
##### * 상속의 필요성

 
#### 👉 클래스 상속과 객체
   
##### - 상속선언
 ``` JAVA
   public class Person{
   }
   public class Student extends Person { // Person을 상속받는 클래스 Student 선언
   }
   public class StudentWorker extends Person { // Student을 상속받는 클래스 StudentWorker 선언
   }
 ```    

##### - 자바 상속의 특징
   ######
   - 다중 상속을 지원하지 않는다.(ex: class A extends B,C(X))
   - 상속의 최상위 조상 클래스는 java.lang.*패키지의 Object 클래스이다.
#### 👉 멤버의 상속
   - 멤버의 상속

   - 부모와 자식이 같은 패키지에 있는 경우
  
   - 부모와 자식이 다른 패키지에 있는 경우
 

   
#### 👉 상속과생성자
   - 자식 클래스의 객체가 생성될 때
   ##### 
      1) 부모의 멤버변수와 자식의 멤버변수 모두 초기화 해야하므로 부모의 생성자 자식의 생성자 모두 실행한다.
      2) 자식클래스의 생성자가 먼저 호출되나, 부모가 있으면 부모의 생성자부터 먼저 실행한다.
   ###### - 생성자 호출 순서 및 실행 순서

#### 👉 객체의 타입 변환 
   
   - 업캐스팅 : 자식클래스의 객체를 부모 클래스 레퍼런스로 가리킨다.   
     ( 객체의 모든 멤버를 접근할 수 없고 부모 클래스 멤버에서만 접근이 가능하다.)
   
#####  - Person을 상속받아 Student 선언 
 ``` JAVA
   class Person{
   }
   class Student extends Person{
   }
   .....
   
   STudent s = new Student();
   Person p = s; // 업캐스팅, 자동 타입변환
 ```   

###
   - 다운캐스팅 : 부모 클래스 레퍼런스로 가리키던 자식 객체를 원래대로 자식 클래스 레퍼런스가 가리키도록 하는 것이다.    
    ( 명시적으로 타입을 지정하고 객체의 모든 멤버에 접근이 가능하다. )  
   
#####  - Person을 상속받아 Student 선언 
 ``` JAVA
   class Person{
   }
   class Student extends Person{
   }
   .....
   
   Person p = new Student();
   Student s = (Student)p; // 다운캐스팅, 강제타입변환
 ```   

 #### 👉 메소드 오버라이딩
   - 부모 클래스의 메소드를 자식 클래스에서 재정의 하는 것이다. 후엥엥ㅇ 

   ## 페이지 118 이 어 서~~
[김민정 바보](test10_2/src/test10_2/test10_2.java)
   
### 실습 문제 코드
</div>
</details>

<details>
<summary>예외 처리 및 입출력</summary>
<div markdown="1">


</div>
</details>


<details>
<summary>패키지</summary>
<div markdown="1">

</div>
</details>

<details>
<summary>제너릭과 컬렉션</summary>
<div markdown="1">

</div>
</details>

<details>
<summary>스레드와 멀티태스킹</summary>
<div markdown="1">

</div>
</details>

<details>
<summary>네트워크</summary>
<div markdown="1">

</div>
</details>

<details>
<summary>GUI 컴포넌트와 스윙</summary>
<div markdown="1">

</div>
</details>

<details>
<summary>이벤트 처리</summary>
<div markdown="1">

</div>
</details>

<details>
<summary>그래픽</summary>
<div markdown="1">

</div>
</details>
<!-- 실습문제 풀이하기 -->
<details>
<summary>실습 문제</summary>
<div markdown="1">

## 1. 입출력
### __실습 1-1__
#####
   * 키보드에서 영문자를 한 글자씩 입력 받아 소문자이면 대문자로, 대문자이면 소문자로 변환하여 출력하는 프로그램을 작성하시오. 
###### 
   참고 ) Scanner 의 next() 이용`  
   입력된 문자가 영문자가 아니면 "영문자가 아닙니다"를 출력하시오.  
##### 
   * CTRL-Z를 입력 받을 때까지 프로그램이 계속 동작하도록 하시오.  
###### 
   참고 ) Scanner의 next()가 실행 중일 때 CTRL-Z를 입력하면 오류 발생하므로, hasNext()로 입력이    있는지 문저 확인한 후 next호출
### 실습 2-2
##### 
   키보드로부터 정수 3개를 입력받고, 이 3개의 수로 삼각형을 만들 수 있는지를 판별하시오.
      만약 삼각형이 구성된다면 넓이를 계산하여 출력하시오.
######
   참고 1) 두 변의 합이
</div>
</details>
