# Markdown 사용 설명서

**markdown**이란 **markup**에 반대 개념으로 최소한의 기호로 문서를 꾸밀 수 있도록 고안된 문법 체계이다.

# 제목 작성법
제목은 #이라는 기호를 이용하여 작성할 수 있다.  
개수는 1개부터 6개까지 사용할 수 있다.
일반적으로 1개부터 3개까지만 제목으로 쓰고 4개부터는 일반 글자보다 작아서 잘 사용하지 않는다.


# 대제목( #1개)
## 중제목(# 2개)
### 소제목(# 3개)

#코드 블록

프로그래밍 코드를 작성하고 싶다면 블록을 생성하고 블록 옆에 언어를 지정하여 작성할 수 있다.

```
일반적인 블록
```

언어를 설정한 코드 블록은 다음과 같다.

```java
for(int i=0, i < 10; i++) {
	System.out.prinln("Hello Java!");
	}
```

# 인용구

다른 사람이 했던 말 또는 글귀를 옮겨 적을 때 사용

> 나는 생각한다 고로 존재한다 - 데카르트

# 이미지

이미지는 이미지의 주소만 알 수 있다면 문서 내에 표시가 가능하다.

![설명](주소)

![우주사진](data:image/jpeg;base64,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)



# 링크 삽입

이 페이지가 아닌 외부로의 연결고리를 하이퍼링크(hyperlink)라고 부른다

```
[보여줄글자](주소)
```

[구글에서 자바 검색한 결과 보러가기](https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIGCAEQRRg7MhMIAhAuGIMBGMcBGLEDGNEDGIAEMg0IAxAAGIMBGLEDGIAEMg0IBBAAGIMBGLEDGIAEMg0IBRAAGIMBGLEDGIAEMg0IBhAAGIMBGLEDGIAEMgoIBxAAGLEDGIAEMg0ICBAAGIMBGLEDGIAE0gEJMTYwNGowajE1qAIAsAIA&sourceid=chrome&ie=UTF-8)  


# 목록 표시

목록은 크게 두가지로 나눠진다.

- 순서가 없는 목록(unorder list)
- 순서가 있는 목록(order list)

순서가 있는 목록은 다음과 같다.

1. 자바
2. 데이터베이스
3. 웹
4. 서버

목록은 중첩이 가능하다.  
탭키 또는 띄어쓰기 4번하면 하위 목록이 된다.  
(디스코드는 띄어쓰기 2번만 인정)

1. 첫번째항목
	- 세부항목1  
	- 세부항목2
2. 두번째항목
	- 세부항목1  
	- 세부항목2
3. 세번째항목
	- 세부항목1  
	- 세부항목2
	
# 체크리스트 만들기
	
 - [x] 공부하기
 - [] 운동하기
 - [] 복습하기
 - [x] 술마시기
 - [x] 게임하기

 # 표 만들기
 
 표는 제목을 먼저 만들고 구분선을 그은 뒤 내용을 작성한다.  
 크기 조절 등 디테일한 작업은 불가능하다.
 
 | 강좌명 | 강의시간 | 수강료 | 구분 |
 | :--- | :---: | ---: | :---: |
 | 자바 마스터과정 | 90 | 1000000 | 온라인 | 
 | 파이썬 기초 | 60 | 600000 | 온라인 | 
 | 웹 개발자 단기완성 | 120 | 1200000 | 오프라인 | 
 
 