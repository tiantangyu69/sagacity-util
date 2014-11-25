package org.sagacity.util.http;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * CSRF 跨站请求伪装.
 * 
 * @author 0121
 */
public final class CSRFTokenUtil {

	public static final String TOKEN = "token";

	public static final String SS_TOKEN = CSRFTokenUtil.class.getName() + ".ssToken";

	public static String getSSToken(HttpSession session) {
		String token = null;
		synchronized (session) {
			token = (String) session.getAttribute(SS_TOKEN);
			if (null == token) {
				token = UUID.randomUUID().toString();
				session.setAttribute(SS_TOKEN, token);
			}
		}
		return token;
	}

	public static String getToken(HttpServletRequest request) {
		return request.getParameter(TOKEN);
	}

	private CSRFTokenUtil() { }

}