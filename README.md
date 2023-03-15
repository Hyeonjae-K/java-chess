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

- Pawn
    - [x] 앞으로 한 칸 움직일 수 있다.
    - [x] 움직인 적이 없을 경우 앞으로 두 칸 움직일 수 있다.
    - [x] 대각선에 상대 말이 존재할 경우 대각선으로 움직일 수 있다.

- Rock
    - [ ] 사방으로 거리 제한 없이 움직일 수 있다.

- Knight
    - [ ] 사방 중 한 방향으로 한 칸 그리고 그 방향의 양 대각선 방향 중 한 방향으로 움직일 수 있다.

- Bishop
    - [ ] 대각선으로 거리 제한 없이 움직일 수 있다.

- Queen
    - [ ] 사방과 대각선으로 거리 제한 없이 움직일 수 있다.

- King
    - [ ] 사방과 대각선으로 한 칸씩 움직일 수 있다.
