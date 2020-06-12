# PersonalProject_TextRPG
자바 콘솔 기반 텍스트 RPG게임 만들기. 개인 프로젝트.

### 클래스 설계
플레이어 패키지
  * Player{ 플레이어 이름; 레벨; 경험치; 체력; 공격력; 방어력; NPC들의 호감도(Hash Map); 장비; 스킬; 골드; }
  * Skill { 스킬 이름; 효과; 적용가능 레벨; }
  * Inventory { 아이템명; }
  * Equip { 장비이름; }
몬스터 패키지
  * Monster (추상클래스)
맵 패키지
  * Village { 마을 기본 메뉴; 서식 NPC; 상점; }
  * Dunjeon { 던전 기본 메뉴; 서식 몬스터; }
NPC 패키지
  * NPC (추상클래스) { 만남 이벤트; 호감도; }
  * Seller (아이템 상인) { 상인 기본 메뉴; 호감도; 파는 물건들; }
게임플레이 패키지
  * DualEvent { 전투 이벤트 }
  * GamePlayManager { 게임 플레이 컨트롤러 }
  * Main { 게임 시작 인터페이스 }

### 인터페이스 흐름도

### 개선사항 정리

### 튜토리얼 실행
