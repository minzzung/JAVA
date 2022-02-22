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

## 실습 1. 입출력
### __실습 1-1__
#####
   키보드에서 영문자를 한 글자씩 입력 받아 소문자이면 대문자로, 대문자이면 소문자로 변환하여 출력하는 프로그램을 작성하시오. 
###### 
   `참고 ) Scanner 의 next() 이용`    

   입력된 문자가 영문자가 아니면 "영문자가 아닙니다"를 출력하시오.  
##### 
   CTRL-Z를 입력 받을 때까지 프로그램이 계속 동작하도록 하시오.  
###### 
   `참고 ) Scanner의 next()가 실행 중일 때 CTRL-Z를 입력하면 오류 발생하므로, hasNext()로 입력이    있는지 문저 확인한 후 next호출`
### __실습 1-2__
##### 
   키보드로부터 정수 3개를 입력받고, 이 3개의 수로 삼각형을 만들 수 있는지를 판별하시오.
   만약 삼각형이 구성된다면 넓이를 계산하여 출력하시오.
   
   `참고 1) 두 변의 합이 나머지 한 변의 합보다 크면 삼각형 구성 가능`   
   `참고 2) 세 변의 길이 (a,b,c)로 부터 삼각형의 넓이를 계산하는 공식(헤론의 공식)`   
   `사진첨부`
   `참고 3) Math class 의 sqrt() method 사용`   

## 실습 2. 조건문과 반복문
### __실습 2-1__
#####
   다음과 같은 내용이 출력되도록 printMultTable(int high) 메소드를 구현하시오.
   ```JAVA
   public static void main (String[] args) {
      printMultTable(7);
   }
   1
   2 4
   3 5 6
   4 8 12 16
   5 10 15 20 25
   6 12 18 24 30 36
   7 14 21 28 35 42 49
   ``` 

### __실습 2-2__
##### 
   다음 조건에 따라 주어진 모양을 출력하시오
######
   - 키보드로부터 height(높이)를 나타내는 정수값을 입력 받는다.
   - 입력된 값이 양수(자연수)가 아니라면, 양수가 입력될 떄까지 계속 숫자를 입력받는다.
   - 입력 받은 height에 따라 다음과 같은 모양을 출력한다.
   ```JAVA
   Enter the height : -1
   Enter the height : 0
   Enter the height : 3
   *   *
   ** **
   *****
   Enter the height : 5
   *      *
   **    **
   ***  ***
   ********
   ```

### __실습 2-3__
##### 
   올해 1월 1일이 어떤 요일인지 입력 받은 후, 달력을 출력하시오. 단 각 달의 시작부에 빈 칸이 발생하면 *로 채우고 2월은 28일이라고 가정한다.
######
   - 달력 출력 예시
   ```JAVA
   //달력은 "일월화수목금토"순서
   올해 1월 1일은 어떤 요일인가요 ? 화요일

   1월
   * * 1 2 3 4 5
   6 7 8 9 10 11 12
   13 14 15 16 17 18 19
   20 21 22 23 24 25 26
   27 28 29 30 31

   2월
   * * * * 1 2 3
   4 5 6 7 8 9 10
   11 12 13 14 15 16 17
   18 19 20 21 22 23 24
   25 26 27 28

   ```

## 실습 2. 배열
### __실습 3-1. 정렬 프로그램__
#####
   키보드로부터 정수 10개를 입력 받아 배열에 저장하고, 오름차순으로 정렬한 후 출력하는 프로그램을 작성하시오.
   [조건1] 사이즈가 10인 배열을 한 개만 사용할 것(다른 배열 선언 및 사용 불가)
   - 정렬 방법은 여러가지가 있으며, 반드시 본인이 직접 Pesudo code(알고리즘)를 작성한 후 구현할 것
   -[참고] 선택정렬(Selection sort)
   [조건2] 정렬 부분을 아래와 같은 sort()라는 이름의 메소드로 구현하시오.
   - static void sort(int[] arr) { }
### __실습 3-2. 로또 번호 생성기__
#####
   철수는 매주 로또 복권 5개를 구입하는데, 항상 "자동선택"으로 구입한다. 다섯 set의 로또 번호를 자동으로
   생성해주는 프로그램을 작성하시오.   

   [조건1] 5x6차원 배열을 생성한다. 다섯 개의 각 행에 속한 6개의 숫자가 1set의 로또 번호를 의미하며, 각 숫자는 1~45 사이의 랜덤 번호이다. 중복된 숫자는 없어야한다.
   -[참고] 랜덤 넘버 생성 방법

   ```text
   * 랜덤 넘버 생성
      double randomNumber = Math.random();
      범위: 0 <= randomNumber < 1
      a 이상 b 미만의 랜덤 정수 생성 방법
       int random = (int)(Math.random()*(b-a+1))+a;
   * 중복되지 않은 숫자로 배열 채우기
      int i = 0;
      while (i<array.length){
         // Make a number for the i-th index
         // Compare the i -th number
      }
   ```
   [조건2] 각 로또 set를 정렬하여 재저장한다. (앞에서 구현한 sort()메소드를 활용)
   [조건3] 5 set의 로또 번호를 출력한다 (정렬된 결과가 저장된 2차원 배열을 직접 출력)
   - static void sort(int[] arr) { }  

</div>
</details>
