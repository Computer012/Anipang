package com.makers.showmethemoney.model.game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GameSound {
	JTextField name[] = { // sound의 경로를 저장하는 TextField
			new JTextField("enteredButton.wav"), // Button - entered시 소리
			new JTextField("터지는소리2.wav"), // Game - 코인 터질때 소리
			new JTextField("선택불가능할때.wav"), // Game - swap 불가 소리
			new JTextField("아이템생길때.wav"), // Game - 아이템 생길때 소리
			new JTextField("아이템쓸때2.wav"), // Game - 아이템 사용시 소리
			new JTextField("최종스코어.wav") // Game - 최종 스코어 소리
			};
	File file[] = { 	// sound를 변환하여 담아둘 File
			new File(name[0].getText()),
			new File(name[1].getText()),
			new File(name[2].getText()),
			new File(name[3].getText()),
			new File(name[4].getText()),
			new File(name[5].getText())
			};

	/********** i번째에 저장된 소리를 출력하는 메소드 **********/
	public void startSound(int i) {
		try {
			AudioClip audioClip = Applet.newAudioClip(file[i].toURL());
			audioClip.play();
		} catch (MalformedURLException mue) {
			JOptionPane.showMessageDialog(name[i], "Wrong file name.", "Error Message", JOptionPane.ERROR_MESSAGE);
		}
	}
}
