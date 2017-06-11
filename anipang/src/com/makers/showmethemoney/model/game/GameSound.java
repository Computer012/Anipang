package com.makers.showmethemoney.model.game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GameSound {
	JTextField name[] = { // sound�� ��θ� �����ϴ� TextField
			new JTextField("enteredButton.wav"), // Button - entered�� �Ҹ�
			new JTextField("�����¼Ҹ�2.wav"), // Game - ���� ������ �Ҹ�
			new JTextField("���úҰ����Ҷ�.wav"), // Game - swap �Ұ� �Ҹ�
			new JTextField("�����ۻ��涧.wav"), // Game - ������ ���涧 �Ҹ�
			new JTextField("�����۾���2.wav"), // Game - ������ ���� �Ҹ�
			new JTextField("�������ھ�.wav") // Game - ���� ���ھ� �Ҹ�
			};
	File file[] = { 	// sound�� ��ȯ�Ͽ� ��Ƶ� File
			new File(name[0].getText()),
			new File(name[1].getText()),
			new File(name[2].getText()),
			new File(name[3].getText()),
			new File(name[4].getText()),
			new File(name[5].getText())
			};

	/********** i��°�� ����� �Ҹ��� ����ϴ� �޼ҵ� **********/
	public void startSound(int i) {
		try {
			AudioClip audioClip = Applet.newAudioClip(file[i].toURL());
			audioClip.play();
		} catch (MalformedURLException mue) {
			JOptionPane.showMessageDialog(name[i], "Wrong file name.", "Error Message", JOptionPane.ERROR_MESSAGE);
		}
	}
}