# java-chess

체스 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## [1단계 미션]

### 기능 요구사항

- Piece
    - [x] 역할을 갖는다.
    - [x] 진영을 갖는다.
        - 진영은 검은색(대문자)과 흰색(소문자) 편으로 구분한다.

- Square
    - [x] 파일을 갖는다.
        - 가로 위치는 왼쪽부터 a ~ h이다.
    - [x] 랭크를 갖는다.
        - 세로 위치는 아래부터 1 ~ 8이다.

- Board
    - [x] 보드는 키가 Square이고 값이 Piece인 Map을 갖는다.
    - [x] 체스 게임을 할 수 있는 체스판을 초기화한다.

## [2단계 미션]

### 기능 요구사항

- Board
    - [x] 이동 경로상에 말이 존재할 경우 움직일 수 없다.
    - [x] 이동 경로상에 말이 존재하지 않고 이동 위치에 같은 팀 말이 존재하지 않고 이동하려는 말의 가동 범위 내에 있을 경우 이동할 수 있다.

- Pawn
    - [x] 앞으로 한 칸 움직일 수 있다.
    - [x] 대각선으로 움직일 수 있다.
    - [x] 움직인 적이 없을 경우 앞으로 두 칸 움직일 수 있다.

- Rook
    - [x] 사방으로 거리 제한 없이 움직일 수 있다.

- Knight
    - [x] 사방 중 한 방향으로 한 칸 그리고 그 방향의 양 대각선 방향 중 한 방향으로 움직일 수 있다.

- Bishop
    - [x] 대각선으로 거리 제한 없이 움직일 수 있다.

- Queen
    - [x] 사방과 대각선으로 거리 제한 없이 움직일 수 있다.

- King
    - [x] 사방과 대각선으로 한 칸씩 움직일 수 있다.

- Game
    - [x] 체스 말을 이동시킬 수 있다.
    - [x] 비어 있는 칸은 움직일 수 없다.
    - [x] 진영이 번갈아가며 이동시킨다.

## 컨벤션 요구사항

- [x] 한 메서드에 한 단계의 들여쓰기만 허용
- [x] else 사용 금지
- [x] 모든 원시값과 문자열 포장 (일회성 변수 제외)
- [x] 일급 컬렉션 적용
- [x] 2개 이하의 인스턴스 변수 사용
- [x] getter/setter 금지
- [x] 3개 이하의 메서드 인자 사용
- [x] 디미터 법칙 지키기
- [x] 메서드는 한 가지 역할만 담당
- [x] 클래스 작게 유지

## 피드백 요구사항

- [x] `Command`로 게임 흐름 제어하기

- [x] `start` 명령어 재입력시 게임 초기화 방지

- [x] `GameCommand` 클래스 패키징

- [x] Factory 형태로 체스판 생성

- [x] 예외 케이스 먼저 선언

- [x] 갈 수 있는 방향은 한 곳에서 관리하기

- [x] 각 말이 갈 수 있는 경로를 각자 갖고 있도록 하기

- [x] `GameCommand`의 뷰 의존성 제거

- [x] `Game`과 `Board` 사이의 턴 제어 역할 분리

- [x] 패키지 분리

- [x] `BoardFactory`를 정적 팩토리로 선언

- [x] `moveIfPawn` 매서드명 수정

- [x] `Empty` 객체 캐싱

- [x] 말에게 경로 상에 말이 있어도 갈 수 있는지 확인하는 책임 부여하기

- [x] `Square`와 `Move` 역할 분리

## [2단계 미션]

### 기능 요구사항

- [x] King이 잡힐 경우 게임을 종료해야 한다.

- [x] 말에 따른 게임 점수를 계산할 수 있다.

- [x] `status` 명령을 통해 각 진영의 점수와 게임 결과를 볼 수 있다.
