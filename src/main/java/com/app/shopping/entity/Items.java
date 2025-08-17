package com.app.shopping.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Items {
	
	public Items() {
		
	}
	
	private String syohinCd;
	private int categoryId;
	private String name;
	private String email;
	private BigDecimal price;
	private int status;
	private String imagePath;
	private String createId;
	private LocalDateTime createAt;
	private String updateId;
	private LocalDateTime updateAt;
}
