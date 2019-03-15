package com.lsp.oct;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsp.oct.base.BaseResult;
import com.lsp.oct.exception.BaseControllerException;
import com.lsp.oct.exception.BaseDaoException;
import com.lsp.oct.exception.BaseServiceException;
import com.lsp.oct.util.ConstantUtil;

/**
 * 全局异常处理
 * @author Administrator
 *
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

	/**
	 * service 异常处理
	 * @param request
	 * @param e
	 * @return
	 */
	@ExceptionHandler(BaseServiceException.class)
	public Object baseServiceExceptionHandler(HttpServletRequest request,Exception e) {
		return new BaseResult(ConstantUtil.SERVICE_ERROR_CODE, e.getMessage());
	}
	/**
	 * dao 异常处理
	 * @param request
	 * @param e
	 * @return
	 */
	@ExceptionHandler(BaseDaoException.class)
	public Object baseDaoExceptionHandler(HttpServletRequest request,Exception e) {
		return new BaseResult(ConstantUtil.DAO_ERROR_CODE, e.getMessage());
	}
	/**
	 * controller 异常处理
	 * @param request
	 * @param e
	 * @return
	 */
	@ExceptionHandler(BaseControllerException.class)
	public Object baseControllerExceptionHandler(HttpServletRequest request,Exception e) {
		return new BaseResult(ConstantUtil.CONTROLLER_ERROR_CODE, e.getMessage());
	}
}
