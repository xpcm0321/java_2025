#### 1. 2025-02-17
  1. welcome!
  2. git ( 로컬저장소 - 원격저장소 )
  3. Java ( 설치, eclipse )

---
#### 2. 2025-02-18
  1. 출력 (print, println, printf - 연산)
  2. 변수 (정수(byte, short, int★, long), 실수(float, double★))
     -> 자바 기본 처리단위 (정수 - int, 실수 - double)
  3. 자료형 (1) (기본형(실제 값 저장), 참조형(주소 값 저장))
     -> scanner

---
#### 3. 2025-02-19
  1. 자료형 (2) (형변환)
  2. 자료형 (3) (char, 유니코드)
  3. 연산자 (값 (+, -, *, /, %), 비교(>, <, >=, <=, ==, !=), 조건처리(&&, ||, 삼항연산자() ? :), 대입(=, +=, .....))

---
#### 4. 2025-02-20
  1. 조건문 (1) (프로그램 코드 실행흐름 위 → 아래, 왼쪽 → 오른쪽, 제어문은 개발자가 원하는 방향으로 변경할 수 있도록 도와줌)
  2. 제어문 (1) (조건문 (if, switch), 반복문 (for, while, do while), 제어키워드 (break, continue))
     -> 오늘은 조건문 (if, switch)만 배움!
  3. IF문
     -> 연습문제 1~8 (8번 문제는 숙제!)
  5. SWITCH문
     -> 연습문제 1~2

---
#### 5. 2025-02-21
  1. 조건문 (2) (프로그램 코드 실행흐름 위 → 아래, 왼쪽 → 오른쪽, 제어문은 개발자가 원하는 방향으로 변경할 수 있도록 도와줌)
  2. 제어문 (2) (조건문 (if, switch), 반복문 (for, while, do while), 제어키워드 (break, continue))
     -> 오늘은 반복문 (for, while(이론), do while(이론)), 제어키워드 (break, continue) 배움!
  3. FOR문
     -> 연습문제 1~5
  4. 미니프로젝트
     -> 은행계좌_추가, 조회, 입금, 출금, 삭제, 종료

---
#### 6. 2025-02-24
  1. 제어문 (3) (if, switch), 반복문 (for, while, do while), 제어키워드 (break, continue))
     -> 오늘은 반복문 (while, do while) 배움! (정확한 문법)
  2. FOR/while/do while문
     -> 연습문제 1~2
  3. Array(배열) ([같은 타입]의 데이터를 연속된 공간에 저장하는 자료구조, 각 데이터의 저장 위치는 [인덱스]를 통해서 접근)
     -> [heap-동적데이터]           [stack-임시데이터]
        1번지{1,     2,     3}    ←    arr 1번지
          arr[0] arr[1] arr[2]
  4. Array
     -> 연습문제 1~5
  5. bootstrap (소스 제공)
     -> https://www.w3schools.com/
  6. HTML 요소정리(1)
     -> 영역(div)잡고 제목(h1~h6)-내용(p)
     -> p - text
     -> p - img <img src="경로" alt="대체텍스트" />
     -> 링크 <a href="경로" title="네이버 포털사이트 바로가기">네이버</a>

     -> 순서 없는 항목 <ul><li>apple</li> <li>banana</li> <li>coconut</li></ul>
     -> 순서 있는 항목 <ol><li>계산을 한다.</li> <li>껍질을 깐다</li> <li>삼각김밥 먹기</li></ol>
     -> 설명 목록<dl><dt>apple?</dt> <dd>맛있는 먹거리</dd></dl>

---
#### 7. 2025-02-25
  1. Array
     -> 연습문제 6~14 (연습문제 14번은 복습 필수!!!!!!)
  2. HTML 요소정리(2)
     -> 이미지 태그 사용 (img scr="경로" alt="대체 이미지")
     -> 버튼 클릭이벤트 (onclick="")

---
#### 8. 2025-02-26
  1. Method(메서드) (1)
     -> 코드 재사용
     -> 실행하고자 하는 명령어들을 {} 안에 한꺼번에 모아놓고 메서드 이름이 호출되면 실행되는 기능
     -> function, method, 멤버함수
     -> 연습문제 1~4
  2. Method 사용법
     -> Step1) 함수정의
     -> Step1) 함수호출
  3. HTML 요소정리(3)
     -> document.getElementById(id).onclick(alert(''); alert(''));

