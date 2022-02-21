package com.bluenight.shopping_service.mapper;

import java.util.List;

import com.bluenight.shopping_service.data.CartInfoVO;
import com.bluenight.shopping_service.data.ProductDescVO;
import com.bluenight.shopping_service.data.ProductDesclmageVO;
import com.bluenight.shopping_service.data.ProductImageVO;
import com.bluenight.shopping_service.data.ProductVO;
import com.bluenight.shopping_service.data.ShoppingCartVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    List<ProductVO> selectProductAll();
    List<ProductVO> selectRecommendList();
    List<ProductVO> selectProductByCateSeq(Integer seq);
    List<Integer> selectProductCategories();

    ProductVO selectProductBySeq(Integer seq);
    List<ProductImageVO> selectProductImages(Integer seq);
    List<ProductDesclmageVO> selectProductDescImages(Integer seq);
    List<ProductDescVO> selectProductDesc(Integer seq);

    void insertProductToCart(ShoppingCartVO data);
    ShoppingCartVO selectShoppingCartItem(ShoppingCartVO data);
    void updateProductCountToCart(ShoppingCartVO data);
    void updateCartItemStatus(ShoppingCartVO data);
    void updateCartItemCount(Integer seq, Integer count);

    Integer selectShoppingCartItemCount(Integer member_seq);

    List<CartInfoVO> selectCartInfo(Integer seq);
    void updateCartItemStatusToDelete(Integer seq);

}
