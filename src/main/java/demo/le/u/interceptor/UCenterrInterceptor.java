package demo.le.u.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UCenterrInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		Object obj = request.getSession().getAttribute("profile");
		boolean l = null != obj;
		if (!l) {
			response.sendRedirect(request.getServletContext().getContextPath() + "/login");
		}
		return l;
	}
}
