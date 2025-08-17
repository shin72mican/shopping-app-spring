package com.app.shopping.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Items {
	
	public Items() {
		
	}
	
	@JsonProperty("syohin_cd")
	private String syohinCd;
	@JsonProperty("category_id")
	private int categoryId;
	private String name;
	private String email;
	private BigDecimal price;
	private int status;
	@JsonProperty("image_path")
	private String imagePath;
	@JsonProperty("create_id")
	private String createId;
	@JsonProperty("create_at")
	private LocalDateTime createAt;
	@JsonProperty("update_id")
	private String updateId;
	@JsonProperty("update_at")
	private LocalDateTime updateAt;
}
