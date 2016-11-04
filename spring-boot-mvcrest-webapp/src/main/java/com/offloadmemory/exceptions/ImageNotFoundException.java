package com.offloadmemory.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Image fetching failed!")
public class ImageNotFoundException extends Exception{
	private static final long serialVersionUID = 100L;
}