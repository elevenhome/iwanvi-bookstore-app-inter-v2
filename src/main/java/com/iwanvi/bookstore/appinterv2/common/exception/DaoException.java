package com.iwanvi.bookstore.appinterv2.common.exception;

/**
 * @Description Dao异常
 * @author zzw
 * @date 2018年9月3日16:40:23
 */
public class DaoException extends Exception {

	public DaoException() {
		super();
	}

	public DaoException(final String message, final Throwable cause, final boolean enableSuppression,
						final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DaoException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public DaoException(final String message) {
		super(message);
	}

	public DaoException(final Throwable cause) {
		super(cause);
	}
}
