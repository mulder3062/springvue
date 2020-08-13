# Springboot + Vue 예제

Springboot와 Vue 를 이용한 간단한 Todo 웹을 만들어본다.

# 사용 툴
* Node 13.7.0
* Vue cli 4.5.3
* Vue 2.6.11
* Springboot 2.3.2
* Springframework 5.2.8

# Node 설치
https://nodejs.org

# vue 설치
참고: https://cli.vuejs.org/guide/installation.html
```
npm install -g @vue/cli

or

yarn global add @vue/cli
```

설치 후 버전을 체크해보자
```
vue --version
```

# 프로젝트 설정
IntelliJ 2020.1을 기준으로 설명합니다.

IntellJ 실행 후 신규 프로젝트를 생성합니다.

![step-1](./docs/screenshot_1.png)
1단계

![step-2](./docs/screenshot_2.png)
2번째
Type을 Gradle Project를 선택합니다.
Java Version은 8으로 맞춰줍니다. (8 이상이면 문제없음)
 
![step-3](./docs/screenshot_3.png)
3단계

![step-4](./docs/screenshot_4.png)
4단계
Finish 버튼을 눌러 완료합니다.

# Thymeleaf 의존성 추가 
build.gradle에 Thymeleaf 의존성을 추가해줍니다.
```
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
    ...
}
```

# Vue 초기 설정
프로젝트 홈 경로에서 frontend 폴더를 생성합니다.

```npm install vue```

# 사용 툴

* Springboot 2.3.2
* Spring Thymeleaf 2.3.2
* Node.js 13.7.0
* Vue 2.6.11

