package dialogue;

import java.util.Scanner;
import gameBasic.GamePlayManager;

public class Openning {

	Scanner sc = new Scanner(System.in);
	GamePlayManager manager = new GamePlayManager();

	
	public void basicMenu() {
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒ D R E A M I N G , Y O U                     ▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒ 1. N E W  G A M E                           ▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒ 2. L O A D  G A M E                         ▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒ 3. E X I T                                  ▒▒▒▒▒▒");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	}

	
	public void dialogueNoname() {
		System.out.println("안녕. 나야.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("몇번째 '나'인지 물을 줄은 몰랐네. 글쎄...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("네가 몇번째 눈을 떴는지 세어 본 적 있어?");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("그치? 나도 똑같아.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("있지. 잠깐 걷지 않을래?");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1.걷는다.\t2.도망친다.");
	}
	
	public void choiceOne() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("정말? 기뻐.\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("|| 함께 호수로 갔다.");
		System.out.println("|| 호수의 물결을 내려다 보았다.");
		System.out.println("|| 호수에는 아무것도 비치치 않는다.");
		System.out.println("|| 저 존재도, 나도.\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("역시 아무것도 없이는 무리가 있네.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("내가 도와줄게. 다시 처음부터 시작하자.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("이름은 뭐가 좋을까?");
		return;
	}

	public void dialogueSecond() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("하하! 너무 형편없네. 이대로 돌아다니면 금방 죽고 말 걸.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("이제 됐어. 지금의 넌 신선하지만 재미는 없으니까 나중에 다시 놀자.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("저 쪽 숲 속 공방으로 가 봐.\n");
		System.out.println("|| 존재가 사라졌다.");
		System.out.println("|| 공방이 어디지?\n");
		System.out.println("1.공방을 찾는다.\t2. 호숫가를 돌아다닌다.");
	}
	
	
	public void tutorialMakePlayer() {
		while(true) {
			dialogueNoname();
			int choice=Integer.parseInt(sc.nextLine().trim());
			if(choice==1) {
				choiceOne();
				manager.creatPlayer();
				System.out.println("네 이름을 다시 한번 말해 줘.");
				String name = sc.nextLine();
				System.out.println("알았어, "+manager.showName(name)+". 존재가 생겨난 것을 축하해.\n");
				System.out.println("|| 호수에 내 모습이 비친다.\n");
				manager.showInfo(name);
				dialogueSecond();
				int search = Integer.parseInt(sc.nextLine().trim());
				

			} else {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("또 그냥 가는거야? 아쉽네...");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("|| 정신 없이 도망치다보니 혼자 남게 되었다. 어떻게 할까?");
				System.out.println("1.마을 밖으로 간다.\t2.마을을 둘러본다.");
				int num=sc.nextInt();
				if (num==1) {
					System.out.println("|| 마을 밖으로 나가 보았지만 아직 만들어지지 않은 나로서는 마을 밖 몬스터들을 당해낼 수가 없어.");
					System.out.println("|| 유감이야. 죽어버렸어.");
					System.out.println("|| 또 그 목소리가 시작되겠군...\n");
					System.out.println("▒▒▒▒▒▒ G A M E  O V E R ▒▒▒▒▒▒");
					for(int i=0; i<5; i++) {
						System.out.println(".");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					continue;
				} else if (num==2) {

				}
			}
		}
	}


}
