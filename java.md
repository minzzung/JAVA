# 📌Java
<details>

<summary>JAVA의 기본 프로그래밍(식별자/변수/상수/연산자)</summary>
<div markdown="1">

## ✏ JAVA의 기본 프로그래밍(1)


### ◽ 식별자
### ◽ 변수
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
   ![image](https://user-images.githubusercontent.com/87464723/150662320-b087ff09-da2e-4cd4-8bdc-5a9666f8383a.png)
 
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
   ![image](https://user-images.githubusercontent.com/87464723/150693292-ecc9c320-00db-4cff-a332-8b6304fb1410.png)

   - 부모와 자식이 같은 패키지에 있는 경우
   ![image](https://user-images.githubusercontent.com/87464723/150693304-9d68a7e4-4d0d-48cf-9ac4-67e74d9d2b03.png)

   - 부모와 자식이 다른 패키지에 있는 경우
   ![image](https://user-images.githubusercontent.com/87464723/150693313-837ad6f6-8cca-43c5-bb3a-3688e9238de3.png)

   
#### 👉 상속과생성자
   - 자식 클래스의 객체가 생성될 때
   ##### 
      1) 부모의 멤버변수와 자식의 멤버변수 모두 초기화 해야하므로 부모의 생성자 자식의 생성자 모두 실행한다.
      2) 자식클래스의 생성자가 먼저 호출되나, 부모가 있으면 부모의 생성자부터 먼저 실행한다.
   ###### - 생성자 호출 순서 및 실행 순서
   ![image](https://user-images.githubusercontent.com/87464723/150693357-4ea07fd8-13b4-4627-bdcf-c79b1bf8315d.png)

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





