package com.iwanvi.bookstore.appinterv2.common.exception;

/**
 * @Description Service异常
 * @author zzw
 * @date 2018年9月3日16:40:49
 */
public class ServiceException extends Exception {

	public ServiceException() {
		super();
	}

	public ServiceException(final String message) {
		super(message);
	}

	public ServiceException(final Throwable cause) {
		super(cause);
	}

	public ServiceException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ServiceException(final String message, final Throwable cause, final boolean enableSuppression,
							final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
