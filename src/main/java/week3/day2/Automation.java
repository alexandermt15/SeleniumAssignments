package week3.day2;

public class Automation {
	public static void main(String args[]) {

		MultipleLanguage mul = new MultipleLanguage();
		mul.python();

		Language lang = new MultipleLanguage();
		lang.ruby();
		lang.Java();
		lang.javaScript();

		TestTool tt = new MultipleLanguage();
		tt.selenium();
	}

}