package models;

import java.util.ArrayList;
import java.util.List;

public class MessageValidator {

	public static List<String> validate(Message m) {
		// エラーリスト
		List<String> errors = new ArrayList<String>();
		// タイトルの確認
		String title_error = _validateTitle(m.getTitle());
		if (!title_error.equals("")) { errors.add(title_error); }
		// 内容の確認
		String content_error = _validateContent(m.getContent());
		if (!content_error.equals("")) { errors.add(content_error); }
		return errors;
	}

	// タイトルの確認
	private static String _validateTitle(String title) {
		if (title == null || title.equals("")) {
			return "タイトルを入力してください。";
		}
		return "";
	}

	// 内容の確認
	private static String _validateContent(String content) {
		if (content == null || content.equals("")) {
			return "メッセージを入力してください。";
		}
		return "";
	}
}