---
#### 9. 2025-02-27
  1. Method(메서드) (2)
     -> 오버로딩
     -> (비슷한 동작을 수행하는) 메서드들을 [같은 이름]으로 일관되게 작업하는 것
     -> 파라미터 [타입]과 [개수]로 구분
     -> public, static, 리턴값은 오버로딩에 영향을 미치지 않음!

     ※ 참고사항 - 오버라이딩
     -> 상속 시 자식클래스에서 맞게 메서드를 수정
     -> 연습문제 1~2

  2. call by value vs call by reference
    - call by value : 전달받은 값을 복사해서 처리 / 원본 값은 변경되지 않음
    -> void show(int a) { System.out.println(a * 10); }
          show ( 1 ); // 10

    - call by reference : 전달받은 주소를 직접 참조해서 처리 / 원본 값은 변경됨
    -> int [] a = {1, 2, 3};
      void show(int [] a) { a[0] * 10; }
          show( a );
      System.out.println( a[0] );  // 10
  3. Class
     -> 자바 저장 단위 : 변수 < 배열 < 클래스
     -> OOP : 객체 지향 프로그래밍(부품객체(클래스) 조립 완성된 프로그램을 만드는 기법)
     -> 연습문제 1~2
  4. 클래스와 인스턴스
     -> 1) 클래스(설계도)틀로
     -> 2) 인스턴스화를 통해( new 실제 메모리-heap에 객체만들기)
     -> 3) 여러 개의 객체(인스턴스)를 만들기
     -> 클래스는 설계도
     -> 인스턴스는 실제로 만들어진 객체
  5. HTML 요소정리(4)
     -> document.querySelector("#b").onclick = () => {
        document.querySelector("#b").style.background="black";
        document.querySelector("#b").style.color="white";
      };
     
     -> document.querySelector(".c").onclick = () => {
        document.querySelector(".c").style.background="skyblue";
        document.querySelector(".c").style.color="blue";
      };

---
#### 2025-02-28
  1. 생성자
     -> new 연산자에 의해 호출 [초기화] 담당
  2. 기본 생성자(default 생성자)
     -> 모든 클래스에 생성자가 반드시 존재
     -> 생성자 선언을 생략 시 컴파일러가 자동으로 기본 생성자를 추가
     -> 개발자가 선언 시 컴파일러가 자동 생성 취소
  3. 생성자 형식
     -> class A {
          public A(){ //기본생성자
          public A(String name){}  //파라미터, argument가 있는 생성자
        }

     -> 리턴 값 없음 - 리턴 값 메서드명(파라미터)
     -> 클래스명과 동일
     -> 디폴트생성자를 생성해야하는 경우 : 오버로딩, 상속
     -> 연습문제 1~4

  4. runtime data area
     -> method : 정보 저장, static, final
     -> heap : 동적 저장 - new, gc(garbage collector)가 처리 소멸
     -> stack : 임시 값 저장

  5. static
     -> jvm 소스 로딩 시 메모리 할당 받음
     -> new 연산자보다 먼저 실행됭어 메모리(method 영역 : runtime)에 1회 생성
     -> 클래스명, 변수명 / 클래스명, 메서드명 - 클래스변수 / 클래스 메서드
     -> 객체 생성과 관련이 없음
     -> 인스턴스로 접근 시 권장사항이 아니므로 경고 발생
     -> 연습문제 1~2

---
#### 2025-03-04
  1. 멤버변수
     -> 연습문제 1
  2. final
     -> 연습문제 1
  3. 지정접근자
     -> 연습문제 1~2
  4. 클래스배열
     -> 클래스[] 배열명 = new 클래스[갯수];

  String[] arr = new String[3];
  A1 [] arr = new A1[3]; // [ null, null, null ]
  ※ null - 공간은 있지만 값이 비어있어!

  carr[0] = new A1();  ※ 생성자를 불러서 인스턴스변수를 초기화해 사용가능하게 만들기
  1번지{ name = ""; }  ← carr[0] 1번지

    -> 연습문제 1~2(2번은 아직 오류남!)

---
#### 2025-03-05
  1. 상속
     -> 클래스의 재사용 - 새로운 부분만 추가, 수정해서 사용
     -> 모든클래스는 Object 클래스를 상속
     -> UML - 부모 - 자식
     -> 장점 - 빠른 개발, 코드의 중복성 제거, 다형성(하나의 타입으로 여러 타입을 관리)
     -> 문법 : class 자식클래스 extends 부모클래스 (O) 단일 상속 | class 자식클래스 extends 부모클래스1, 부모클래스2 (X)
     -> 상속 시 부모속성을 사용할 수 있는 이유 : 부모 생성자를 호출해 부모의 인스턴스 변수를 초기화해 사용가능하게 만들어줌
     -> 오버라이드 : Override, 상속(extends) 시 부모의 메서드와 동일한지

  2. 클래스 다이어그램
     -> 시스템을 구성하는 클래스들 사이의 관계를 표현
     -> 클래스 - 객체를 생성하는 설계도
     
  3. 다형성
     -> 많은 형상을 띄는 성품
     -> 여러 타입의 객체를 하나의 타입으로 관리
     -> 연습문제 1~2

  4. HTML+CSS+JS
     -> font 속성(글자색:color, 글자사이즈:font-size, 기울이기:font-style:italic/normal, 굵게:font-weight:bold/normal, 글꼴:font-family)
     -> 문단 속성(행간:line-height, 정렬:text-align, 들여쓰기:text-indent, 밑줄:text-decoration:underline(밑줄)/none(밑줄쳐져있는 속성 없애기)/line-through(취소선), 자간(글자간격):letter-spacing

---
#### 2025-03-06
  1. Abstract
     -> 추상화 : 실체화된 객체들간의 공통되는 특성을 추출한 것
     -> 공통된 필드와 메서드의 이름을 통일할 목적
  2. Interface
     -> 개발코드와 객체사이 연결
     -> 개발코드 변경 없이 객체를 바꿔낄 수 있도록 하는 역할
     -> 추상화 정도가 abstract보다 interface가 더 높다

---
