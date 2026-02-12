package Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Battle {

	// 공격을하면 체력이 빠짐
	// 공격은 방어의 수치의 영향을 받고
	// 특수공격은 특수방어의 영향을 받음
	// 스피드가 빠른쪽이 먼저 공격
	// 체력이 0이되면 교체
	// 체력은 공격-방어 혹은 특수공격-특수방어의 데미지 만큼 빠짐
	// 행동은 1.공격 2.특수공격 3.교체 4.기권
	
	
	Battle() {
		
		
		Trainer trainer = new Trainer();
		ArrayList<PoKeMonster> red = trainer.red; // trainer.red.get()를
		int redpoke = 0; // ()안에 들어갈 숫자
		ArrayList<PoKeMonster> green = trainer.green;
		int greenpoke = 0;
		Status status;
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		boolean loser = true;
		System.out.println("red size = " + red.size());
		System.out.println("green size = " + green.size());

		System.out.println("석영고원 챔피언의 방");
		System.out.println("챔피언 그린이 승부를 걸어왔다");

		while (loser) {
			boolean sw = false;
			System.out.println("레드는 무엇을 할까?");
			System.out.println("=====================================================");
			System.out.println("1.공격 2.특수공격 3.교체 4.기권");
			System.out.println("=====================================================");
			int choice = scan.nextInt();
			if (choice == 1) {
				if (red.get(redpoke).status.s > green.get(greenpoke).status.s) {// 레드선공
					System.out.println("red의" + red.get(redpoke) + "의 공격!");
					green.get(greenpoke).status.hp = green.get(greenpoke).status.hp
							- (red.get(redpoke).status.ac - green.get(greenpoke).status.df);
					System.out.println("green의" + green.get(greenpoke) + "는(은)"
							+ (red.get(redpoke).status.ac - green.get(greenpoke).status.df) + "만큼의 데미지를 입었다");
					if (green.get(greenpoke).status.hp <= 0) {// 그린의 포켓몬이 공격당해 hp가0이하가 됐을때
						loser = false;
						for (int p = 0; p < 6; p++) {
							if (green.get(p).status.hp > 0) {
								loser = true;
							}

						}
						if (!loser) {
							System.out.println("챔피언 green에게 승리했다");
							System.out.println("green: 이 몸이... 세계 최강인... 이 몸이 지다니!");
							break;
						} else if (green.get(greenpoke).status.hp <= 0) {
							System.out.println("수고했어" + green.get(greenpoke) + "돌아와");
							while (true) {
								int gs = (int) (Math.random() * 6);
								if (green.get(gs).status.hp > 0) {
									greenpoke = gs;
									System.out.println("가랏" + green.get(greenpoke));
									break;
								}

							}
						}
					}
					////////////////////////////////////////////////////////////////////////////////////
					int ga = (int) ((Math.random() * 3) + 1);// 그린의 행동
					if (ga == 1) {
						System.out.println("green의" + green.get(greenpoke) + "의 공격");
						red.get(redpoke).status.hp = red.get(redpoke).status.hp
								- (green.get(greenpoke).status.ac - red.get(redpoke).status.df);
						System.out.println("red의" + red.get(redpoke) + "는(은)"
								+ (green.get(greenpoke).status.ac - red.get(redpoke).status.df) + "만큼의 데미지를 입었다");
						if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
							loser = false;
							for (int p = 0; p < 6; p++) {
								if (red.get(p).status.hp > 0) {
									loser = true;
								}

							}
							if (!loser) {
								System.out.println("챔피언 green에게 패배했다");
								System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
								break;
							} else if (red.get(redpoke).status.hp <= 0)
								System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
							int rs = scan1.nextInt();
							redpoke = rs;
							System.out.println("널 믿어!!" + red.get(redpoke));
						}
					} else if (ga == 2) {
						System.out.println("green의" + green.get(greenpoke) + "의 특수공격!");
						red.get(redpoke).status.hp = red.get(redpoke).status.hp
								- (green.get(greenpoke).status.sa - red.get(redpoke).status.sd);
						System.out.println("red의" + red.get(redpoke) + "는(은)"
								+ (green.get(greenpoke).status.sa - red.get(redpoke).status.sd) + "만큼의 데미지를 입었다");
						if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
							loser = false;
							for (int p = 0; p < 6; p++) {
								if (red.get(p).status.hp > 0) {
									loser = true;
								}

							}
							if (!loser) {
								System.out.println("챔피언 green에게 패배했다");
								System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
								break;
							} else if (red.get(redpoke).status.hp <= 0)
								System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
							int rs = scan1.nextInt();
							redpoke = rs;
							System.out.println("널 믿어!!" + red.get(redpoke));
						}
					} else if (ga == 3) {
						System.out.println("green은 포켓몬을 교체했다");
						System.out.println("돌아와" + green.get(greenpoke) + "!!");
						for (int p = 0; p < 6; p++) {
							if (green.get(p).status.hp > 0) {		
								sw = true;
							}
						}
							
							while (sw) {
								int gs = (int) (Math.random() * 6);
								if (green.get(gs).status.hp > 0) {
									greenpoke = gs;
									System.out.println("가랏" + green.get(greenpoke));
									sw=false;
								}
							}
						

					} /////////////////////////////////////////////////////////
				} else if (red.get(redpoke).status.s < green.get(greenpoke).status.s) {// 그린선공
					int ga = (int) ((Math.random() * 3) + 1);
					if (ga == 1) {
						System.out.println("green의" + green.get(greenpoke) + "의 공격");
						red.get(redpoke).status.hp = red.get(redpoke).status.hp
								- (green.get(greenpoke).status.ac - red.get(redpoke).status.df);
						System.out.println("red의" + red.get(redpoke) + "는(은)"
								+ (green.get(greenpoke).status.ac - red.get(redpoke).status.df) + "만큼의 데미지를 입었다");
						if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
							loser = false;
							for (int p = 0; p < 6; p++) {
								if (red.get(p).status.hp > 0) {
									loser = true;
								}

							}
							if (!loser) {
								System.out.println("챔피언 green에게 패배했다");
								System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
								break;
							} else if (red.get(redpoke).status.hp <= 0)
								System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
							int rs = scan1.nextInt();
							redpoke = rs;
							System.out.println("널 믿어!!" + red.get(redpoke));
						}
						System.out.println("red의" + red.get(redpoke) + "의 공격");
						green.get(greenpoke).status.hp = green.get(greenpoke).status.hp
								- (red.get(redpoke).status.ac - green.get(greenpoke).status.df);
						System.out.println("green의" + green.get(greenpoke) + "는(은)"
								+ (red.get(redpoke).status.ac - green.get(greenpoke).status.df) + "만큼의 데미지를 입었다");
						if (green.get(greenpoke).status.hp <= 0) {// 그린의 포켓몬이 공격당해 hp가0이하가 됐을때
							loser = false;
							for (int p = 0; p < 6; p++) {
								if (green.get(p).status.hp > 0) {
									loser = true;
								}

							}
							if (!loser) {
								System.out.println("챔피언 green에게 승리했다");
								System.out.println("green: 이 몸이... 세계 최강인... 이 몸이 지다니!");
								break;
							} else if (green.get(greenpoke).status.hp <= 0) {
								System.out.println("수고했어" + green.get(greenpoke) + "돌아와");
								while (true) {
									int gs = (int) (Math.random() * 6);
									if (green.get(gs).status.hp > 0) {
										greenpoke = gs;
										System.out.println("가랏" + green.get(greenpoke));
										break;
									}

								}
							}
						} //////////////////// 여기부터 그린만////////////////////////////
					} else if (ga == 2) {
						System.out.println("green의" + green.get(greenpoke) + "의 특수공격!");
						red.get(redpoke).status.hp = red.get(redpoke).status.hp
								- (green.get(greenpoke).status.sa - red.get(redpoke).status.sd);
						System.out.println("red의" + red.get(redpoke) + "는(은)"
								+ (green.get(greenpoke).status.sa - red.get(redpoke).status.sd) + "만큼의 데미지를 입었다");
						if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
							loser = false;
							for (int p = 0; p < 6; p++) {
								if (red.get(p).status.hp > 0) {
									loser = true;
								}

							}
							if (!loser) {
								System.out.println("챔피언 green에게 패배했다");
								System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
								break;
							} else if (red.get(redpoke).status.hp <= 0)
								System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
							int rs = scan1.nextInt();
							redpoke = rs;
							System.out.println("널 믿어!!" + red.get(redpoke));
						}
						System.out.println("red의" + red.get(redpoke) + "의 공격");
						green.get(greenpoke).status.hp = green.get(greenpoke).status.hp
								- (red.get(redpoke).status.ac - green.get(greenpoke).status.df);
						System.out.println("green의" + green.get(greenpoke) + "는(은)"
								+ (red.get(redpoke).status.ac - green.get(greenpoke).status.df) + "만큼의 데미지를 입었다");
						if (green.get(greenpoke).status.hp <= 0) {// 그린의 포켓몬이 공격당해 hp가0이하가 됐을때
							loser = false;
							for (int p = 0; p < 6; p++) {
								if (green.get(p).status.hp > 0) {
									loser = true;
								}

							}
							if (!loser) {
								System.out.println("챔피언 green에게 승리했다");
								System.out.println("green: 이 몸이... 세계 최강인... 이 몸이 지다니!");
								break;
							} else if (green.get(greenpoke).status.hp <= 0) {
								System.out.println("수고했어" + green.get(greenpoke) + "돌아와");
								while (true) {
									int gs = (int) (Math.random() * 6);
									if (green.get(gs).status.hp > 0) {
										greenpoke = gs;
										System.out.println("가랏" + green.get(greenpoke));
										break;
									}

								}
							}
						}
					}else if (ga == 3) {
						System.out.println("green은 포켓몬을 교체했다");
						System.out.println("돌아와" + green.get(greenpoke) + "!!");
						for (int p = 0; p < 6; p++) {
							if (green.get(p).status.hp > 0) {		
								sw = true;
							}
						}
							
							while (sw) {
								int gs = (int) (Math.random() * 6);
								if (green.get(gs).status.hp > 0) {
									greenpoke = gs;
									System.out.println("가랏" + green.get(greenpoke));
									sw=false;
								}
							}
						System.out.println("red의" + red.get(redpoke) + "의 공격");
						green.get(greenpoke).status.hp = green.get(greenpoke).status.hp
								- (red.get(redpoke).status.ac - green.get(greenpoke).status.df);
						System.out.println("green의" + green.get(greenpoke) + "는(은)"
								+ (red.get(redpoke).status.ac - green.get(greenpoke).status.df) + "만큼의 데미지를 입었다");
						if (green.get(greenpoke).status.hp <= 0) {// 그린의 포켓몬이 공격당해 hp가0이하가 됐을때
							loser = false;
							for (int p = 0; p < 6; p++) {
								if (green.get(p).status.hp > 0) {
									loser = true;
								}

							}
							if (!loser) {
								System.out.println("챔피언 green에게 승리했다");
								System.out.println("green: 이 몸이... 세계 최강인... 이 몸이 지다니!");
								break;
							} else if (green.get(greenpoke).status.hp <= 0) {
								System.out.println("수고했어" + green.get(greenpoke) + "돌아와");
								while (true) {
									int gs = (int) (Math.random() * 6);
									if (green.get(gs).status.hp > 0) {
										greenpoke = gs;
										System.out.println("가랏" + green.get(greenpoke));
										break;
									}

								}
							}
						}
					}

				}
			}
				//////////////////////////////// 레드먼저//////////////////////////////////////////////
				else if (choice == 2) {
					if (red.get(redpoke).status.s > green.get(greenpoke).status.s) {
						System.out.println("red의" + red.get(redpoke) + "의 특수공격!");
						green.get(greenpoke).status.hp = green.get(greenpoke).status.hp
								- (red.get(redpoke).status.sa - green.get(greenpoke).status.sd);
						System.out.println("green의" + green.get(greenpoke) + "는"
								+ (red.get(redpoke).status.sa - green.get(greenpoke).status.sd) + "만큼의 데미지를 입었다");
						if (green.get(greenpoke).status.hp <= 0) {// 그린의 포켓몬이 공격당해 hp가0이하가 됐을때
							loser = false;
							for (int p = 0; p < 6; p++) {
								if (green.get(p).status.hp > 0) {
									loser = true;
								}

							}
							if (!loser) {
								System.out.println("챔피언 green에게 승리했다");
								System.out.println("green: 이 몸이... 세계 최강인... 이 몸이 지다니!");
								break;
							} else if (green.get(greenpoke).status.hp <= 0) {
								System.out.println("수고했어" + green.get(greenpoke) + "돌아와");
								while (true) {
									int gs = (int) (Math.random() * 6);
									if (green.get(gs).status.hp > 0) {
										greenpoke = gs;
										System.out.println("가랏" + green.get(greenpoke));
										break;
									}

								}
							}
						}
						int ga = (int) ((Math.random() * 3) + 1);// 그린의 행동
						if (ga == 1) {
							System.out.println("green의" + green.get(greenpoke) + "의 공격");
							red.get(redpoke).status.hp = red.get(redpoke).status.hp
									- (green.get(greenpoke).status.ac - red.get(redpoke).status.df);
							System.out.println("red의" + red.get(redpoke) + "는(은)"
									+ (green.get(greenpoke).status.ac - red.get(redpoke).status.df) + "만큼의 데미지를 입었다");
							if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
								loser = false;
								for (int p = 0; p < 6; p++) {
									if (red.get(p).status.hp > 0) {
										loser = true;
									}

								}
								if (!loser) {
									System.out.println("챔피언 green에게 패배했다");
									System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
									break;
								} else if (red.get(redpoke).status.hp <= 0)
									System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
								int rs = scan1.nextInt();
								redpoke = rs;
								System.out.println("널 믿어!!" + red.get(redpoke));
							}
						} else if (ga == 2) {
							System.out.println("green의" + green.get(greenpoke) + "의 특수공격!");
							red.get(redpoke).status.hp = red.get(redpoke).status.hp
									- (green.get(greenpoke).status.sa - red.get(redpoke).status.sd);
							System.out.println("red의" + red.get(redpoke) + "는(은)"
									+ (green.get(greenpoke).status.sa - red.get(redpoke).status.sd) + "만큼의 데미지를 입었다");
							if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
								loser = false;
								for (int p = 0; p < 6; p++) {
									if (red.get(p).status.hp > 0) {
										loser = true;
									}

								}
								if (!loser) {
									System.out.println("챔피언 green에게 패배했다");
									System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
									break;
								} else if (red.get(redpoke).status.hp <= 0)
									System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
								int rs = scan1.nextInt();
								redpoke = rs;
								System.out.println("널 믿어!!" + red.get(redpoke));
							}
						} else if (ga == 3) {
							System.out.println("green은 포켓몬을 교체했다");
							System.out.println("돌아와" + green.get(greenpoke) + "!!");
							for (int p = 0; p < 6; p++) {
								if (green.get(p).status.hp > 0) {		
									sw = true;
								}
							}
								
								while (sw) {
									int gs = (int) (Math.random() * 6);
									if (green.get(gs).status.hp > 0) {
										greenpoke = gs;
										System.out.println("가랏" + green.get(greenpoke));
										sw=false;
									}
								}
						}
					} else if (red.get(redpoke).status.s < green.get(greenpoke).status.s) {// 그린선공
						int ga = (int) ((Math.random() * 3) + 1);// 그린행동
						if (ga == 1) {
							System.out.println("green의" + green.get(greenpoke) + "의 공격");
							red.get(redpoke).status.hp = red.get(redpoke).status.hp
									- (green.get(greenpoke).status.ac - red.get(redpoke).status.df);
							System.out.println("red의" + red.get(redpoke) + "는(은)"
									+ (green.get(greenpoke).status.ac - red.get(redpoke).status.df) + "만큼의 데미지를 입었다");
							if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
								loser = false;
								for (int p = 0; p < 6; p++) {
									if (red.get(p).status.hp > 0) {
										loser = true;
									}

								}
								if (!loser) {
									System.out.println("챔피언 green에게 패배했다");
									System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
									break;
								} else if (red.get(redpoke).status.hp <= 0)
									System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
								int rs = scan1.nextInt();
								redpoke = rs;
								System.out.println("널 믿어!!" + red.get(redpoke));
							}
							System.out.println("red의" + red.get(redpoke) + "의 특수공격");
							green.get(greenpoke).status.hp = green.get(greenpoke).status.hp
									- (red.get(redpoke).status.sa - green.get(greenpoke).status.sd);
							System.out.println("green의" + green.get(greenpoke) + "는(은)"
									+ (red.get(redpoke).status.sa - green.get(greenpoke).status.sd) + "만큼의 데미지를 입었다");
							if (green.get(greenpoke).status.hp <= 0) {// 그린의 포켓몬이 공격당해 hp가0이하가 됐을때
								loser = false;
								for (int p = 0; p < 6; p++) {
									if (green.get(p).status.hp > 0) {
										loser = true;
									}

								}
								if (!loser) {
									System.out.println("챔피언 green에게 승리했다");
									System.out.println("green: 이 몸이... 세계 최강인... 이 몸이 지다니!");
									break;
								} else if (green.get(greenpoke).status.hp <= 0) {
									System.out.println("수고했어" + green.get(greenpoke) + "돌아와");
									while (true) {
										int gs = (int) (Math.random() * 6);
										if (green.get(gs).status.hp > 0) {
											greenpoke = gs;
											System.out.println("가랏" + green.get(greenpoke));
											break;
										}

									}
								}
							}
						} else if (ga == 2) {
							System.out.println("green의" + green.get(greenpoke) + "의 특수공격!");
							red.get(redpoke).status.hp = red.get(redpoke).status.hp
									- (green.get(greenpoke).status.sa - red.get(redpoke).status.sd);
							System.out.println("red의" + red.get(redpoke) + "는(은)"
									+ (green.get(greenpoke).status.sa - red.get(redpoke).status.sd) + "만큼의 데미지를 입었다");
							if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
								loser = false;
								for (int p = 0; p < 6; p++) {
									if (red.get(p).status.hp > 0) {
										loser = true;
									}

								}
								if (!loser) {
									System.out.println("챔피언 green에게 패배했다");
									System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
									break;
								} else if (red.get(redpoke).status.hp <= 0)
									System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
								int rs = scan1.nextInt();
								redpoke = rs;
								System.out.println("널 믿어!!" + red.get(redpoke));
							}
							System.out.println("red의" + red.get(redpoke) + "의 특수공격");
							green.get(greenpoke).status.hp = green.get(greenpoke).status.hp
									- (red.get(redpoke).status.sa - green.get(greenpoke).status.sd);
							System.out.println("green의" + green.get(greenpoke) + "는(은)"
									+ (red.get(redpoke).status.sa - green.get(greenpoke).status.sd) + "만큼의 데미지를 입었다");
							if (green.get(greenpoke).status.hp <= 0) {// 그린의 포켓몬이 공격당해 hp가0이하가 됐을때
								loser = false;
								for (int p = 0; p < 6; p++) {
									if (green.get(p).status.hp > 0) {
										loser = true;
									}

								}
								if (!loser) {
									System.out.println("챔피언 green에게 승리했다");
									System.out.println("green: 이 몸이... 세계 최강인... 이 몸이 지다니!");
									break;
								} else if (green.get(greenpoke).status.hp <= 0) {
									System.out.println("수고했어" + green.get(greenpoke) + "돌아와");
									while (true) {
										int gs = (int) (Math.random() * 6);
										if (green.get(gs).status.hp > 0) {
											greenpoke = gs;
											System.out.println("가랏" + green.get(greenpoke));
											break;
										}

									}
								}
							}
						} else if (ga == 3) {
							System.out.println("green은 포켓몬을 교체했다");
							System.out.println("돌아와" + green.get(greenpoke) + "!!");
							for (int p = 0; p < 6; p++) {
								if (green.get(p).status.hp > 0) {		
									sw = true;
								}
							}
								
								while (sw) {
									int gs = (int) (Math.random() * 6);
									if (green.get(gs).status.hp > 0) {
										greenpoke = gs;
										System.out.println("가랏" + green.get(greenpoke));
										sw=false;
									}
								}
						
							System.out.println("red의" + red.get(redpoke) + "의 특수공격");
							green.get(greenpoke).status.hp = green.get(greenpoke).status.hp
									- (red.get(redpoke).status.sa - green.get(greenpoke).status.sd);
							System.out.println("green의" + green.get(greenpoke) + "는(은)"
									+ (red.get(redpoke).status.sa - green.get(greenpoke).status.sd) + "만큼의 데미지를 입었다");
							if (green.get(greenpoke).status.hp <= 0) {// 그린의 포켓몬이 공격당해 hp가0이하가 됐을때
								loser = false;
								for (int p = 0; p < 6; p++) {
									if (green.get(p).status.hp > 0) {
										loser = true;
									}

								}
								if (!loser) {
									System.out.println("챔피언 green에게 승리했다");
									System.out.println("green: 이 몸이... 세계 최강인... 이 몸이 지다니!");
									break;
								} else if (green.get(greenpoke).status.hp <= 0) {
									System.out.println("수고했어" + green.get(greenpoke) + "돌아와");
									while (true) {
										int gs = (int) (Math.random() * 6);
										if (green.get(gs).status.hp > 0) {
											greenpoke = gs;
											System.out.println("가랏" + green.get(greenpoke));
											break;
										}

									}
								}
							}
						}
					}
				}
				//////////////////////// 그린///////////////////////////
				else if (choice == 3) {
					if (red.get(redpoke).status.s > green.get(greenpoke).status.s) {
						System.out.println("red는 포켓몬을 교체했다");
						System.out.println("돌아와" + red.get(redpoke) + "!!");
						System.out.println("어떤 포켓몬으로 교체하시겠습니까?");
						System.out.println("0피카츄 1.리자몽 2.이상해꽃 3.거북왕 4.라프라스 5.잠만보");
						int rs = scan1.nextInt();
						redpoke = rs;
						System.out.println("널 믿어!!" + red.get(redpoke));
						int ga = (int) ((Math.random() * 3) + 1);// 그린의 행동
						if (ga == 1) {
							System.out.println("green의" + green.get(greenpoke) + "의 공격");
							red.get(redpoke).status.hp = red.get(redpoke).status.hp
									- (green.get(greenpoke).status.ac - red.get(redpoke).status.df);
							System.out.println("red의" + red.get(redpoke) + "는(은)"
									+ (green.get(greenpoke).status.ac - red.get(redpoke).status.df) + "만큼의 데미지를 입었다");
							if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
								loser = false;
								for (int p = 0; p < 6; p++) {
									if (red.get(p).status.hp > 0) {
										loser = true;
									}

								}
								if (!loser) {
									System.out.println("챔피언 green에게 패배했다");
									System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
									break;
								} else if (red.get(redpoke).status.hp <= 0)
									System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
								rs = scan1.nextInt();
								redpoke = rs;
								System.out.println("널 믿어!!" + red.get(redpoke));
							}
						} else if (ga == 2) {
							System.out.println("green의" + green.get(greenpoke) + "의 특수공격!");
							red.get(redpoke).status.hp = red.get(redpoke).status.hp
									- (green.get(greenpoke).status.sa - red.get(redpoke).status.sd);
							System.out.println("red의" + red.get(redpoke) + "는(은)"
									+ (green.get(greenpoke).status.sa - red.get(redpoke).status.sd) + "만큼의 데미지를 입었다");
							if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
								loser = false;
								for (int p = 0; p < 6; p++) {
									if (red.get(p).status.hp > 0) {
										loser = true;
									}

								}
								if (!loser) {
									System.out.println("챔피언 green에게 패배했다");
									System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
									break;
								} else if (red.get(redpoke).status.hp <= 0)
									System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
								rs = scan1.nextInt();
								redpoke = rs;
								System.out.println("널 믿어!!" + red.get(redpoke));
							}
						} else if (ga == 3) {
							System.out.println("green은 포켓몬을 교체했다");
							System.out.println("돌아와" + green.get(greenpoke) + "!!");
							for (int p = 0; p < 6; p++) {
								if (green.get(p).status.hp > 0) {		
									sw = true;
								}
							}
								
								while (sw) {
									int gs = (int) (Math.random() * 6);
									if (green.get(gs).status.hp > 0) {
										greenpoke = gs;
										System.out.println("가랏" + green.get(greenpoke));
										sw=false;
									}
								}
						}

					} else if (red.get(redpoke).status.s < green.get(greenpoke).status.s) {// 그린선공
						int ga = (int) ((Math.random() * 3) + 1);// 그린의 행동
						if (ga == 1) {
							System.out.println("green의" + green.get(greenpoke) + "의 공격");
							red.get(redpoke).status.hp = red.get(redpoke).status.hp
									- (green.get(greenpoke).status.ac - red.get(redpoke).status.df);
							System.out.println("red의" + red.get(redpoke) + "는(은)"
									+ (green.get(greenpoke).status.ac - red.get(redpoke).status.df) + "만큼의 데미지를 입었다");
							if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
								loser = false;
								for (int p = 0; p < 6; p++) {
									if (red.get(p).status.hp > 0) {
										loser = true;
									}

								}
								if (!loser) {
									System.out.println("챔피언 green에게 패배했다");
									System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
									break;
								} else if (red.get(redpoke).status.hp <= 0)
									System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
								int rs = scan1.nextInt();
								redpoke = rs;
								System.out.println("널 믿어!!" + red.get(redpoke));
							}
							System.out.println("red는 포켓몬을 교체했다");
							System.out.println("돌아와" + red.get(redpoke) + "!!");
							System.out.println("어떤 포켓몬으로 교체하시겠습니까?");
							System.out.println("0피카츄 1.리자몽 2.이상해꽃 3.거북왕 4.라프라스 5.잠만보");
							int rs = scan1.nextInt();
							redpoke = rs;
							System.out.println("널 믿어!!" + red.get(redpoke));
						} else if (ga == 2) {
							System.out.println("green의" + green.get(greenpoke) + "의 특수공격!");
							red.get(redpoke).status.hp = red.get(redpoke).status.hp
									- (green.get(greenpoke).status.sa - red.get(redpoke).status.sd);
							System.out.println("red의" + red.get(redpoke) + "는(은)"
									+ (green.get(greenpoke).status.sa - red.get(redpoke).status.sd) + "만큼의 데미지를 입었다");
							if (red.get(redpoke).status.hp <= 0) {// 레드의 포켓몬이 공격당해 hp가0이하가 됐을때
								loser = false;
								for (int p = 0; p < 6; p++) {
									if (red.get(p).status.hp > 0) {
										loser = true;
									}

								}
								if (!loser) {
									System.out.println("챔피언 green에게 패배했다");
									System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
									break;
								} else if (red.get(redpoke).status.hp <= 0)
									System.out.println("수고했어" + red.get(greenpoke) + "돌아와");
								int rs = scan1.nextInt();
								redpoke = rs;
								System.out.println("널 믿어!!" + red.get(redpoke));
							}
							System.out.println("red는 포켓몬을 교체했다");
							System.out.println("돌아와" + red.get(redpoke) + "!!");
							System.out.println("어떤 포켓몬으로 교체하시겠습니까?");
							System.out.println("0피카츄 1.리자몽 2.이상해꽃 3.거북왕 4.라프라스 5.잠만보");
							int rs = scan1.nextInt();
							redpoke = rs;
							System.out.println("널 믿어!!" + red.get(redpoke));
						} else if (ga == 3) {
							System.out.println("green은 포켓몬을 교체했다");
							System.out.println("돌아와" + green.get(greenpoke) + "!!");
							for (int p = 0; p < 6; p++) {
								if (green.get(p).status.hp > 0) {		
									sw = true;
								}
							}
								
								while (sw) {
									int gs = (int) (Math.random() * 6);
									if (green.get(gs).status.hp > 0) {
										greenpoke = gs;
										System.out.println("가랏" + green.get(greenpoke));
										sw=false;
									}
								}
						
							System.out.println("red는 포켓몬을 교체했다");
							System.out.println("돌아와" + red.get(redpoke) + "!!");
							System.out.println("어떤 포켓몬으로 교체하시겠습니까?");
							System.out.println("0피카츄 1.리자몽 2.이상해꽃 3.거북왕 4.라프라스 5.잠만보");
							int rs = scan1.nextInt();
							redpoke = rs;
							System.out.println("널 믿어!!" + red.get(redpoke));
						}
					}
				}

				else if (choice == 4) {
					System.out.println("red는 승부에서 패배했다");
					System.out.println("green: 하하하! 챔피언 자리는 무리라는 거야! 나야말로 포켓몬 트레이너의 정점, 그린님이시다!");
					loser = false;
					break;

				}
			
		}
	}
}
