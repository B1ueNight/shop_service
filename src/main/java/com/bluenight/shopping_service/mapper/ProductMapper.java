package com.bluenight.shopping_service.mapper;

import java.util.List;
import java.util.Map;

import com.bluenight.shopping_service.data.CartInfoVO;
import com.bluenight.shopping_service.data.ProductDescVO;
import com.bluenight.shopping_service.data.ProductDesclmageVO;
import com.bluenight.shopping_service.data.ProductImageVO;
import com.bluenight.shopping_service.data.ProductVO;
import com.bluenight.shopping_service.data.ReviewVO;
import com.bluenight.shopping_service.data.ShoppingCartVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    List<ProductVO> selectProductAll();
    List<ProductVO> selectRecommendList();
    List<ProductVO> selectProductByCateSeq(Integer seq);
    List<ProductVO> selectRecommendProdutBymember(Integer seq);
    List<Integer> selectProductCategories();

    List<ProductVO> selectProductByCateSeqList(List<Integer> seq_list, Integer offset);
    Integer selectProductCntByCateSeqList(List<Integer> seq_list);

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

    List<ProductVO> selectProductSearch(String keyword, Integer offset, String type);
    Integer selectProductSearchCnt(String keyword, String type);
    Map<String,Object> selectProductscore(Integer seq);

    List<ReviewVO> selectReviewList(Integer pi_seq, Integer offset, Integer mi_seq);
    Integer selectreviewCnt(Integer pi_seq);

    void updateReviewReport(Integer ri_seq);
    
}
