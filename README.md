# 📘 웹프레임워크2 과제 – 학사 정보 시스템

## 🛠 기술 스택
- Java 21
- Spring Framework 6 (Spring MVC)
- JSP / JSTL
- Spring Data JPA
- MySQL 8
- Tomcat 10
- HTML + CSS (직접 커스터마이징)

---

## 📌 프로젝트 개요
Spring MVC 패턴을 기반으로 한 `학사 정보 시스템`을 구현한 프로젝트입니다.  
학생이 수강한 교과목을 DB에 저장하고, 이를 기반으로 학기별 이수 학점 총계 조회, 수강 신청 및 수강 신청 내역 조회 기능을 제공합니다.


https://github.com/user-attachments/assets/34e7c2d9-7501-4377-9b58-7124940ed535


---

## 📂 주요 기능

### 1. 학년별 이수 학점 조회
- **Controller**: `/credits`
- **기능**: 전체 학기의 이수 학점을 연도/학기 단위로 요약 출력
- **추가기능**: 상세보기 버튼을 통해 해당 학기 수강 내역 확인 가능

### 2. 수강 신청하기
- **Controller**: `/credits/register`  
- **기능**: 2025년 2학기 과목을 웹 폼을 통해 입력받아 DB에 저장  
- **유효성 검사**: 필수 항목 누락 시 에러 메시지 출력

### 3. 수강 신청 조회
- **Controller**: `/credits/2025/2`  
- **기능**: 2025년 2학기에 신청한 과목 목록을 표 형식으로 출력

---

## 🧩 주요 클래스 설명

### `Course.java`
- 교과목 정보를 담는 엔티티 클래스  
- 필드: year, semester, name, type, instructor, code, credit 등

### `CourseController.java`
- Spring MVC 기반의 요청 처리 컨트롤러  
- 요청 URL에 따라 화면 이동, 데이터 바인딩 처리 담당

### `CourseService.java`
- 비즈니스 로직 처리 클래스  
- JPA를 통해 DB와의 연결을 추상화하고, 복잡한 계산 로직 수행  
- `getCreditSummary()`, `getCoursesBySemester()` 등 핵심 기능 처리

### `CourseRepository.java`
- Spring Data JPA 인터페이스  
- 연도, 학기 조건을 기반으로 데이터를 효율적으로 조회  
- `@Query` 어노테이션으로 커스텀 쿼리 작성하여 요약 처리

---

## 📷 UI 예시

- **홈페이지**: 카드형 UI 메뉴 제공 (수강 신청, 학점 조회 등)
- **신청 폼**: CSS로 스타일링된 입력 폼 + 실시간 오류 표시
- **이수 학점 조회**: 테이블 형태의 깔끔한 학점 요약 화면

---

## ✍🏻 과제를 하며 느낀 점
이번 프로젝트를 통해 Spring MVC 아키텍처의 구성과 각 계층의 책임을 분리하는 방식에 대해 더 깊이 이해하게 되었습니다.  
특히 `Controller-Service-Repository` 구조와 유효성 검증 처리, JPA를 통한 데이터 관리 등 실무에 가까운 흐름을 연습할 수 있었던 값진 과제였습니다.  
프론트엔드 UI 구성도 직접 설계하며 사용자 경험(UI/UX)에 대해서도 고민할 수 있었습니다.

---

## 🧑🏻‍💻 제출자
- 담당 교수: 김남윤 교수님  
- 제출일자: 2025.04.20 (일)
