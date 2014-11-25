package org.sagacity.util.http;

import javax.servlet.http.HttpServletRequest;

public class NetUtil {

	/**
	 * 取得客户端ip request.getRemoteAddr(),这种方法在大部分情况下都是有效的,但是在通过了Apache,nginx
	 * Squid等反向代理软件就不能获取到客户端的真实IP地址了.
	 * 如果使用了反向代理软件,用request.getRemoteAddr()方法获取的IP地址是
	 * :127.0.0.1或192.168.1.110,而并不是客户端的真实IP. *
	 * 经过代理以后,由于在客户端和服务器之间增加了中间层,因此服务器无法直接拿到客户端的IP,服务器端应用也无法直接通过转发请求的地址返回给客户端.
	 * 但是在转发请求的HTTP头信息中,增加了X-Real-IP信息,用以跟踪原有的客户端IP地址和原来客户端请求的服务器地址.
	 * 当我们访问index.jsp时,其实并不是我们浏览器真正访问到了服务器上的index.jsp文件,而是先由代理服务器去访问index.jsp,
	 * 代理服务器再将访问到的结果返回给我们的浏览器 *
	 * 
	 * @param request
	 * @param header
	 *            存放真实ip Header信息的名称, 默认为 X-Real-IP
	 * @return
	 */
	public static String getRemortIP(HttpServletRequest request, String header) {
		if (null == header) {
			header = "X-Real-IP";
		}

		if (request.getHeader(header) == null) {

			return request.getRemoteAddr();

		}

		return request.getHeader(header);

	}

	public static String getReferer(HttpServletRequest request) {

		if (request.getHeader("HTTP_REFERER") != null) {

			return request.getHeader("HTTP_REFERER");

		}

		return "直接访问";

	}

}
