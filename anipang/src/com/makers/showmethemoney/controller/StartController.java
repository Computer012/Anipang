package com.makers.showmethemoney.controller;

import com.makers.showmethemoney.model.game.BackgroundMusicSound;
import com.makers.showmethemoney.view.screen.StartView;

public class StartController {
	
	/********** gameView�� �����ϰ� ��������� �����Ű�� �޼ҵ� **********/
	public void gameStart() {
		new StartView();
		BackgroundMusicSound.loop();
	}
}