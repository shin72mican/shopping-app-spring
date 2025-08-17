package com.app.shopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.builder.annotation.ProviderMethodResolver;
import org.apache.ibatis.jdbc.SQL;

import com.app.shopping.entity.Items;

@Mapper
public interface ItemsMapper {
	
	@SelectProvider(ItemSqlProvider.class)
	@Results({
		@Result(property = "syohinCd", column = "syohin_cd"),
		@Result(property = "categoryId", column = "category_id"),
		@Result(property = "createId", column = "create_id"),
	    @Result(property = "createAt", column = "create_at"),
	    @Result(property = "updateAt", column = "update_at"),
	    @Result(property = "updateId", column = "update_id")
	})

	List<Items> findAll();
	
	public class ItemSqlProvider implements ProviderMethodResolver {
		// 商品データ - 全件取得
		public String findAll() {
			return new SQL() {{
				SELECT("i.syohin_cd, i.category_id, i.name, i.email, i.price, i.status, i.image_path, i.create_id, i.create_at, i.update_id, i.update_at");
				FROM("items i");
				WHERE("i.status = 0");
			}}.toString();
		}
	}
}
