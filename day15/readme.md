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

![멋진사진](https://www.google.com/url?sa=i&url=https%3A%2F%2Fkr.123rf.com%2Fphoto_202544978_%25EB%25A9%258B%25EC%25A7%2584-%25EB%25B0%25B0%25EA%25B2%25BD%25ED%2599%2594%25EB%25A9%25B4%25EC%2597%2590%25EC%2584%259C-%25EC%2598%2581%25EA%25B0%2590%25EC%259D%2584-%25EB%25B0%259B%25EC%259D%2580-%25EB%25B8%2594%25EB%259E%2599%25ED%2599%2580-%25EC%259D%25BC%25EB%259F%25AC%25EC%258A%25A4%25ED%258A%25B8%25EB%25A0%2588%25EC%259D%25B4%25EC%2585%2598-%25ED%258C%2590%25ED%2583%2580%25EC%25A7%2580-%25EC%258A%25A4%25ED%2583%2580%25EC%259D%25BC-ai-%25EC%2583%259D%25EC%2584%25B1.html&psig=AOvVaw0KGH6KM7Sk42XcNpYDzOQB&ust=1703319208091000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCMDF44jNooMDFQAAAAAdAAAAABAD)

# 링크 삽입

이 페이지가 아닌 외부로의 연결고리를 하이퍼링크(hyperlink)라고 부른다

```
[보여줄글자](주소)
```

[구글에서 자바 검색한 결과 보러가기](https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIGCAEQRRg7MhMIAhAuGIMBGMcBGLEDGNEDGIAEMg0IAxAAGIMBGLEDGIAEMg0IBBAAGIMBGLEDGIAEMg0IBRAAGIMBGLEDGIAEMg0IBhAAGIMBGLEDGIAEMgoIBxAAGLEDGIAEMg0ICBAAGIMBGLEDGIAE0gEJMTYwNGowajE1qAIAsAIA&sourceid=chrome&ie=UTF-8)

#목록 표시

목록은 크게 두가지로 나눠진다.

- 순서가 없는 목록(unorder list)
- 순서가 있는 목록(order list)
