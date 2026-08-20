import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioStreamEx1 {

	public static void main(String[] args) {
		File audioFile= new File("itool-sample-wav.wav");

		try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
			
			// 1. 오디오 포맷 및 메타데이터 확인
			AudioFormat format = audioStream.getFormat();
			System.out.println("인코딩: " + format.getEncoding());
			System.out.println("샘플레이트: " + format.getSampleRate() + "Hz");
			System.out.println("채널 수: " + format.getChannels());
			
			// 2. Clip 객체 획득 및 스트림 열기
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			
			// 3. 재생 시작
			clip.start();
			System.out.println("재생 시작...");
			
			Thread.sleep(clip.getMicrosecondLength()/1000);
			clip.close();
			System.out.println("재생 완료");
			
			
		} catch(UnsupportedAudioFileException e) {
			System.out.println("지원하지 않는 오디오 포맷입니다: " + e.getMessage());
		} catch(IOException e) {
			System.out.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getLocalizedMessage());
		} catch(LineUnavailableException e) {
			System.out.println("오디오 라인을 열 수 없습니다: " + e.getMessage());
		} catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
