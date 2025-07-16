# artist-search
## 서비스의 목적 
- 아티스트를 검색하고, 검색 기록에 대한 랭킹을 볼 수 있도록 함

## 공부의 목적
- Spring Boot 로 REST API 서버를 구현하는 방법을 익힘
- 원본(?) API 와 Fallback API 를 사용하여 서로 다른 데이터를 하나의 형태로 반환하도록 하는 방법을 익힘
- 테스트 코드 작성 

---

## getArtist 함수 및 /artist 엔드포인트

- **엔드포인트**: `/artist`
- **HTTP Method**: `GET`
- **파라미터**: `name` (string) - 검색할 아티스트 이름
- **설명**: 아티스트 이름을 입력받아 해당 아티스트의 정보를 반환합니다.
- **Response**: 아티스트 정보 리스트 (JSON 배열, 각 요소는 Response 객체 형태)
  - **예시**:
    ```http
    GET /artist?name=touched
    ```
    ```json
      [
          {
              "artist_name": "터치드",
              "demographic": "혼성그룹",
              "majorsongs": "얼음요새 / Stand Up! / 야경 / 반딧불이 / Shut Down",
              "related_artists": "윤민 (기타, 보컬), 김승빈 (드럼), John B.Kim (베이스 기타), 채도현 (키보드), D.on (기타)"
          },
          {
              "artist_name": "Deep Touched",
              "demographic": "불명",
              "majorsongs": "",
              "related_artists": ""
          }
      ]
    ```
- **비고**: ManiaDBClientService를 통해 원본/백업 API에서 데이터를 받아 통합된 형태로 반환합니다.
